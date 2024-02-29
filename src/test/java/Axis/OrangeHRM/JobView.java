package Axis.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class JobView extends LoginOHRM {
	@AfterMethod

	public void Job() {

		WebDriver driver = LoginOHRM.driver;

		WebElement MyInfo = driver.findElement(By.xpath("//span[text() = 'My Info']"));
		MyInfo.click();

		WebElement Job = driver.findElement(By.xpath("//a[text() = 'Job']"));
		Job.click();

		WebElement JobTitle = driver.findElement(By.xpath("//div[contains(text(),'HR Manager')]"));
		String title = JobTitle.getText();
		if (title.isEmpty()) {
            System.out.println("Job Title is not Visible");
        } else {
            System.out.println("Job Title is Visible");
        }
		
		WebElement JobCategory = driver.findElement(By.xpath("//div[contains(@class,'oxd-select-text-input')][.='Officials and Managers']"));
		String category = JobCategory.getText();
		if (category.isEmpty()) {
            System.out.println("Job Category is not Visible");
        } else {
            System.out.println("Job Category is Visible");
        }
		
		WebElement SubUnit = driver.findElement(By.xpath("//div[contains(@class,'oxd-select-text') and .//div[text()='Human Resources']]"));
		String subunit  = SubUnit .getText();
		if (subunit.isEmpty()) {
            System.out.println("Sub Unit is not Visible");
        } else {
            System.out.println("Sub Unit is Visible");
        }
		driver.close();

	}
}
