package revampTestCase;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import appModules.HomePage_Action;

import pageObjects.BaseClass;
import pageObjects.Home_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.JyperionListener;
import utility.Log;
import utility.Utils;
@Listeners(JyperionListener.class)
public class SS_Public_Verify_HomePage_Banners {
	

		public WebDriver Driver;
		private String sTestCaseName;
		private int iTestCaseRow;

			@BeforeSuite
			public void setSnapShotFolder() throws Exception {
				Utils.setSnapshotFolder();

			}

			@BeforeMethod
			public void BeforeMethod() throws Exception {
				DOMConfigurator.configure("log4j.xml");

				sTestCaseName = Utils.getTestCaseName(this.toString());
				Log.info(sTestCaseName + " Test case to be excuted");
				ExcelUtils.setExcelFile(Utils.ReadProperties(Constant.Path_ConfigProperties).getProperty("Path_TestData")
						+ Constant.File_TestData, "Sheet1");
				iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.testCaseName);

				Log.info("New driver instantiated " + iTestCaseRow);
				Log.startTestCase(sTestCaseName);
				Driver = Utils.OpenBrowser(iTestCaseRow);
				new BaseClass(Driver);
			}

			@Test
			public void main() throws Exception {
				try {
					System.out.println("Starting Test Case :  --" + sTestCaseName);
			System.out.println("Starting Test Case : " +sTestCaseName);
			HomePage_Action.HomePage_Click_On_All_Bannerlinks(Home_Page.NewArrivals(),1);
			HomePage_Action.HomePage_Click_On_All_Bannerlinks(Home_Page.OfferZone(),2);
			HomePage_Action.HomePage_Click_On_All_Bannerlinks(Home_Page.FavBanner(),3);
			HomePage_Action.HomePage_Click_On_All_Bannerlinks(Home_Page.FavBrands(),4);
			if(BaseClass.bResult==false){
				throw new Exception();
			}

		} catch (Exception e) {
			Log.error("Unable to click on All Footer Links");
			ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.result);
			Utils.captureScreenshot(sTestCaseName, "Fail", "Failed");
			Log.error(e.getMessage());
			throw (e);
		}
	}

	@AfterMethod
	public void afterMethod() {

		Log.endTestCase(sTestCaseName);
		Driver.quit();
	
	}
}
