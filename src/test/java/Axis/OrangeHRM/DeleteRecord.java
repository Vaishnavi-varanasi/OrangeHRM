package Axis.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class DeleteRecord extends LoginOHRM {
	  @AfterMethod
	  
	  	public void Deletefile() {
		  WebDriver driver = LoginOHRM.driver;
	  		
	  		WebElement MyInfo = driver.findElement(By.xpath("//span[text() = 'My Info']"));
	  		MyInfo.click();
	  		
	  		WebElement Immigration = driver.findElement(By.xpath("//a[text() = 'Immigration']"));
			Immigration.click();
	  		
	  		WebElement maincheck=driver.findElement(By.xpath("(//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"])[1]"));
	  		maincheck.click();
	  		
	  		WebElement delete=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]"));
	  		delete.click();
	  		System.out.println("Delete Message highlight by using chechkbox ");
	  		
	  		WebElement alertdel=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]"));
	  		
	  		alertdel.click();
	  		System.out.println("deleted by using icon");
	  		driver.close();
	  		
	  }
}
