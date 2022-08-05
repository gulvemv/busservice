//package RunnerClass;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import LIbraryFiles.Utility_Class;
//import pages.Eight_PhonePay;
//import pages.Two_SourceDistPOM;
//import pages.five_SetSelecting;
//import pages.four_SelectSets;
//import pages.one_HomePage;
//import pages.seven_travellerDetails;
//import pages.six_email;
//
//public class MultiTestAnnotation extends Utility_Class {
//	@Test(priority = 1)
//	public void busPayments() throws Exception {
//		one_HomePage hm = new one_HomePage(driver);
//		hm.Bustab();
//	}
//
//	@Test(priority = 2)
//	public void srcAndDist() throws Exception {
//		Two_SourceDistPOM sd = new Two_SourceDistPOM(driver);
//		sd.source(Utility_Class.getPfData(1, 0, Utility_Class.getTestData("Sheetname")));
//		sd.dist(Utility_Class.getPfData(1, 1, Utility_Class.getTestData("Sheetname")));
//		String d = Utility_Class.getPfData(1, 4, Utility_Class.getTestData("Sheetname"));
//		sd.dateExcel(d);
//		sd.srcBtn();
//	}
//
//	@Test(priority = 3)
//	public void SelectSets() throws Exception {
//
//		four_SelectSets set = new four_SelectSets(driver);
//		set.selectSetBtn();
//	}
//
//	@Test(priority = 4)
//	public void SetSelecting() throws Exception {
//		five_SetSelecting ss = new five_SetSelecting(driver);
//		ss.selectSetOne();
//		ss.selectBoardingPoint();
//		ss.selectDroppingPoint();
//		ss.continueBtn();
//	}
//
//	// Thread.sleep(5000);
//	@Test(priority = 5)
//	public void email() throws Exception {
//		six_email id = new six_email(driver);
//		id.insuranceBtn();
//		id.EmailId(Utility_Class.getTestData("EmailId"));
//		id.continueBooking();
//	}
//
//	@Test(priority = 6)
//	public void travellerDetails() throws Exception {
//		seven_travellerDetails td = new seven_travellerDetails(driver);
//		td.Title();
//		td.firstName(Utility_Class.getPfData(1, 6, Utility_Class.getTestData("Sheetname")));
//		td.lastName(Utility_Class.getPfData(1, 7, Utility_Class.getTestData("Sheetname")));
//		td.age(Utility_Class.getPfData(1, 8, Utility_Class.getTestData("Sheetname")));
//		td.mobileNo(Utility_Class.getPfData(1, 9, Utility_Class.getTestData("Sheetname")));
//		td.continuesBtn();
//		Assert.assertEquals(td.pageTitle(), Utility_Class.getTestData("PhonePayTitle"));
//		
//	}
//
//	@Test(priority = 7)
//	public void PhonePay() throws Exception {
//		Thread.sleep(5000);
//
//		Eight_PhonePay pp = new Eight_PhonePay(driver);
//		pp.bookingDetails();
//		pp.travellerDetails();
//		pp.priceSummary();
//		pp.selectWallet();
//		pp.phonePayBtn();
//		pp.makePayment();
//		Assert.assertEquals(pp.pageTitle(), Utility_Class.getTestData("PhonePayTitle"));
//	}
//
//}
