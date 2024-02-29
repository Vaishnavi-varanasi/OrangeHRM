package Axis.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class AddImmigrationValid extends LoginOHRM{
	@AfterMethod(groups = {"group1"})
	public void AddImmigration(){
		WebDriver driver = LoginOHRM.driver;

		WebElement MyInfo =  driver.findElement(By.xpath("//span[text() = 'My Info']"));
		MyInfo.click();
		
		
		WebElement Immigration = driver.findElement(By.xpath("//a[text() = 'Immigration']"));
		Immigration.click();
		
		WebElement AddButton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		AddButton.click();
		
		/*
		 * WebElement radio1 = driver.findElement(By.
		 * xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]"
		 * )); radio1.click();
		 */

		
		WebElement DocumentNum = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		DocumentNum.click();
		DocumentNum.sendKeys("VV1607");
		
		WebElement IssueDate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
		IssueDate.click();
		IssueDate.sendKeys("2021-04-02");
		
		WebElement ExpiryDate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
		ExpiryDate.click();
		ExpiryDate.sendKeys("2025-08-02");

		WebElement EligibleStatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
		EligibleStatus.click();
		EligibleStatus.sendKeys("yes");

		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("This is a Comment");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		
		System.out.println("Immigration Record Added Successfully");
		driver.close();
  }
}
