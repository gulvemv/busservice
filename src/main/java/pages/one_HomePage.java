package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class one_HomePage {

	WebDriver driver;
	// xpath for bus tab
	private By BusTab = By.xpath("(//div[@class='emt_nav'])[1]//li[5]");

	public one_HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Click action perform on Bus tab
	public void bustab() {
 		driver.findElement(BusTab).click();
	}

}
