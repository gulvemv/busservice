package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import LIbraryFiles.Utility_Class;

public class six_email {
	WebDriver driver;
	// xpath for bus tab

	private By InsuranceBtn = By.xpath("(//span[@class='checkmark-radio'])[2]");
	private By EmailId = By.xpath("//input[@id='trvlEmail']");
	private By BusBookSS = By.xpath("(//div[@class='bor'])[1]");
	private By TicketSS = By.xpath("(//div[@class='bor'])[3]");
	private By ContinueBooking = By.xpath("//span[contains(text(),'Continue Booking')]");

	public six_email(WebDriver driver) {
		this.driver = driver;
	}

	// ScreenShot for Single Bus
	public void busBookScreenShot() throws IOException {
		File f = driver.findElement(BusBookSS).getScreenshotAs(OutputType.FILE);
		Date date_time = new Date();
		String d = date_time.toString().replace(":", "_");
		File de = new File(Utility_Class.getTestData("screenshot") + d + ".png");
		FileUtils.copyFile(f, de);
	}

	// ScreenShot for Single Bus
	public void ticketScreenShot() throws IOException {
		File f = driver.findElement(TicketSS).getScreenshotAs(OutputType.FILE);
		Date date_time = new Date();
		String d = date_time.toString().replace(":", "_");
		File de = new File(Utility_Class.getTestData("screenshot") + d + ".png");
		FileUtils.copyFile(f, de);
	}

	// Click action perform on Bus tab
	public void insuranceBtn() throws Exception {
		Thread.sleep(2000);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",InsuranceBtn);
		driver.findElement(InsuranceBtn).click();
	}

	public void EmailId(String id) throws Exception {
		Thread.sleep(2000);
		driver.findElement(EmailId).sendKeys(id);

	}

	public void continueBooking() throws Exception {
		Thread.sleep(2000);
		driver.findElement(ContinueBooking).click();

	}

}
