package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import LIbraryFiles.Utility_Class;

public class Three_SelectBus {

	WebDriver driver;
	// All locator
	private By BusName = By.xpath("(//div[@class='bus-detail'])[1]/span[1]");
	private By BusType = By.xpath("(//div[@class='bus-detail'])[1]/span[2]");
	private By BusDepart = By.xpath("(//div[@class='busDepart'])[1]/p[1]");
	private By BusDepCity = By.xpath("(//div[@class='busDepart'])[1]/p[2]");
	private By BusDuration = By.xpath("(//div[@class='busDurtn'])[1]/p[1]");
	private By BusReach = By.xpath("(//div[@class='busDepart'])[2]/p[1]");
	private By BusReachCity = By.xpath("(//div[@class='busDepart'])[2]/p[2]");
	private By BusRs = By.xpath("(//div[@class='busFare ng-scope'])[1]/p[2]");
	private By BusRsDiscount = By.xpath("(//div[@class='busFare ng-scope'])[1]/p[3]");
	private By ScreenShotSmartBus = By.xpath("(//div[@class='list_box ng-scope'])[1]");
	private By ScreenShotRegularBus = By.xpath("(//div[@class='list_box'])[1]");

	public Three_SelectBus(WebDriver driver) {
		this.driver = driver;
	}

	// print all bus details
	public void busName() {
		System.out.println("Bus Name = " + driver.findElement(BusName).getText());
		System.out.println("Bus Type = " + driver.findElement(BusType).getText());
		System.out.println("Bus Depart = " + driver.findElement(BusDepart).getText());
		System.out.println("Bus Depcity = " + driver.findElement(BusDepCity).getText());
		System.out.println("Time Duration = " + driver.findElement(BusDuration).getText());
		System.out.println("Bus Reach time = " + driver.findElement(BusReach).getText());
		System.out.println("Bus ReachCity = " + driver.findElement(BusReachCity).getText());
		System.out.println("Bus original Rs = " + driver.findElement(BusRs).getText());
		System.out.println("Bus discount Rs = " + driver.findElement(BusRsDiscount).getText());

	}
	

	// ScreenShot for Single Bus
	public void screenShotRegularBus() throws IOException {
		File f = driver.findElement(ScreenShotRegularBus).getScreenshotAs(OutputType.FILE);
		Date date_time = new Date();
		String d = date_time.toString().replace(":", "_");
		File de = new File(Utility_Class.getTestData("screenshot") + d + ".png");
		FileUtils.copyFile(f, de);
	}

}
