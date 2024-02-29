
package Axis.OrangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class AddAttachment extends LoginOHRM{
	@AfterMethod
	public void Attachment(){
		
		WebDriver driver = LoginOHRM.driver;
		
		WebElement MyInfo = driver.findElement(By.xpath("//span[text() = 'My Info']"));
		MyInfo.click();
		
		WebElement Immigration = driver.findElement(By.xpath("//a[text() = 'Immigration']"));
		Immigration.click();
		
		WebElement AddButton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[2]"));
		AddButton.click();
		
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));

		upload.sendKeys("C:\\Users\\hp\\Downloads/Manual++Project.pdf");
		
		
		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		comments.click();
		comments.sendKeys("Attachment Added");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		
		System.out.println("Attachment Added Successfully");
		driver.close();
		
		
	}
}
