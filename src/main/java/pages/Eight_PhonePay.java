package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import LIbraryFiles.Utility_Class;

public class Eight_PhonePay {
	WebDriver driver;
	//xpath for bus tab
	private By SelectWallet = By.linkText("Wallets");
	private By PhonePayBtn = By.xpath("(//span[@class='checkmark_ntb'])[8]");
	private By MakePayment = By.xpath("(//div[@class='mk-pym4'])[1]");
	private By BookingDetails= By.xpath("//div[@class='fd-l3 m-bt']");
	private By TravellerDetails= By.xpath("(//div[@class='bor po-re'])[2]");
	private By PriceSummary= By.xpath("(//div[@class='bor'])[3]");
	
	public Eight_PhonePay(WebDriver driver) {
		this.driver = driver;
	}
	//Click action perform on Bus tab
	
	public void selectWallet() throws Exception {
		Thread.sleep(6000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeSelected(SelectWallet));
//		
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		Actions at = new Actions(driver);
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
	      Thread.sleep(5000);
		
		driver.findElement(SelectWallet).click();
	}
	public void phonePayBtn() throws Exception {
		Thread.sleep(2000);
		driver.findElement(PhonePayBtn).click();
	}
	public void makePayment() throws Exception {
		Thread.sleep(2000);
		driver.findElement(MakePayment).click();
	}
	public String pageTitle() throws Exception {
		Thread.sleep(2000);
		return driver.getTitle();
		
	}
	// ScreenShot for Single Bus
	public void bookingDetails() throws IOException, Exception {
		Thread.sleep(4000);
		File f = driver.findElement(BookingDetails).getScreenshotAs(OutputType.FILE);
		Date date_time = new Date();
		String d = date_time.toString().replace(":", "_");
		File de = new File(Utility_Class.getTestData("screenshot") + d + ".png");
		FileUtils.copyFile(f, de);
	}
	public void travellerDetails() throws IOException, Exception {
		Thread.sleep(4000);
		File f = driver.findElement(TravellerDetails).getScreenshotAs(OutputType.FILE);
		Date date_time = new Date();
		String d = date_time.toString().replace(":", "_");
		File de = new File(Utility_Class.getTestData("screenshot") + d + ".png");
		FileUtils.copyFile(f, de);
	}
	public void priceSummary() throws IOException, Exception {
		Thread.sleep(4000);
		File f = driver.findElement(PriceSummary).getScreenshotAs(OutputType.FILE);
		Date date_time = new Date();
		String d = date_time.toString().replace(":", "_");
		File de = new File(Utility_Class.getTestData("screenshot") + d + ".png");
		FileUtils.copyFile(f, de);
	}
	
}
