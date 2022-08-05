package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import LIbraryFiles.Utility_Class;

public class seven_travellerDetails {
	WebDriver driver;
	// xpath for bus tab

	private By Title = By.xpath("//select[@id='title0']");
	private By FirstName = By.xpath("//input[@id='firstname0']");
	private By LastName = By.xpath("//input[@id='lastname0']");
	private By Age = By.xpath("//input[@id='age0']");
	private By MobileNo = By.xpath("//input[@id='TrvlMobileNo']");
	private By ContinuesBtn = By.xpath("//input[@value='Continue Booking']");
	public seven_travellerDetails(WebDriver driver) {
		this.driver = driver;
	}

	public void Title() throws IOException, Exception {
		Thread.sleep(2000);
		driver.findElement(Title).click();
		Select sel = new Select(driver.findElement(Title));
		sel.selectByVisibleText("Mr");

	}

	public void firstName(String Fname) throws IOException, Exception {
		Thread.sleep(2000);
		driver.findElement(FirstName).sendKeys(Fname);

	}
	public void lastName(String Lname) throws IOException, Exception {
		Thread.sleep(2000);
		driver.findElement(LastName).sendKeys(Lname);

	}
	public void age(String ages) throws IOException, Exception {
		Thread.sleep(2000);
		driver.findElement(Age).click();
		driver.findElement(Age).sendKeys(ages);

	}
	public void mobileNo(String MobileNo1) throws IOException, Exception {
		Thread.sleep(2000);
		driver.findElement(MobileNo).sendKeys(MobileNo1);

	}
	public void continuesBtn() throws IOException, Exception {
		Thread.sleep(2000);
		driver.findElement(ContinuesBtn).click();

	}
	public String pageTitle() throws Exception {
		Thread.sleep(2000);
		return driver.getTitle();
		
	}


}
