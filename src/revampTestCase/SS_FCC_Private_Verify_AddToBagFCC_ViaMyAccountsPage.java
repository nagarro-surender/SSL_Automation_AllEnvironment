package revampTestCase;



import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.Cart_Page;
import pageObjects.Checkout_Page;
import pageObjects.Home_Page;
import pageObjects.MiniCart_Page;
import appModules.CheckOut_Action;
import appModules.FCC_Action;
import appModules.HomePage_Action;
import appModules.Login_App;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import utility.JyperionListener;


/**
 * 
 * <h2 style="text-align:center;">SS_FCC_Private_Verify_AddToBagFCC_ViaMyAccountsPage</h2>
 * <p style="font-size:19px"><b>Description -</b>This Test Case verifies adding FCC card to bag from My Accounts page.</p>
 * <TABLE width="100%" border="1">
 * <caption style="font-size:17px">List of columns used from excel file</caption>
 * <tr><th>Parameters</th><th>Description</th></tr>
 * <tr><td>browser</td><td>Browser name in which test execution starts</td></tr>
 * <tr><td>emailId</td><td>User email Id</td></tr>
 * <tr><td>password</td><td>User password</td></tr> 
 * <tr><td>confirmPassword</td><td>Confirm password for registration purpose</td></tr> 
 * <tr><td>productCategory</td><td>Product category available on main menu</td></tr>
 * <tr><td>productSubCategory</td><td>Product sub category available under the main menu</td></tr>
 * <tr><td>title</td><td>Title detail for FCC registration form</td></tr>
 * <tr><td>firstName</td><td>First Name for FCC registration form</td></tr>
  * <tr><td>lastName</td><td>Last Name for FCC registration form</td></tr>
  * <tr><td>alternativeFirstName</td><td>Name on card for FCC registration form</td></tr>
  * <tr><td>DOB</td><td>DOB for FCC registration form</td></tr>
  * <tr><td>homeSTD</td><td>Home STD code for FCC registration form</td></tr>
  * <tr><td>officeSTD</td><td>Office STD code for FCC registration form</td></tr>
  * <tr><td>homeLandline</td><td>Home Landline for FCC registration form</td></tr>
  * <tr><td>officeLandline</td><td>Office LAndline for FCC registration form</td></tr>
  * <tr><td>mobileNumber</td><td>Mobile Number for FCC registration form</td></tr>
  * <tr><td>address</td><td>Address for delivery option on checkout page</td></tr>
  * <tr><td>landmark</td><td>Landmark for delivery option on checkout page</td></tr>
  * <tr><td>postCode</td><td>PostCode for delivery option on checkout page</td></tr>
   *</table>
 * <br>
 * <br>
 * 
 */ 
@Listeners(JyperionListener.class)
public class SS_FCC_Private_Verify_AddToBagFCC_ViaMyAccountsPage {
	
	public WebDriver Driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	@BeforeSuite
	public void BeforeSuite() throws Exception{
		Utils.setSnapshotFolder();
	}

	@BeforeMethod
	public void BeforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		sTestCaseName = Utils.getTestCaseName(this.toString());
		Log.info("Test case to be executed: "+ sTestCaseName);
		ExcelUtils.setExcelFile(Utils.ReadProperties(Constant.Path_ConfigProperties).getProperty("Path_TestData")
				+ Constant.File_TestData, "Sheet1");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.testCaseName);

		Log.startTestCase(sTestCaseName);
		Driver = Utils.OpenBrowser(iTestCaseRow);
		new BaseClass(Driver);
	}

	@Test
	public void main() throws Exception {
		try {
		
		Login_App.execute(iTestCaseRow);
		Log.info("Log in successfull for Registered User");		
		
		Utils.removeAllItemFromCart();
		Utils.mouseHover(Home_Page.LoginRegister());
		Utils.jsClick(Home_Page.MyAccount());
		Log.info("My Shoppers Stop link clicked on Home Page");	
		
		FCC_Action.FCC_Verify_AddToBagFCC_ViaMyAccountPage(iTestCaseRow);		
		Log.info("FCC added to cart successfully");
		
		Thread.sleep(3000);

//		MiniCart_Page.MiniCartProductDetails.MiniCartViewBag().click();
//		Log.info("View bag button on mini cart clicked successfully");
//
//		Cart_Page.CheckoutButton().click();
//		Log.info("Checkout button on Cart Page clicked successfully");
		
		Utils.jsClick(Cart_Page.CheckoutButtonOnMiniCartFCC());
		Log.info("Checkout button on Cart Page clicked successfully");

		Utils.verifyElement(Checkout_Page.TopNavigation.CheckOutText());
		Log.info("User successfully reached to Checkout page");

		CheckOut_Action.ProceedwithNewAddress(iTestCaseRow);
		Utils.verifyElement(Checkout_Page.Paymentinfo.PaymentClass());
		Log.info("Payment information tab is visible");
		
        
		//CheckOut_Action.PaymentOption(iTestCaseRow);
//		
//		Home_Page.headerSoppersStopLogocheckout().click();
//		Thread.sleep(2000);
//		Home_Page.headerMiniCartIcon().click();
//		Thread.sleep(2000);
//        Home_Page.headerMiniCartIconclose().click();
		if(BaseClass.bResult==true){
			Log.info("Verification for buying FCC for registere user from My accounts page successfull");
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.result);
		}else{
			
			throw new Exception("Test Case Failed because of Verification");
		}
		
		} catch (Exception e) {
			Log.error("Verification for buying FCC for registere user from My accounts page failed");
			ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.result);
			Utils.captureScreenshot(sTestCaseName, "Fail", "Failed");
			Log.error(e.getMessage());
			throw (e);
		}
	}

	@AfterMethod
	public void afterMethod() {

		Log.endTestCase(sTestCaseName);

		Driver.close();
		Driver.quit();

	}

}