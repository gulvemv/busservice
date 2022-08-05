package LIbraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Utility_Class extends BasePage {
	// read the property file data
	public static String getTestData(String key) throws IOException {
		FileInputStream file = new FileInputStream("Properties//propertyfile.properties");
		Properties pr = new Properties();
		pr.load(file);
		String value = pr.getProperty(key);
		return value;
	}

	// screenshot capture
	//@AfterMethod
	public static void captureScreenshot(String path ) throws IOException {
	//	if(ITestResult.FAILURE==res.getStatus()) {
		try {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String date_time = d.toString().replace(":", "_");
		
		File dest = new File(Utility_Class.getTestData("screenshot") + date_time + " "  +path+ ".png");
		FileUtils.copyFile(src, dest);}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}

	// fetch the excel data
	public static String getPfData(int r, int c, String Sheet) throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream(Utility_Class.getTestData("excelpath"));
		Sheet sh = WorkbookFactory.create(file).getSheet(Sheet);
		// System.out.println(sh);
		String ReadExcelData = sh.getRow(r).getCell(c).getStringCellValue();
		// System.out.println(ReadExcelData);
		return ReadExcelData;
	}

	// count row
	public static int getRow(String Sheet) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("excelpath");
		Sheet sh = WorkbookFactory.create(file).getSheet(Sheet);
		int rows = sh.getLastRowNum();
		System.out.println("Total No of Rows = " + rows);
		return rows;

	}

	// Integer to String
	public static String intToString(int num) {
		String str = String.valueOf(num);
		return str;
	}
}
