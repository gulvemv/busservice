package RunnerClass;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.*;

import LIbraryFiles.BasePage;
import LIbraryFiles.Utility_Class;
import pages.Three_SelectBus;
import pages.Two_SourceDistPOM;
import pages.one_HomePage;



public class RunclasssTest extends BasePage{

//	@AfterMethod
//	public void screenShots(ITestResult result) throws Exception {
//		if (ITestResult.FAILURE == result.getStatus()) {
//			String res = result.getMethod().getMethodName();
//			captureScreenshot();
//		}
//	}



	@Test
	public void busSelect() throws Exception {

		one_HomePage hm = new one_HomePage(driver);
		hm.bustab();

		Two_SourceDistPOM sd = new Two_SourceDistPOM(driver);
		sd.source(Utility_Class.getTestData("Source_City"));
		sd.dist(Utility_Class.getTestData("Destination_city"));
		sd.dateProp();
		sd.dateSelect(Utility_Class.getTestData("Month"), Utility_Class.getTestData("Year"),
				Utility_Class.getTestData("Day"));
		sd.srcBtn();

		Three_SelectBus SB = new Three_SelectBus(driver);
		SB.busName();		
		SB.screenShotRegularBus();
		
	}
	
}
