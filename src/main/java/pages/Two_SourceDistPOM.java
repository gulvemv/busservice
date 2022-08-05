package pages;

import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import LIbraryFiles.Utility_Class;

public class Two_SourceDistPOM {
	WebDriver driver;
	// locator All element
	private By Source = By.xpath("//input[@id='txtSrcCity']");
	private By Dist = By.xpath("//input[@id='txtDesCity']");
	private By Date = By.xpath("//input[@id='datepicker']");
	private By Month = By.xpath("//div[@class='ui-datepicker-title']/span[1]");
	private By Year = By.xpath("//div[@class='ui-datepicker-title']/span[2]");
	private By daylist = By.xpath("//table/tbody/tr/td");
	private By NextBtn = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	private By SrcBtn = By.xpath("//input[@class='bsrc-btn']");
	private By SrcAgain = By.xpath("(//a[@class='modi-srec3'])[1]");
	private By symbolTag = By.xpath("(//a[@class='emt_logo'])[1]");
	// Search Again
	private By TextOnPopUp = By.xpath("(//span[@class='oop-txt'])[1]");

	public Two_SourceDistPOM(WebDriver driver) {
		this.driver = driver;
	}

	// click and sendkey action perform on source
	public void source(String ser) throws Exception {
		Thread.sleep(2000);
		driver.findElement(Source).click();
		driver.findElement(Source).sendKeys(ser);
	}

	// click and sendkey action perform on Distination
	public void dist(String dis) throws Exception {
		Thread.sleep(2000);
		driver.findElement(Dist).click();
		driver.findElement(Dist).sendKeys(dis);
	}

	// click action perform on date
	public void dateExcel(String date) throws Exception {
		Thread.sleep(2000);
		driver.findElement(Date).click();
		driver.findElement(By.xpath("//a[contains(text(),'" + date + "')]")).click();

	}

	// date select month,year,day
	public void dateSelect(String actMont, String actYear, String actDay) throws Exception {
		Thread.sleep(2000);

		while (true) {
			String month = driver.findElement(Month).getText();
			String year = driver.findElement(Year).getText();

			if (month.equalsIgnoreCase(actMont) && year.equalsIgnoreCase(actYear)) {
				List<WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
				for (WebElement e : daylist) {
					if (e.getText().equals(actDay)) {
						e.click();
						break;
					}

				}

				break;

			} else {
				driver.findElement(NextBtn).click();
				Thread.sleep(2000);
			}
		}
	}

	// click on search button
	public void srcBtn() throws Exception {
		Thread.sleep(2000);
		driver.findElement(SrcBtn).click();
		Thread.sleep(5000);
	}

	// click on search again button
	public String serAgain() {
		return driver.findElement(SrcAgain).getText();
	}

	public String textOnPopUp1() {

		return driver.findElement(TextOnPopUp).getText();
	}

	public void serAgainbtn() {
		driver.findElement(SrcAgain).click();

	}

	public void dateProp() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Date).click();

	}

}
