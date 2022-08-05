package RunnerClass;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LIbraryFiles.Utility_Class;
import pages.one_HomePage;
import pages.Three_SelectBus;
import pages.Two_SourceDistPOM;

public class MultiRunner extends Utility_Class {
	@Test
	public void busSelectExcel() throws Exception {
		one_HomePage hm = new one_HomePage(driver);
		hm.bustab();

		Two_SourceDistPOM sd = new Two_SourceDistPOM(driver);
		for (int i = 1; i <= 3; i++) {
			Thread.sleep(2000);
			sd.source(Utility_Class.getPfData(i, 0, Utility_Class.getTestData("Sheetname")));
			sd.dist(Utility_Class.getPfData(i, 1, Utility_Class.getTestData("Sheetname")));

			String d = Utility_Class.getPfData(i, 4, Utility_Class.getTestData("Sheetname"));
			// int a = Integer.parseInt(d);
			sd.dateExcel(d);
			sd.srcBtn();

			if (sd.textOnPopUp1().equals(Utility_Class.getTestData("PopLine"))) {
				sd.serAgainbtn();
			} else {
				Three_SelectBus SB = new Three_SelectBus(driver);
				SB.busName();

			}
			Three_SelectBus SB = new Three_SelectBus(driver);
			SB.screenShotRegularBus();
			one_HomePage hm1 = new one_HomePage(driver);
			hm1.bustab();
		}

	}
}
