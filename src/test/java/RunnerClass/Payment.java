package RunnerClass;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import LIbraryFiles.Utility_Class;
import pages.one_HomePage;
import pages.seven_travellerDetails;
import pages.six_email;
import pages.Eight_PhonePay;
import pages.Three_SelectBus;
import pages.four_SelectSets;
import pages.five_SetSelecting;
import pages.Two_SourceDistPOM;

public class Payment extends Utility_Class {
	@Test
	public void busPayments() throws Exception {
		one_HomePage hm = new one_HomePage(driver);
		hm.bustab();
		Two_SourceDistPOM sd = new Two_SourceDistPOM(driver);

		//Thread.sleep(2000);

		sd.source(Utility_Class.getPfData(1, 0, Utility_Class.getTestData("Sheetname")));
		sd.dist(Utility_Class.getPfData(1, 1, Utility_Class.getTestData("Sheetname")));
		String d = Utility_Class.getPfData(1, 4, Utility_Class.getTestData("Sheetname"));
		sd.dateExcel(d);
		sd.srcBtn();

		if (sd.textOnPopUp1().equals(Utility_Class.getTestData("PopLine"))) {
			sd.serAgainbtn();

			sd.source(Utility_Class.getPfData(2, 0, Utility_Class.getTestData("Sheetname")));
			sd.dist(Utility_Class.getPfData(2, 1, Utility_Class.getTestData("Sheetname")));
			String d1 = Utility_Class.getPfData(2, 4, Utility_Class.getTestData("Sheetname"));
			sd.dateExcel(d1);
			sd.srcBtn();

			four_SelectSets set = new four_SelectSets(driver);
			set.selectSetBtn();

			five_SetSelecting ss = new five_SetSelecting(driver);
			ss.selectSetOne();
			ss.selectBoardingPoint();
			ss.selectDroppingPoint();
			ss.continueBtn();

			//Thread.sleep(5000);

			six_email id = new six_email(driver);
			id.insuranceBtn();
			id.EmailId(Utility_Class.getTestData("EmailId"));
			id.continueBooking();

			seven_travellerDetails td = new seven_travellerDetails(driver);
			td.Title();
			td.firstName(Utility_Class.getPfData(1, 6, Utility_Class.getTestData("Sheetname")));
			td.lastName(Utility_Class.getPfData(1, 7, Utility_Class.getTestData("Sheetname")));
			td.age(Utility_Class.getPfData(1, 8, Utility_Class.getTestData("Sheetname")));
			td.mobileNo(Utility_Class.getPfData(1, 9, Utility_Class.getTestData("Sheetname")));
			td.continuesBtn();

			Thread.sleep(5000);

			Eight_PhonePay pp = new Eight_PhonePay(driver);
			pp.bookingDetails();
			pp.travellerDetails();
			pp.priceSummary();
			pp.selectWallet();
			pp.phonePayBtn();
			pp.makePayment();
			Assert.assertEquals(pp.pageTitle(), Utility_Class.getTestData("PhonePayTitle"));

		} else {

			four_SelectSets set = new four_SelectSets(driver);
			set.selectSetBtn();

			five_SetSelecting ss = new five_SetSelecting(driver);
			ss.selectSetOne();
			ss.selectBoardingPoint();
			ss.selectDroppingPoint();
			ss.continueBtn();

		//	Thread.sleep(5000);

			six_email id = new six_email(driver);
			id.insuranceBtn();
			id.EmailId(Utility_Class.getTestData("EmailId"));
			id.continueBooking();

			seven_travellerDetails td = new seven_travellerDetails(driver);
			td.Title();
			td.firstName(Utility_Class.getPfData(1, 6, Utility_Class.getTestData("Sheetname")));
			td.lastName(Utility_Class.getPfData(1, 7, Utility_Class.getTestData("Sheetname")));
			td.age(Utility_Class.getPfData(1, 8, Utility_Class.getTestData("Sheetname")));
			td.mobileNo(Utility_Class.getPfData(1, 9, Utility_Class.getTestData("Sheetname")));
			td.continuesBtn();

		Thread.sleep(5000);

			Eight_PhonePay pp = new Eight_PhonePay(driver);
			pp.bookingDetails();
			pp.travellerDetails();
			pp.priceSummary();
			pp.selectWallet();
			pp.phonePayBtn();
			pp.makePayment();
			
		}
	}
}
