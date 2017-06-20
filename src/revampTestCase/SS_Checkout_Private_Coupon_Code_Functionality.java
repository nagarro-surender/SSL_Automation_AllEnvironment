package revampTestCase;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.BaseClass;
import appModules.Cart_Action;
import appModules.CheckOut_Action;
import appModules.Login_App;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import utility.JyperionListener;


@Listeners(JyperionListener.class)
public class SS_Checkout_Private_Coupon_Code_Functionality {

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
		Log.info(sTestCaseName + " Test case to be executed");

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
			System.out.println("Starting Test Case : " + sTestCaseName);
			Login_App.execute(iTestCaseRow);
			Utils.removeAllItemFromCart();
			CheckOut_Action.HappyPathFlowTillCartPage(iTestCaseRow);
			CheckOut_Action.HappyPathFlowFromCartPageToDeliveryAddressPage(iTestCaseRow);
			CheckOut_Action.validateNumberOfDefaultPaymentMode();
			CheckOut_Action.Verify_Private_ChecoutPage_ApplyCoupan(iTestCaseRow);
			if (!BaseClass.errorValidation.isEmpty()) {
				Log.error("Exception in Class Cart_Action ");
				throw new Exception(BaseClass.errorValidation);
			}
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.result);
			Log.info("Verification for product count in mini cart for guest user successfull");
			Utils.captureScreenshot(sTestCaseName, "Pass", "Verify item count for guest user Screenshot");
		} catch (Exception e) {
			Log.info("Verification for product count in mini cart for guest user failed");
			ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.result);
			Utils.captureScreenshot(sTestCaseName, "Fail", "Failed");
			Log.error(e.getMessage());
			throw e;
		}
	}

	@AfterMethod
	public void afterMethod() {

		Log.endTestCase(sTestCaseName);
		Driver.quit();

	}

}
