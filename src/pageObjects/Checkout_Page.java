package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Log;
import utility.Utils;

public class Checkout_Page extends BaseClass {
	private static WebElement element = null;
	private static List<WebElement> element2 = null;
	private static Select option = null;
	public static String DeliveryOption;
	public static Select sel;

	public Checkout_Page(WebDriver Driver) {
		super(Driver);
	}

	public static class TopNavigation {
		public static WebElement CheckOutText() throws Exception {

			try {
				Log.info("Locating CheckOutText element");
				element = Driver
						.findElement(By.xpath("//section[@class='order-total']//h1[contains(text(), 'CHECKOUT')]"));

				Log.info(" Checkout text is found on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CheckOutText");
				Log.error("Checkout text is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement shoppersStopLogo() throws Exception {

			try {
				Log.info("Locating shoppersStopLogo element");
				element = Driver.findElement(By.xpath(
						"//header[@class='cp-header']/a/object[@data='/_ui/responsive/common/assets/images/shoppersstop-logo.svg']"));

				Log.info("Shoppers Stop link is found on top navigation on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method shoppersStopLogo");
				Log.error("Shoppers Stop link is not found on top navigation on the checkout page");
				throw e;
			}

			return element;

		}
		
		public static WebElement backToCartBtn() throws Exception {

			try {
				Log.info("Locating shoppersStopLogo element");
				element = Driver.findElement(By.xpath("//header[@class='cp-header']/div/a"));

				Log.info("Shoppers Stop link is found on top navigation on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method shoppersStopLogo");
				Log.error("Shoppers Stop link is not found on top navigation on the checkout page");
				throw e;
			}

			return element;

		}
	}
	
	

	public static class DeliveryAddress {
		public static WebElement DeliveryAddressNew() throws Exception {

			try {
				Log.info("Locating DeliveryAddressNew element");
				element = Driver.findElement(By.xpath("//div[@class='delivery-address']/div[@class='delivery-form']"));

				Log.info(" New Address form is found");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DeliveryAddressNew");
				Log.error("New Address form is not found");
				throw e;
			}

			return element;

		}

		public static WebElement AddNewAddressBtn() throws Exception {

			try {
				Log.info("Locating AddNewAddressBtn element");
				element = Driver
						.findElement(By.xpath("//div[@class='delivery-addresses']/div/a[text()= 'Add new address']"));

				Log.info("Add new address button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method AddNewAddressBtn");
				Log.error("Add new address button is not found on the checkout Page");
				throw e;

			}

			return element;

		}

		public static WebElement ProceedToPayment() throws Exception {

			try {
				Log.info("Locating ProceedToPayment element");
				element = Driver.findElement(By.xpath("//button[text()='Proceed to payment']"));

				Log.info("Proceed to Payment button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method ProceedToPayment");
				Log.error("Proceed to Payment button is not found on the checkout Page");
				throw e;

			}

			return element;

		}

		public static List<WebElement> DeliveryAddressExistingList() throws Exception {

			try {
				Log.info("Locating DeliveryAddressExistingList elements");
				element2 = Driver
						.findElements(By.xpath("//div[@class='delivery-addresses']//div[@class='viewport']//li"));

				Log.info("Existing address list is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DeliveryAddressExistingList");
				Log.error("Existing address list is not found on the checkout Page");
				throw e;

			}

			return element2;

		}

		public static WebElement firstName() throws Exception {

			try {
				Log.info("Locating firstName element");
				element = Driver.findElement(By.xpath("//*[@id='addressForm']//input[@name='firstName']"));
				Utils.highLight(element);
				Log.info("First name field is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method firstName");
				Log.error("First name field is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}
		public static WebElement ErrorMessageForEmptyFields() throws Exception {

			try {
				Log.info("Locating ErrorMessageForEmptyFields element");
				element = Driver.findElement(By.xpath("(//div[@class='ui-tooltip-content'])[1]"));
				Utils.highLight(element);
				Log.info("ErrorMessageForEmptyFields is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method ErrorMessageForEmptyFields");
				Log.error("ErrorMessageForEmptyFields is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}
		public static WebElement SS_Policy_Checkbox() throws Exception{
			try{Log.info("Locating Terms and Agreement Checkbox");
			element=Driver.findElement(By.xpath("//*[@id='saveInAddressBook']"));
			Utils.highLight(element);
			}
			catch(Exception ex){
				Log.error("Unable to locate Policy Checkbox || Method SS_Policy_Checkbox");
			}
			return element;
		}

		public static WebElement lastName() throws Exception {

			try {
				Log.info("Locating lastName element");
				element = Driver.findElement(By.xpath("//*[@id='addressForm']//input[@name='lastName']"));
				Utils.highLight(element);
				Log.info("Last name field is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method lastName");
				Log.error("Last name field is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}

		public static WebElement phone() throws Exception {

			try {
				Log.info("Locating phone element");
				element = Driver.findElement(By.xpath("//*[@id='phone']"));
				Utils.highLight(element);
				Log.info("Phone field is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method phone");
				Log.error("Phone field is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}

		public static WebElement address1() throws Exception {

			try {
				Log.info("Locating address1 element");
				element = Driver.findElement(By.xpath("//*[@id='addressForm']/input[@name='line1']"));
				Utils.highLight(element);
				Log.info("Address 1 field is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method address1");
				Log.error("Address 1 field is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}

		public static WebElement address2() throws Exception {

			try {
				Log.info("Locating address2 element");
				element = Driver.findElement(By.xpath("//*[@id='addressForm']/input[@name='line2']"));
				Utils.highLight(element);
				Log.info("Address 2 field is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method address2");
				Log.error("Address 2 field is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}

		public static WebElement Postcode() throws Exception {

			try {
				Log.info("Locating Postcode element");
				element = Driver.findElement(By.xpath("//*[@id='postcode']"));
				Utils.highLight(element);
				Log.info("Postcode field is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method Postcode");
				Log.error("Postcode field is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}

		public static WebElement city() throws Exception {

			try {
				Log.info("Locating city element");
				element = Driver.findElement(By.xpath("//*[@id='townCity']"));
				Utils.highLight(element);
				Log.info("City field is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method city");
				Log.error("City field is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}

		public static WebElement TermsandConditionsCheckBox() throws Exception {

			try {
				Log.info("Locating TermsandConditionsCheckBox element");
				element = Driver.findElement(By.xpath("//*[@id='addressForm']//label[@for='saveInAddressBook']"));
				Utils.highLight(element);
				Log.info("Terms and condition checkbox is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method TermsandConditionsCheckBox");
				Log.error("Terms and condition checkbox is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}

		public static WebElement SaveandContinueBtn() throws Exception {

			try {
				Log.info("Locating SaveandContinueBtn element");
				element = Driver.findElement(By.xpath("//*[@id='addressForm']/button"));
				Utils.highLight(element);
				Log.info("Save and continue button is found under delivery address on checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method SaveandContinueBtn");
				Log.error("Save and continue button is not found under delivery address on checkout page");
				throw e;

			}

			return element;

		}

	}

	public static class Paymentinfo {
		public static WebElement PaymentClass() throws Exception {

			try {
				Log.info("Locating PaymentClass element");
				element = Driver.findElement(By.xpath("//div[@class='payment-information']"));
				Utils.highLight(element);
				Log.info("Payment class is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method PaymentClass");
				Log.error("Payment class is not found on the checkout Page");
				throw e;

			}

			return element;

		}
		public static WebElement InvalidCoupanAlert() throws Exception {

			try {
				Log.info("Locating PaymentClass element");
				element = Driver.findElement(By.xpath("(.//*[@id='voucherCode-error'])[2]"));
				Utils.highLight(element);
				Log.info("Payment class is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method PaymentClass");
				Log.error("Payment class is not found on the checkout Page");
				throw e;

			}

			return element;

		}
		public static List<WebElement> ModeOfPayment() throws Exception{		
			try{
				Log.info("Locating 5 Mode of Payment");
				element2=Driver.findElements(By.xpath("//*[contains(@id,'sbOptions')]/li"));
				Log.info("Located all 5 Mode of Payment");
				Utils.HighlightAllElementOneByOne(element2);
				
			}
			catch(Exception ex){
				Log.error("Unable to locate Payment Modes");
				throw new Exception(ex);
			}
			return element2;
		}
		public static WebElement collapsePaymentMode() throws Exception{
			try{
				Log.info("Locating Payment mode Shrink Link");
				element=Driver.findElement(By.xpath(".//*[contains(@id,'sbSelector')]"));
				Utils.highLight(element);
			}
			catch(Exception ex){
				Log.error("Unable to locate Collapse Payment Link");
			}
			return element;
			
		}
		public static WebElement captcha() throws Exception{
			Log.info("Locating captcha");
			element=Driver.findElement(By.xpath("//div[contains(@class,'realperson-text')]"));
			Utils.highLight(element);
			return element;
		}
		public static WebElement catchaTextBox() throws Exception{
			try{
				element=Driver.findElement(By.xpath("//*[@id='defaultReal']"));
			}
			catch(Exception ex){
				Log.error("Unable to locate Catcha Text Box");
			}
			return element;
		}
		public static WebElement PromoCodeTextBox() throws Exception {

			try {
				Log.info("Locating PromoCodeTextBox element");
				element = Driver.findElement(By.xpath("//*[@id='paymentpromocode']/input[@name='voucherCode']"));

				Log.info("Promo code text field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method PromoCodeTextBox");
				Log.error("Promo code text field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement PromoCodeApplyBtn() throws Exception {

			try {
				Log.info("Locating PromoCodeApplyBtn element");
				element = Driver.findElement(By.xpath("//*[@id='paymentpromocode']/input[@type='submit']"));

				Log.info("Promo code Apply button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method PromoCodeApplyBtn");
				Log.error("Promo code Apply button is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement RedeemGiftCard() throws Exception {

			try {
				Log.info("Locating RedeemGiftCard element");
				element = Driver.findElement(
						By.xpath("//div[@class='reedem-wrap']//h5"));
				Utils.highLight(element);
				Log.info("Redeem Gift Card/EGift voucher dropdown is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemGiftCard");
				Log.error("Redeem Gift Card/EGift voucher dropdown is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement RedeemedGiftCardEGVAmount() throws Exception {

			try {
				Log.info("Locating RedeemedGiftCardEGVAmount element");
				element = Driver
						.findElement(By.xpath("//div[@class='reedem-wrap']//h5[contains(text(),'Gift Card')]/span"));

				Log.info("Redeemed Gift Card/EGift voucher amount container is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemedGiftCardEGVAmount");
				Log.error("Redeemed Gift Card/EGift voucher amount container is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement RedeemFCC() throws Exception {

			try {
				Log.info("Locating First Citizen Points element");
				element = Driver.findElement(
						By.xpath("//div[@class='reedem-wrap']//h5[contains(text(),'First Citizen')]/ancestor::li"));

				Log.info("First Citizen Points dropdown is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemFCC");
				Log.error("First Citizen Points dropdown is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement RedeemCardTypeDiv() throws Exception {

			try {
				Log.info("Locating RedeemCardTypeDiv element");
				element = Driver.findElement(By.xpath("//*[@id='checkoutNewGiftCardForm']//select"));
				Utils.highLight(element);
				Log.info("Redeem card type division field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemCardTypeDiv");
				Log.error("Redeem card type division field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static Select RedeemCardType() throws Exception {

			try {
				Log.info("Locating RedeemCardType element");
				option = new Select(Driver.findElement(By.xpath("//*[@id='checkoutNewGiftCardForm']//select")));
				element=Driver.findElement(By.xpath("//*[@id='checkoutNewGiftCardForm']//select"));
				Utils.highLight(element);
				Log.info("Redeem card type field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemCardType");
				Log.error("Redeem card type field is not found on the checkout Page");
				throw e;
			}

			return option;

		}

		public static WebElement RedeemCardNumber() throws Exception {

			try {
				Log.info("Locating RedeemCardNumber element");
				element = Driver.findElement(By.xpath("//*[@id='checkout.new.giftCard.number']"));
				Utils.highLight(element);
				Log.info("Redeem Gift Card/EGift number is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemCardNumber");
				Log.error("Redeem Gift Card/EGift number is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		public static WebElement Redeem_Message() throws Exception {

			try {
				Log.info("Locating Redeem_Message element");
				element = Driver.findElement(By.xpath("//*[contains(text(),'Reddemed')]"));
				Utils.highLight(element);
				Log.info("Redeem_Message is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method Redeem_Message");
				Log.error("Redeem_Message is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		

		public static WebElement RedeemCardPin() throws Exception {

			try {
				Log.info("Locating RedeemCardPin element");
				element = Driver.findElement(By.xpath("//*[@id='checkout.new.giftCard.pin']"));
				Utils.highLight(element);
				Log.info("Redeem Gift Card/EGift pin is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemCardPin");
				Log.error("Redeem Gift Card/EGift pin is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement RedeemCard_AmtToRedeem() throws Exception {

			try {
				Log.info("Locating RedeemCard_AmtToRedeem element");
				element = Driver.findElement(By.xpath("//*[@id='checkout.new.giftCard.amount']"));
				Utils.highLight(element);
				Log.info("Gift Card/EGift amount to redeem is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemCard_AmtToRedeem");
				Log.error("Gift Card/EGift amount to redeem is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement RedeemCardBtn() throws Exception {

			try {
				Log.info("Locating RedeemCardBtn element");
				element = Driver.findElement(
						By.xpath("//*[@id='checkoutNewGiftCardForm']/div[@class='gift-card-holder']/button"));
				Utils.highLight(element);
				Log.info("Redeem button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemCardBtn");
				Log.error("Redeem button is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement AddCard() throws Exception {

			try {
				Log.info("Locating AddCard element");
				element = Driver.findElement(By.xpath("//div[@class='add-card']"));
				Utils.highLight(element);
				Log.info("Add card button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method AddCard");
				Log.error("Add card button is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement FCCRedeemAmount() {

			try {
				Log.info("Locating Redeem Amount field for FCC");
				element = Driver.findElement(
						By.xpath("//div[@id='firstcitizen']//form[@id='checkoutFCCForm']//input[@name='amount']"));
				Utils.highLight(element);
				Log.info("Redeem amount field for FCC is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemCardBtn");
				Log.error("Redeem amount field for FCC is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement FCCRedeemPassword() {
			try {
				Log.info("Locating Redeem Password field for FCC");
				element = Driver.findElement(
						By.xpath("//div[@id='firstcitizen']//form[@id='checkoutFCCForm']//input[@type='password']"));
				Utils.highLight(element);
				Log.info("Redeem password field for FCC is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method FCCRedeemPassword");
				Log.error("Redeem password field for FCC is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement FCCRedeemButton() {
			try {
				Log.info("Locating Redeem Button field for FCC");
				element = Driver.findElement(By.xpath(
						"//div[@id='firstcitizen']//form[@id='checkoutFCCForm']//button[@class='continue-btn']"));
				Utils.highLight(element);
				Log.info("Redeem Button field for FCC is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method FCCRedeemButton");
				Log.error("Redeem Button field for FCC is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		
		public static WebElement ProceedToPaymentButton() {
			try {
				Log.info("Locating ProceedToPayment Button on checkout page ");
				element = Driver.findElement(By.xpath(
						"//button[@class='continue-btn']"));
				Utils.highLight(element);
				Log.info("ProceedToPayment Button found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method FCCRedeemButton");
				Log.error("Redeem Button field for FCC is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement FCCRedeemdAmountText() {
			try {
				Log.info("Locating Redeemd amount text for FCC");
				element = Driver.findElement(By.xpath(".//*[@id='firstcitizen']//div[@class='redeemed-done']"));
				Utils.highLight(element);
				Log.info("Redeem Amount text field for FCC is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method FCCRedeemdAmountText");
				Log.error("Redeemd amount text for FCC is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement FCCAvailableAmountText() {
			try {
				Log.info("Locating Redeemd amount text for FCC");
				element = Driver.findElement(By.xpath(".//*[@id='firstcitizen']//div[@class='summary']/p[3]"));
				Utils.highLight(element);
				Log.info("FCC Available amount text is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method FCCAvailableAmountText");
				Log.error("FCC Available amount text is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement RemoveFCC() {
			try {
				Log.info("Locating Delete Icon for removing FCC");
				element = Driver.findElement(By.xpath(".//*[@id='firstcitizen']//div[@class='redeemed-done']/a/span"));
				Utils.highLight(element);
				Log.info("Delete Icon for removing FCC is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RemoveFCC");
				Log.error("Delete Icon for removing FCC is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement TotalAmount() {
			try {
				Log.info("Locating Total amount price element");
				element = Driver.findElement(By.xpath(
						"//div[@class='reedem-summary']//label[text()='Total Amount']//following-sibling::span"));
				Utils.highLight(element);
				Log.info("Total amount element is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method TotalAmount");
				Log.error("Total amount element is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement RedeemedAmount() {
			try {
				Log.info("Locating Redeemed Amount element");
				element = Driver.findElement(By.xpath(
						"//div[@class='reedem-summary']//label[text()='Redeemed Amount']//following-sibling::span"));
				Utils.highLight(element);
				Log.info("Redeemed Amount is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method RedeemedAmount");
				Log.error("Redeemed Amount is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement BalancePayableAmount() {
			try {
				Log.info("Locating Balance payable Amount element");
				element = Driver.findElement(By.xpath(
						"//div[@class='reedem-summary']//label[text()='Balance payable Amount']//following-sibling::span"));
				Utils.highLight(element);
				Log.info("Balance payable Amount is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method BalancePayableAmount");
				Log.error("Balance payable Amount is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement CreditCardOption() throws Exception {

			try {
				Log.info("Locating CreditCardOption element");
				element = Driver
						.findElement(By.xpath("//div[@class='payment-options']//li[contains(@class,'credit-card')]"));
				Utils.highLight(element);
				Log.info("Credit Card payment option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CreditCardOption");
				Log.error("Credit Card payment option is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		public static WebElement NewCreditCardTab() throws Exception{
			try{
				element=Driver.findElement(By.xpath(".//*[@id='newCreditCardTab']/a"));
			}catch(Exception e){
				throw e;
			}
			return element;
		}
		public static WebElement SaveCardCheckBox() throws Exception{
			try{
				Log.info("Locating Save Card Checkbox");
				element=Driver.findElement(By.id("saveCardCredit11"));
				
			}catch(Exception e){
				Log.error("Unable to locate Save Card Checkbox");
				throw e;
			}
			return element;
		}

		public static WebElement EditAddressBtn() throws Exception {

			try {
				Log.info("Locating EditAddressBtn element");
				element = Driver.findElement(By.xpath("//*[@class='delivery-address']//li[1]//*[@class='edit']"));
				Log.info("Edit Address button is found on the profile Page");
				Utils.highLight(element);

			} catch (Exception e) {
				Log.error("Exception in Class MyAccount_Page | Method EditAddressBtn");
				Log.error("Edit Address button is not found on the profile Page");
				throw e;
			}

			return element;

		}
		public static WebElement DebitCardOption() throws Exception {

			try {
				Log.info("Locating DebitCardOption element");
				element = Driver
						.findElement(By.xpath("//div[@class='payment-options']//li[contains(@class,'debit-card')]"));
				Utils.highLight(element);
				Log.info("Debit Card payment option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DebitCardOption");
				Log.error("Debit Card payment option is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		public static WebElement SavedCardTab() throws Exception {

			try {
				Log.info("Locating SavedCardTab element");
				element = Driver
						.findElement(By.xpath(".//*[@id='saveDebitCardTab']/a"));
				Utils.highLight(element);
				Log.info("SavedCardTab option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method SavedCardTab");
				Log.error("SavedCardTab is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		public static WebElement NewCardTab() throws Exception {

			try {
				Log.info("Locating NewCardTab element");
				element = Driver
						.findElement(By.xpath(".//*[@id='newDebitCardTab']/a"));
				Utils.highLight(element);
				Log.info("NewCardTab option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method NewCardTab");
				Log.error("NewCardTab is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement NetBankingOption() throws Exception {

			try {
				Log.info("Locating NetBankingOption element");
				element = Driver
						.findElement(By.xpath("//div[@class='payment-options']//li[contains(@class,'net-banking')]"));
				Utils.highLight(element);
				Log.info("NetBanking payment option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method NetBankingOption");
				Log.error("NetBanking payment option is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement WalletsOption() throws Exception {

			try {
				Log.info("Locating Wallets elements");
				element = Driver
						.findElement(By.xpath("//div[@class='payment-options']//li[contains(@class,'bank-wallets')]"));
				Utils.highLight(element);
				Log.info("Wallets payment option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method WalletsOption");
				Log.error("Wallets payment option is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		public static WebElement CODOption() throws Exception {

			try {
				Log.info("Locating CODOption element");
				element = Driver
						.findElement(By.xpath("//div[@class='payment-options']//li[contains(@class,'codelivery')]"));
				Utils.highLight(element);
				Log.info("COD payment option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CODOption");
				Log.error("COD payment option is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement CreditCard_CardNumber() throws Exception {

			try {
				Log.info("Locating CreditCard_CardNumber element");
				element = Driver.findElement(By.xpath("//*[@id='creditCardForm']//input[@class='card_number']"));
				Utils.highLight(element);
				Log.info("Credit Card number field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CreditCard_CardNumber");
				Log.error("Credit Card number field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement CreditCard_CVV() throws Exception {

			try {
				Log.info("Locating CreditCard_CVV element");
				element = Driver.findElement(By.xpath("//*[@id='creditCardForm']//input[@class='password']"));
				Utils.highLight(element);
				Log.info("Credit Card CVV field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CreditCard_CVV");
				Log.error("Credit Card CVV field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static Select CreditCard_ExpiryMonth() throws Exception {

			try {
				Log.info("Locating CreditCard_ExpiryMonth element");
				option = new Select(
						Driver.findElement(By.xpath("//*[@id='creditCardForm']//select[@name='expiry_month']")));
				element=Driver.findElement(By.xpath("//*[@id='creditCardForm']//select[@name='expiry_month']"));
				Utils.highLight(element);
				Log.info("Credit Card expiry month field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CreditCard_ExpiryMonth");
				Log.error("Credit Card expiry month field is not found on the checkout Page");
				throw e;
			}

			return option;

		}

		public static Select CreditCard_ExpiryYear() throws Exception {

			try {
				Log.info("Locating CreditCard_ExpiryYear element");
				option = new Select(
						Driver.findElement(By.xpath("//*[@id='creditCardForm']//select[@name='expiry_year']")));
				element=Driver.findElement(By.xpath("//*[@id='creditCardForm']//select[@name='expiry_year']"));
				Utils.highLight(element);
				Log.info("Credit Card expiry year field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CreditCard_ExpiryYear");
				Log.error("Credit Card expiry year field is not found on the checkout Page");
				throw e;
			}

			return option;

		}

		public static Select CreditCard_Name() throws Exception {

			try {
				Log.info("Locating CreditCard_Name element");
				option = new Select(
						Driver.findElement(By.xpath("//*[@id='creditCardForm']//select[@name='card_name']")));
				element=Driver.findElement(By.xpath("//*[@id='creditCardForm']//select[@name='card_name']"));
				Utils.highLight(element);
				Log.info("Credit Card name field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CreditCard_Name");
				Log.error("Credit Card name field is not found on the checkout Page");
				throw e;
			}

			return option;

		}

		public static WebElement CreditCard_PlaceOrderBtn() throws Exception {

			try {
				Log.info("Locating CreditCard_PlaceOrderBtn element");
				element = Driver.findElement(By.xpath("//*[@id='creditCardButton']"));
				Utils.highLight(element);
				Log.info("Credit Card place order button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method CreditCard_PlaceOrderBtn");
				Log.error("Credit Card place order button is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement DebitCard_CardNumber() throws Exception {

			try {
				Log.info("Locating DebitCard_CardNumber element");
				element = Driver.findElement(By.xpath("//*[@id='debitCardForm']//input[@class='card_number']"));
				Utils.highLight(element);
				Log.info("Debit Card number field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DebitCard_CardNumber");
				Log.error("Debit Card number field is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		public static WebElement TotalPrice(){
			try{
				element=Driver.findElement(By.xpath("//*[@class='order-total']//div[@class='order-summary']//div[@class='total']//strong"));
				Utils.highLight(element);
			}catch(Exception e){
				Log.error("Unable to find Total Price at checkout Page.");
				throw e;
			}
			return element;
		}
		public static List<WebElement> CC_Avenue_Error_Message() throws Exception{
			try{
				Log.info("Locating Error messages which CC Avenue returns to Storefrom");
				element2=Driver.findElements(By.xpath(".//*[@id='globalMessages']//div"));
				Utils.HighlightAllElementOneByOne(element2);
			}catch(Exception ex){
				Log.error("Unable to locate Error Messages");
				throw ex;
			}
			return element2;
		}
		public static WebElement CC_Avenue_Error_Msg_Text() throws Exception{
			try{
				Log.info("Locating Error message which CC Avenue returns to Storefrom");
				element=Driver.findElement(By.xpath(".//*[@id='globalMessages']/div/div[1]"));
				Utils.highLight(element);
			}catch(Exception ex){
				Log.error("Unable to locate Error Messages");
				throw ex;
			}
			return element;
		}

		public static WebElement DebitCard_CVV() throws Exception {

			try {
				Log.info("Locating DebitCard_CVV element");
				element = Driver.findElement(By.xpath("//*[@id='debitCardForm']//input[@class='password']"));
				Utils.highLight(element);
				Log.info("Debit Card CVV field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DebitCard_CVV");
				Log.error("Debit Card CVV field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static Select DebitCard_ExpiryMonth() throws Exception {

			try {
				Log.info("Locating DebitCard_ExpiryMonth element");
				option = new Select(
						Driver.findElement(By.xpath("//*[@id='debitCardForm']//select[@name='expiry_month']")));
				element=Driver.findElement(By.xpath("//*[@id='debitCardForm']//select[@name='expiry_month']"));
				Utils.highLight(element);
				Log.info("Debit Card expiry month field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DebitCard_ExpiryMonth");
				Log.error("Debit Card expiry month field is not found on the checkout Page");
				throw e;
			}

			return option;

		}

		public static Select DebitCard_ExpiryYear() throws Exception {

			try {
				Log.info("Locating DebitCard_ExpiryYear element");
				option = new Select(
						Driver.findElement(By.xpath("//*[@id='debitCardForm']//select[@name='expiry_year']")));
				element=Driver.findElement(By.xpath("//*[@id='debitCardForm']//select[@name='expiry_year']"));
				Utils.highLight(element);
				Log.info("Debit Card expiry year field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DebitCard_ExpiryYear");
				Log.error("Debit Card expiry year field is not found on the checkout Page");
				throw e;
			}

			return option;

		}

		public static Select DebitCard_Name() throws Exception {

			try {
				Log.info("Locating DebitCard_Name element");
				option = new Select(
						Driver.findElement(By.xpath("//*[@id='debitCardForm']//select[@name='card_name']")));
				element=Driver.findElement(By.xpath("//*[@id='debitCardForm']//select[@name='card_name']"));
				Utils.highLight(element);
				Log.info("Debit Card name field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DebitCard_Name");
				Log.error("Debit Card name field is not found on the checkout Page");
				throw e;
			}

			return option;

		}

		public static WebElement DebitCard_PlaceOrderBtn() throws Exception {

			try {
				Log.info("Locating DebitCard_PlaceOrderBtn element");
				element = Driver.findElement(By.xpath(".//*[@id='debitCardButton']"));
				Utils.highLight(element);
				Log.info("Debit Card place order button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DebitCard_PlaceOrderBtn");
				Log.error("Debit Card place order button is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement NetBanking_SelectFromVisibleList(String bankName) throws Exception {

			try {
				Log.info("Locating NetBanking_SelectFromVisibleList element");
				element = Driver.findElement(By.xpath("//*[@id='netBankingForm']//label[text()='" + bankName + "']"));
				Utils.highLight(element);
				Log.info("Entered bank option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method NetBanking_SelectFromVisibleList");
				Log.error("Entered bank option is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement NetBanking_SelectFromDropdownDiv() throws Exception {

			try {
				Log.info("Locating NetBanking_SelectFromDropdownDiv element");
				element = Driver.findElement(By.xpath("//*[@id='netBankingForm']//select"));
				Utils.highLight(element);
				Log.info("All banks dropdown division element is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method NetBanking_SelectFromDropdownDiv");
				Log.error("All banks dropdown division element is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement Wallets_SelectFromVisibleList(String bankName) throws Exception {

			try {
				Log.info("Locating Wallets_SelectFromVisibleList element");
				element = Driver.findElement(By.xpath("//*[@id='bankWalletsForm']//*[@class='" + bankName + "']"));
				Utils.highLight(element);
				
				Log.info("Entered Wallet option is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method Wallets_SelectFromVisibleList");
				Log.error("Entered Wallet option is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		
		
		//// COD related Page objects 

		public static WebElement COD_PaymentOption() throws Exception {

			try {
				Log.info("Locating COD_PaymentOption element");
				element = Driver.findElement(By.xpath("//a[@rel='Cash On Delivery']"));
				Utils.highLight(element);
				Log.info("COD_PaymentOption is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method COD_PaymentOption");
				Log.error("COD_PaymentOption is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		
		public static WebElement COD_captcha() throws Exception {

			try {
				Log.info("Locating COD_captcha element");
				element = Driver.findElement(By.xpath("//div[contains(@class,'realperson-text')]"));
				Utils.highLight(element);
				Log.info("COD_captcha is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method COD_captcha");
				Log.error("COD_captcha is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		public static WebElement COD_Captcha_TextBox() throws Exception{
			try{
				Log.info("Locating Text box for entering captcha");
				element=Driver.findElement(By.id("defaultReal"));
				Utils.highLight(element);
				Log.info("Located Text box for entering captcha");
			}
			catch(Exception ex){
				Log.error("Unable to Locate Textbox for captcha");
			}
			return element;
		}
		
		public static WebElement COD_PlaceOrder() throws Exception {

			try {
				Log.info("Locating COD_PlaceOrder element");
				element = Driver.findElement(By.xpath(".//*[@id='cashondelivery']//button"));
				Utils.highLight(element);
				Log.info("COD_PlaceOrder is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method COD_PlaceOrder");
				Log.error("COD_PlaceOrder is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		
		public static WebElement COD_ClickToChangeCaptcha() throws Exception {

			try {
				Log.info("Locating COD_ClickToChangeCaptcha element");
				element = Driver.findElement(By.xpath("//div[@class='realperson-regen']"));
				Utils.highLight(element);
				Log.info("COD_ClickToChangeCaptcha is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method COD_ClickToChangeCaptcha");
				Log.error("COD_ClickToChangeCaptcha is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		
		/// COD related Page Objects finished
		
		public static Select NetBanking_SelectFromDropdown() throws Exception {

			try {
				Log.info("Locating NetBanking_SelectFromDropdown element");
				option = new Select(Driver.findElement(By.xpath("//*[@id='netBankingForm']//select")));
				
				Log.info("All banks dropdown is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method NetBanking_SelectFromDropdown");
				Log.error("All banks dropdown is not found on the checkout Page");
				throw e;
			}

			return option;

		}

		public static WebElement NetBanking_PlaceOrderBtn() throws Exception {

			try {
				Log.info("Locating NetBanking_PlaceOrderBtn element");
				element = Driver.findElement(By.xpath("//*[@id='orderSubmitNetbanking']"));
				Utils.highLight(element);
				Log.info("NetBanking place order button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method NetBanking_PlaceOrderBtn");
				Log.error("NetBanking place order button is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement Wallet_PlaceOrderBtn() throws Exception {

			try {
				Log.info("Locating NetBanking_PlaceOrderBtn element");
				element = Driver.findElement(By.xpath("//*[@id='orderSubmitBankWallets']"));
				Utils.highLight(element);
				Log.info("Wallet place order button is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method Wallet_PlaceOrderBtn");
				Log.error("Wallet place order button is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static List<WebElement> PaymentAlerts() throws Exception {

			try {
				Log.info("Locating Payment related alert element");
				element2 = Driver.findElements(By.xpath(".//*[@id='globalMessages']/div[@class='global-alerts']"));

				Log.info("Payment related alert is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method PaymentAlerts");
				Log.error("Payment related alert is not found on the checkout Page");
				throw e;
			}

			return element2;

		}

	}

	public static class LoginDetails {

		public static WebElement LoginEmailGuest() throws Exception {

			try {
				Log.info("Locating LoginEmailGuest element");
				element = Driver.findElement(By.xpath(".//*[@id='email']"));
				Utils.highLight(element);
				Log.info("LoginEmail field is found on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method LoginEmailGuest");
				Log.error("LoginEmail field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement LoginEmailRegisteredUser() throws Exception {

			try {
				Log.info("Locating LoginEmailRegisteredUser element");
				element = Driver.findElement(By.xpath("//div[@class='login']//*[@id='j_username']"));
				Utils.highLight(element);
				Log.info("LoginEmail field is found on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method LoginEmailRegisteredUser");
				Log.error("LoginEmail field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement LoginPwdRegisteredUser() throws Exception {

			try {
				Log.info("Locating LoginPwdRegisteredUser element");
				element = Driver.findElement(By.xpath("//div[@class='login']//*[@id='j_password']"));
				Utils.highLight(element);
				Log.info("Login Password field is found on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method LoginPwdRegisteredUser");
				Log.error("Login Password field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement Optionbtn_RegisteredUser() throws Exception {

			try {
				Log.info("Locating Optionbtn_RegisteredUser element");
				element = Driver.findElement(By.xpath("//label[@for='signin-radio']"));
				Utils.highLight(element);
				Log.info("Option button for registered user having password is found on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method Optionbtn_RegisteredUser");
				Log.error("Option button for registered user having password is not found on the checkout Page");
				throw e;
			}

			return element;

		}
		public static WebElement ContinueAsGuest() throws Exception{
			element=Driver.findElement(By.xpath("//*[@for='guest-radio']"));
			Utils.highLight(element);
			return element;
		}
		public static WebElement ContinueBtn() throws Exception {

			try {
				Log.info("Locating ContinueBtn element");
				element = Driver.findElement(By.xpath("//*[@id='checkout-login']"));
				Utils.highLight(element);
				Log.info("Continue button is found on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method ContinueBtn");
				Log.error("Continue button is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement DoNotHaveAccountBtn() throws Exception {

			try {
				Log.info("Locating DoNotHaveAccountBtn element");
				element = Driver.findElement(By.xpath("//div[contains(@class,'non-account')]/a"));

				Log.info("DoNotHaveAccountBtn is found on the checkout page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method DoNotHaveAccountBtn");
				Log.error("DoNotHaveAccountBtn is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement First_name() throws Exception {

			try {
				Log.info("Locating First_name element");
				element = Driver.findElement(By.xpath("//div[@class='signup']//*[@id='firstName']"));
				Utils.highLight(element);
				Log.info("First Name field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method First_name");
				Log.error("First Name link is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement last_name() throws Exception {

			try {
				Log.info("Locating last_name element");
				element = Driver.findElement(By.xpath("//div[@class='signup']//*[@id='lastName']"));
				Utils.highLight(element);
				Log.info("Last Name field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method last_name");
				Log.error("Last Name link is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement email() throws Exception {

			try {
				Log.info("Locating email element");
				element = Driver.findElement(By.xpath("//div[@class='signup']//*[@id='email']"));
				Utils.highLight(element);
				Log.info("Email field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method email");
				Log.error("Email field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement password() throws Exception {

			try {
				Log.info("Locating password element");
				element = Driver.findElement(By.id("pwd"));
				Utils.highLight(element);
				Log.info("password field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method password");
				Log.error("password field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement Confirm_Password() throws Exception {

			try {
				Log.info("Locating Confirm_Password element");
				element = Driver.findElement(By.xpath("//div[@class='signup']//*[@id='checkPwd']"));
				Utils.highLight(element);
				Log.info("Confirm_Password field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method Confirm_Password");
				Log.error("Confirm_Password field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement mobileNumber() throws Exception {

			try {
				Log.info("Locating mobileNumber element");
				element = Driver.findElement(By.xpath("//div[@class='signup']//*[@id='mobileNumber']"));
				Utils.highLight(element);
				Log.info("MobileNumber field is found on the checkout Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method mobileNumber");
				Log.error("MobileNumber field is not found on the checkout Page");
				throw e;
			}

			return element;

		}

		public static WebElement genderMale() throws Exception {

			try {
				Log.info("Locating genderMale element");
				element = Driver.findElement(By.xpath("//*[@id='sslRegisterForm']//label[text()='Male']"));
				Utils.highLight(element);
				Log.info("Male gender option is found on the checkbox Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method genderMale");
				Log.error("Male gender option is not found on the checkbox Page");
				throw e;
			}

			return element;

		}

		public static WebElement genderFemale() throws Exception {

			try {
				Log.info("Locating genderFemale element");
				element = Driver.findElement(By.xpath("//*[@id='sslRegisterForm']//label[text()='Female']"));
				Utils.highLight(element);
				Log.info("Female gender option is found on the checkbox Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method genderFemale");
				Log.error("Female gender option is not found on the checkbox Page");
				throw e;
			}

			return element;

		}

		public static WebElement SignUpBtn() throws Exception {

			try {
				Log.info("Locating SignUpBtn element");
				element = Driver.findElement(By.xpath("//*[@id='sslRegisterForm']//button[@class='continue-btn']"));
				Utils.highLight(element);
				Log.info("Sign up button is found on the checkbox Page");

			} catch (Exception e) {
				Log.error("Exception in Class Checkout_Page | Method SignUpBtn");
				Log.error("Sign up button is not found on the checkbox Page");
				throw e;
			}

			return element;

		}
	}
	
	public static WebElement DropDownBtn() throws Exception {

		try {
			Log.info("Locating DropDownButton element");
			element = Driver.findElement(By.xpath("//*[@class='order-summary']//*[@class='summary']//*[@class='toggle-summary']"));
			Utils.highLight(element);
			Log.info("Shoppers Stop link is found on top navigation on the checkout page");

		} catch (Exception e) {
			Log.error("Exception in Class Checkout_Page | Method shoppersStopLogo");
			Log.error("DropDownButton is not found on top navigation on the checkout page");
			throw e;
		}

		return element;

	}
}
