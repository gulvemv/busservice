package RunnerClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LIbraryFiles.Utility_Class;

public class Abc {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", Utility_Class.getTestData("chromepath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

}
