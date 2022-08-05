package LIbraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.reporters.jq.Main;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {
	public static WebDriver driver;

	// Browser Open
	@BeforeTest(alwaysRun=true)
	public WebDriver InitializeBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", Utility_Class.getTestData("chromepath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Utility_Class.getTestData("url"));
		return driver;
	}

	// Browser Close
	@AfterTest(alwaysRun=true)
	public WebDriver browserClose() throws IOException {
		driver.close();
		return driver;
	}
}
