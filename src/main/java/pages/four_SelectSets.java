package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class four_SelectSets {
	WebDriver driver;
	//xpath for bus tab
	private By SelectSetBtn = By.xpath("(//a[text()='Select Seats'])[2]");

	public four_SelectSets(WebDriver driver) {
		this.driver = driver;
	}
	//Click action perform on Bus tab
	public void selectSetBtn() {
		driver.findElement(SelectSetBtn).click();
	}



}
