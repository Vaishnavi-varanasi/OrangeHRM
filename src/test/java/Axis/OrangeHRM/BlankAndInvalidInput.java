package Axis.OrangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class BlankAndInvalidInput extends LoginOHRM {

	@AfterMethod
	public void InvalidCreds() {
		WebDriver driver = LoginOHRM.driver;

		WebElement MyInfo = driver.findElement(By.xpath("//span[text() = 'My Info']"));
		MyInfo.click();
		
		WebElement Immigration = driver.findElement(By.xpath("//a[text() = 'Immigration']"));
		Immigration.click();
		
		WebElement AddButton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		AddButton.click();

		WebElement DocumentNum = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		DocumentNum.click();
		DocumentNum.sendKeys("");

		WebElement IssueDate = driver.findElement(By.xpath("(//input[contains(@class, 'oxd-input') and @placeholder='yyyy-dd-mm'])[1]"));
		IssueDate.click();
		IssueDate.sendKeys("2024-02-02");
		
		WebElement ExpiryDate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
		ExpiryDate.click();
		ExpiryDate.sendKeys("2023-08-02");

		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();

		WebElement ErrorNum = driver.findElement(By.xpath("//span[text() = 'Required']"));
		String text = ErrorNum.getText();
		String expectedTxt = "Required";
		if (text.equals(expectedTxt)) {
			System.out.println("Blank Document Number is not allowed");
		}

		WebElement ErrorExp = driver
				.findElement(By.xpath("//span[text() = 'Expiry date should be after issued date']"));
		String text1 = ErrorExp.getText();
		String expectedTxt1 = "Expiry date should be after issued date";
		if (text1.equals(expectedTxt1)) {
			System.out.println("Expiry date should be after issued date");
		}

	}

}
