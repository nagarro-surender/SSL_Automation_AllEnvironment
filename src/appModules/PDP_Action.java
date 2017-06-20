package appModules;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageObjects.BaseClass;
import pageObjects.Home_Page;
import pageObjects.MiniCart_Page;
import pageObjects.MyAccount_Page;
import pageObjects.ProductDetails_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

// This is called Modularization, when we club series of actions in to one Module

public class PDP_Action {

	// iTestcaseRow is the row number of our Testcase name in the Test Data
	// sheet

	public static void Product_VerifyDetails() throws Exception {

		try {
			Utils.verifyElement(ProductDetails_Page.Product.Product_Name());
			Log.info("Verification Pass: Product Name found");

		} catch (Exception e) {
			Log.error("Product name is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product name is not present \n";
		}
		try{
			Utils.verifyElement(ProductDetails_Page.Product.Next_Arrow());
		}
		catch(Exception ex){
			BaseClass.errorValidation+="Next Arrow for next Image is not visible on PDP page \n" ;
		}
		try {
			Utils.verifyElement(ProductDetails_Page.Product.txt_Price());
			Log.info("Verification Pass: Product Text found");

		} catch (Exception e) {
			Log.error("Product price is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product price is not present \n";
		}
		try{
			String productCode = ProductDetails_Page.Product.Product_Code().getText();
			PDP_Action.product_selectColor(ProductDetails_Page.Product.color_variant_buttonlist());
			PDP_Action.product_selectSize(ProductDetails_Page.Product.size_variant_buttonlist());
			ProductDetails_Page.Product.Product_AddToCart().click();
			Log.info("Add to cart button is clicked");
			
			Utils.verifyElement(MiniCart_Page.MiniCartWindow());
			Log.info("Mini cart window is displayed");
			
			MiniCart_Page.removeBtn().click();
			Log.info("Remove button is clicked on the mini cart");
			Thread.sleep(3000);
			if(!PDP_Action.productcode_MatchinMiniCart(MiniCart_Page.MiniCartProductCode(), productCode)){
				Log.info("Product is removed from the mini cart window");
			}else{
				BaseClass.errorValidation+="Product is not removed from Mini Cart Window";
			}
		}
		catch(Exception ex){
			BaseClass.errorValidation+="Product is not removed from Mini Cart Window";
		}
		
		try {
			Utils.verifyElement(ProductDetails_Page.Product.Product_Star_Rating());
			Log.info("Verification Pass: Product Star Rating found");

		} catch (Exception e) {
			Log.error("Product Star Rating is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product Star Rating is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.Product.color_variant());
			Log.info("Verification Pass: Product Color Variant found");

		} catch (Exception e) {
			Log.error("Product color is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product color is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.Product.size_variant());
			Log.info("Verification Pass: Product Size Variant found");

		} catch (Exception e) {
			Log.error("Product size variant is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product size variant is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.Product.description_tabs());
			Log.info("Verification Pass: Product Description tabs found");

		} catch (Exception e) {
			Log.error("Product description tabs are not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product description tabs are not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.Product.description_content());
			Log.info("Verification Pass: Product Description content found");

		} catch (Exception e) {
			Log.error("Product description content are not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product description content are not present \n";
		}
		try{
			if (ProductDetails_Page.breadCrumb().isDisplayed()) {
				Log.info("Breadcrumb is visible");
			}
		}
		catch(Exception e){
			Log.info("BreadCrumb is not visible");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: PDP Bread Crumb is not visible \n";
			BaseClass.bResult=false;
		}
		try{
			Utils.verifyElement(ProductDetails_Page.Product.productPicture());
			Utils.mouseHover(ProductDetails_Page.Product.productPicture());
			Utils.jsClick(ProductDetails_Page.Product.productPicture());
			ProductDetails_Page.Product.ZoomInWindowCloseBtn().click();
			Utils.mouseHover(Home_Page.Footer_Section.Help_FAQ());

			if (ProductDetails_Page.PersistenceProduct.persistentHeader().isDisplayed()) {
				Log.info("Persistent Header is displayed");

			} else {
				Log.error("Persistent Header is not displayed");
				throw new Exception("Persistent Header is not displayed");
			}
		}
		catch(Exception ex){
			BaseClass.errorValidation+="Persistent Product feature and product image validation failed";
		}
		
		if (!BaseClass.errorValidation.equals("")) {
			Log.error("Exception in Class PDP_Action | Method Product_VerifyDetails");
			throw (new Exception(BaseClass.errorValidation));
		}

	}
	public static void Write_A_Review(int iTestCaseRow) throws Exception{
		ProductDetails_Page.Product.WriteReviewBtn().click();
		Log.info("Write a review button is clicked");

		if (Utils.CheckEnability(ProductDetails_Page.ReviewWindow.ReviewPopUp())) {
			Log.info("Review pop up window is displayed");
		} else {
			Log.error("Review pop up window is not displayed");
			throw new Exception("Review pop up window is not displayed");	
		}

		ProductDetails_Page.ReviewWindow.ReviewStar_4().click();
		ProductDetails_Page.ReviewWindow.ReviewQuality_VeryGood().click();
		ProductDetails_Page.ReviewWindow.ReviewTitle()
				.sendKeys(ExcelUtils.getCellData(iTestCaseRow, Constant.reviewTitle));
		ProductDetails_Page.ReviewWindow.ReviewDescription()
				.sendKeys(ExcelUtils.getCellData(iTestCaseRow, Constant.description));
		ProductDetails_Page.ReviewWindow.ReviewSubmitBtn().click();
		String message = ExcelUtils.getCellData(iTestCaseRow, Constant.message1);

		if (message.equals(ProductDetails_Page.GlobalMsg().getText().trim())) {
			Log.info("Review added successfully");
			
		}else{
			BaseClass.bResult=false;
			BaseClass.errorValidation+="Review not added \n";
		}

	}
	
	public static void Reg_User_Add_Remove_From_Wishlist(int iTestCaseRow)throws Exception{
		try{
			Utils.waitForLoad(ExcelUtils.getCellData(iTestCaseRow, Constant.browser));
			Utils.mouseHover(ProductDetails_Page.Product.AddToWishlistBtn());
			ProductDetails_Page.Product.AddToWishlistBtn().sendKeys(Keys.ENTER);
			Log.info("Product added to the wishlist successfully");
			Thread.sleep(5000);
			Utils.verifyElement(Home_Page.headerWishlistIcon());
			Utils.jsClick(Home_Page.headerWishlistIcon());
			MyAccount_Page.WishList.WishListItemCloseBtn().click();
		}catch(Exception e){
			BaseClass.errorValidation+="Adding a product to wishlist and removing it from wishlist is not working\n";
		}

	}
	public static void PersistentProduct_VerifyDetails() throws Exception {

		try {
			Utils.verifyElement(ProductDetails_Page.PersistenceProduct.productName());
			Log.info("Verification Pass: Product Name found");

		} catch (Exception e) {
			Log.error("Product name is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product name is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.PersistenceProduct.productSize());
			Log.info("Verification Pass: Product Size Variant found");

		} catch (Exception e) {
			Log.error("Product size variant is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product size variant is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.PersistenceProduct.productPicture());
			Log.info("Verification Pass: Product Picture found");

		} catch (Exception e) {
			Log.error("Product Picture is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product Picture is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.PersistenceProduct.productAddToCart());
			Log.info("Verification Pass: Add to cart button is found");

		} catch (Exception e) {
			Log.error("Add to cart button is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Add to cart button is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.PersistenceProduct.productQty());
			Log.info("Verification Pass: Product quantity content found");

		} catch (Exception e) {
			Log.error("Product quantity content is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Product quantity content is not present \n";
		}

		if (!BaseClass.errorValidation.equals("")) {
			Log.error("Exception in Class PDP_Action | Method PersistentProduct_VerifyDetails");
			throw (new Exception(BaseClass.errorValidation));
		}

	}

	public static boolean productcode_MatchinMiniCart(List<WebElement> productcodeObjectMiniCart, String productCode)
			throws Exception {
		boolean match = false;
		try {
			if (productcodeObjectMiniCart.size() == 1) {
				if (productcodeObjectMiniCart.get(0).getAttribute("value").equals(productCode)) {
					match = true;
					Log.info("Product code is found in mini cart window");
				}

			} else if (productcodeObjectMiniCart.size() > 1) {
				for (int i = 0; i < productcodeObjectMiniCart.size(); i++) {
					if (productcodeObjectMiniCart.get(i).getAttribute("value").equals(productCode)) {
						match = true;
						Log.info("Product code is found in mini cart window");
					}
				}
			}else{
				Log.info("Product code is not found in mini cart window");
			}

		} catch (Exception e) {
			Log.error("Exception in Class PDP_Action | Method productcode_MatchinMiniCart");
			Log.error("Issue in matching product code in mini cart window");
			throw (e);

		}
		return match;
	}
	public static void checkValid_Invalid_Delivery_Options(int iTestCaseRow)throws Exception{
		
		ProductDetails_Page.Product.PinCode().sendKeys(ExcelUtils.getCellData(iTestCaseRow, Constant.postCode));
		Log.info("Pin is entered into the text field");
		ProductDetails_Page.Product.PinCodeCheckBtn().click();
		Log.info("Check button is clicked");

		if (ProductDetails_Page.Product.PinCodeSuccessMsg().isDisplayed()) {
			Log.info("Product can be deliver to this pincode");
		} else {
			Log.error("Product cannot be deliver to this Pincode");
			throw (new Exception("Product cannot be deliver to this Pincode"));
		}
		Thread.sleep(2000);
		ProductDetails_Page.Product.ChangePinBtn().click();
		Log.info("Change pin button is clicked");
		ProductDetails_Page.Product.PinCode().clear();
		Log.info("Previous pin is cleared from the field");
		ProductDetails_Page.Product.PinCode()
				.sendKeys(ExcelUtils.getCellData(iTestCaseRow, Constant.alternativePostCode));
		Log.info("Pin is entered into the text field");
		ProductDetails_Page.Product.PinCodeCheckBtn().click();
		Log.info("Check button is clicked");
		Thread.sleep(3000);
		Utils.verifyElement(ProductDetails_Page.Product.InvalidPinCodeMsg());
	}

	public static void Product_Verify_SocialShare() throws Exception {

		try {
			Utils.mouseHover(ProductDetails_Page.Product.Social_TwitterLink());
			Utils.verifyElement(ProductDetails_Page.Product.Social_TwitterLink());
			Log.info("Verification Pass: Twitter link found");

		} catch (Exception e) {
			Log.error("Twitter link is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Twitter link is not present \n";
		}
		try {
			Utils.mouseHover(ProductDetails_Page.Product.Social_InstagramLink());
			Utils.verifyElement(ProductDetails_Page.Product.Social_InstagramLink());
			Log.info("Verification Pass: Social_InstagramLink found");

		} catch (Exception e) {
			Log.error("Twitter link is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Instagram link is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.Product.Social_FacebookLink());
			Log.info("Verification Pass: Facebook link found");

		} catch (Exception e) {
			Log.error("Facebook link is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Facebook link is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.Product.Social_GooglePlusLink());
			Log.info("Verification Pass: Google Plus link found");

		} catch (Exception e) {
			Log.error("Google plus link is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Google Plus link is not present \n";
		}

		try {
			Utils.verifyElement(ProductDetails_Page.Product.Social_PinterestLink());
			Log.info("Verification Pass: Pinterest link is found");

		} catch (Exception e) {
			Log.error("Pinterest link is not present");
			BaseClass.errorValidation = BaseClass.errorValidation + "Verification Fail: Pinterest link is not present \n";
		}

		if (!BaseClass.errorValidation.equals("")) {
			Log.error("Exception in Class PDP_Action | Method Product_Verify_SocialShare");
			throw (new Exception(BaseClass.errorValidation));
		}

	}
	
	public static void product_selectDifferentSize(List<WebElement> productSizeButtonList)
			throws Exception {
		
		try {
			if (productSizeButtonList.size()>0){
				for (int i=0; i<=productSizeButtonList.size()-1;i++){
					
					if (!(productSizeButtonList.get(i).getAttribute("class").contains("grey-background"))){
						productSizeButtonList.get(i+1).click();
						return;
					}
				}
			}

		} catch (Exception e) {
			Log.error("Exception in Class PDP_Action | Method productcode_MatchinMiniCart");
			Log.error("Issue in matching product code in mini cart window");
			throw (e);
		}

		}
	public static void product_selectSize(List<WebElement> productSizeButtonList)
			throws Exception {
		
		try {
			if (productSizeButtonList.size()>0){
				for (int i=0; i<=productSizeButtonList.size()-1;i++){
					
					if (!(productSizeButtonList.get(i).getAttribute("class").contains("grey-background"))){
						productSizeButtonList.get(i).click();
						Utils.highLight(productSizeButtonList.get(i));
						Thread.sleep(5000);
						return;
					}
				}
			}

		} catch (Exception e) {
			Log.error("Exception in Class PDP_Action | Method productcode_MatchinMiniCart");
			Log.error("Issue in matching product code in mini cart window");
			throw (e);

		}
		
	}
	public static void product_selectColor(List<WebElement> productColorButtonList)
			throws Exception {
		
		try {
			if (productColorButtonList.size()>0){
				for (int i=0; i<=productColorButtonList.size()-1;i++){
					
					if (!(productColorButtonList.get(i).getAttribute("class").contains("grey-background"))){
						productColorButtonList.get(i).click();
						Utils.highLight(productColorButtonList.get(i));
						Thread.sleep(5000);
						return;
					}
				}
			}

		} catch (Exception e) {
			Log.error("Exception in Class PDP_Action | Method productcode_MatchinMiniCart");
			Log.error("Issue in matching product code in mini cart window");
			throw (e);

		}
		
	}
	public static void Reg_User_AddToWishList_ValidateSocialShare_Icon() {
		// TODO Auto-generated method stub
		 String itemCount="0";
		 int count=0;
		try{		
			ProductDetails_Page.Product.SoclialShare().get(0).click();
		    if(itemCount.equals(Home_Page.headerWishlistUserMenu().getText())){
		    	BaseClass.errorValidation+="WishList Count remain Same on clicking wishlist icon on PDP page";
		    }
		}catch(Exception e){
			Log.error("WishList Count remain Same on clicking wishlist icon on PDP page");
		}
		try{		
			ProductDetails_Page.Product.SoclialShare().get(0).click();
		    if(! itemCount.equals(Home_Page.headerWishlistUserMenu().getText())){
		    	BaseClass.errorValidation+="WishList Count remain Same on clicking wishlist icon on PDP page";
		    }
			
		}catch(Exception e){
			Log.error("");
			BaseClass.errorValidation+="WishList Count remain Same on clicking wishlist icon on PDP page";
		}
		try{
			ProductDetails_Page.Product.SoclialShare().get(1).click();
			List<WebElement> list=ProductDetails_Page.Product.ShareProductImageIcon();
			count=list.size();
			if(count==4){
				System.out.println("Four Social Sites are present as expected");
			}
			else{
				BaseClass.errorValidation+="number of Social Share Site is not 4 but it is + " + count;
			}
		}catch(Exception e){
			Log.error("number of Social Share Site is not 4 but it is + " +count + "\n");
			
		}
	}

}
