package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import LIbraryFiles.Utility_Class;

public class five_SetSelecting {
	WebDriver driver;
	// xpath for bus tab
	private By SelectSetOne = By.xpath("(//div[@class='sleeper_normal'])[1]");
//	private By SelectSetTwo = By.xpath("(//div[@class='sleeper_normal'])[2]");
	private By ClickOnBoardingPoint = By.xpath("//a[@id='selectBoard']");
	private By SelectBoardingPoint = By.xpath("//ul[@id='seatBpPoint']/li[1]");
	private By ClickOnDroppingPoint = By.xpath("//a[@id='selectDrop']");
	private By SelectOnDroppingPoint = By.xpath("//ul[@id='seatDropUL']/li[1]");
	private By ContinueBtn = By.xpath("//a[contains(text(),'Continue')]");
	private By PriceScreenShot = By.xpath("//div[@class='ttl_amt']");

	public five_SetSelecting(WebDriver driver) {
		this.driver = driver;
	}

	// Click action perform on Bus tab
	public void selectSetOne() throws Exception {
		Thread.sleep(10000);
		driver.findElement(SelectSetOne).click();
	}

//	public void selectSetTwo() {
//
//		driver.findElement(SelectSetTwo).click();
//	}

	public void selectBoardingPoint() throws Exception {
		Thread.sleep(2000);
		driver.findElement(ClickOnBoardingPoint).click();
		driver.findElement(SelectBoardingPoint).click();

	}

	public void selectDroppingPoint() throws Exception {
		Thread.sleep(2000);
		driver.findElement(ClickOnDroppingPoint).click();
		driver.findElement(SelectOnDroppingPoint).click();
	}

	public void continueBtn() throws Exception {
		Thread.sleep(2000);
		driver.findElement(ContinueBtn).click();
	}
	// ScreenShot for Single Bus
	public void ticketScreenShot() throws IOException {
		File f = driver.findElement(PriceScreenShot).getScreenshotAs(OutputType.FILE);
		Date date_time = new Date();
		String d = date_time.toString().replace(":", "_");
		File de = new File(Utility_Class.getTestData("screenshot") + d + ".png");
		FileUtils.copyFile(f, de);
	}

}
