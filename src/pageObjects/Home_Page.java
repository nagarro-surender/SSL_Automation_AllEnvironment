package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;
import utility.Utils;

public class Home_Page extends BaseClass {
	private static WebElement element = null;
	private static List<WebElement> webElements = null;
	private static List<WebElement> elements = null;

	public Home_Page(WebDriver Driver) {
		super(Driver);
	}

	public static WebElement LoginRegister() throws Exception {

		try {
			Log.info("Locating LoginRegister element");
			element = Driver.findElement(By.id("loginId"));
			Utils.highLight(element);
			Log.info("Log IN element is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method LoginRegister");
			Log.error("Log IN element is not found on the Home Page");
			throw e;
		}

		return element;

	}
	public static List<WebElement> NewArrivals() throws Exception {
		try {
			Log.info("Locating NewArrivals element");
			elements = Driver.findElements(By.xpath(".//div[@class='pic']"));
			//MobileWeb.HighlightElements(elements);
			Log.info("NewArrivals is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method NewArrivals");
			Log.error("NewArrivals Subscription alert is not found on the Home Page");
			throw e;
		}

		return elements;
	}

	public static List<WebElement> MaroonText() throws Exception {

		try {
			Log.info("Locating Maroon Text element");
			elements = Driver.findElements(By.xpath("//*[@class='results_list']//li//a"));
			Utils.HighlightAllElementOneByOne(elements);
			Log.info("Maroon is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method MaroonText");
			Log.error("Maroon is not found on the home page");
			throw e;
		}

		return elements;

	}
	
	public static WebElement BoldText() throws Exception {

		try {
			Log.info("Locating Maroon Text element");
			element = Driver.findElement(By.xpath("(//div[@class='search_bar_inner']//*[@class='autosuggestion_highlight_new'])[6]"));
			Utils.highLight(element);
			Log.info("Maroon is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method MaroonText");
			Log.error("Maroon is not found on the home page");
			throw e;
		}

		return element;

	}
	public static List<WebElement> StyleInspiration() throws Exception {
		try {
			Log.info("Locating StyleInspiration element");
			elements = Driver.findElements(By.xpath(".//div[@class='pic-holder']//a"));
			//MobileWeb.HighlightElements(elements);
			Log.info("StyleInspiration elements is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method StyleInspiration");
			Log.error("StyleInspiration is not found on the Home Page");
			throw e;
		}

		return elements;
	}
	public static List<WebElement> StyleHub() throws Exception {
		try {
			Log.info("Locating StyleHub element");
			elements = Driver.findElements(By.xpath(".//div[@class='horizontal-slider']//a"));
			//MobileWeb.HighlightElements(elements);
			Log.info("StyleHub elements is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method StyleHub");
			Log.error("StyleHub is not found on the Home Page");
			throw e;
		}

		return elements;
	}
	public static List<WebElement> OfferZone() throws Exception {
		try {
			Log.info("Locating OfferZone elements");
			elements = Driver.findElements(By.xpath(".//*[@class='offer-zone']//a"));
			//MobileWeb.HighlightElements(elements);
			Log.info("OfferZone elements is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method OfferZone");
			Log.error("OfferZone is not found on the Home Page");
			throw e;
		}

		return elements;
	}
	public static List<WebElement> FavBanner() throws Exception {
		try {
			Log.info("Locating FavBanner elements");
			elements = Driver.findElements(By.xpath(".//*[@class='fav-banner']//a"));
			//MobileWeb.HighlightElements(elements);
			Log.info("FavBanner elements is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method FavBanner");
			Log.error("FavBanner is not found on the Home Page");
			throw e;
		}

		return elements;
	}
	public static List<WebElement> FavBrands() throws Exception {
		try {
			Log.info("Locating FavBrands elements");
			elements = Driver.findElements(By.xpath(".//*[@class='fav-brands']//a"));
			//MobileWeb.HighlightElements(elements);
			Log.info("FavBrands elements is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method FavBrands");
			Log.error("FavBrands is not found on the Home Page");
			throw e;
		}

		return elements;
	}
	public static WebElement LogOut() throws Exception {

		try {
			Log.info("Locating LogOut element");
			element = Driver.findElement(By.xpath("//a[contains(text(),'Sign Out')][2]"));

			Log.info("Log out element is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method LogOut");
			Log.error("Log out element is not found on the Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement Register() throws Exception {

		try {
			Log.info("Locating Register element");
			element = Driver.findElement(By.linkText("REGISTER"));

			Log.info("REGISTER link is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method Register");
			Log.error("Register link is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement SignUp() throws Exception {

		try {
			Log.info("Locating SignUp element");
			element = Driver.findElement(By.linkText("SIGN UP"));
			Utils.highLight(element);
			Log.info("SignUp link is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method SignUp");
			Log.error("SignUp link is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement SignIn() throws Exception {

		try {
			Log.info("Locating SignIn element");
			element = Driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			Utils.highLight(element);
			Log.info("Sign In link is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method SignIn");
			Log.error("Sign In link is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement KnowMore_Btn() throws Exception {

		try {
			Log.info("Locating KnowMore_Btn element");
			element = Driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[1]/a"));

			Log.info("Know More link is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method KnowMore_Btn");
			Log.error("Know More link is not found on the home page");
			throw e;

		}

		return element;

	}

	public static WebElement Logout() {
		try {
			Log.info("Locating Logout element");
			element = Driver.findElement(By.linkText("SIGN OUT"));
			Utils.highLight(element);
			Log.info("LOGOUT link is  found on the home page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method Logout");
			Log.error("LOGOUT link is not found on the home page");
			throw e;
		}
		return element;

	}

	public static WebElement OrderForm() throws Exception {
		try {
			Log.info("Locating OrderForm element");
			element = Driver.findElement(By.xpath("//a[contains(@href, '/orderForm')]"));
			Log.info("Order form link is found on the home page");
		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method OrderForm");
			Log.error("Order form link is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement MyAccount() throws Exception {

		try {
			Log.info("Locating MyAccount element");
			element = Driver.findElement(By.xpath("//div[@class='member-login-sign']//a[@class='account-tag']"));
			Utils.highLight(element);
			Log.info("MyAccount link is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method MyAccount");
			Log.error("MyAccount link is not found on the Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement Catalogue() throws Exception {

		try {
			Log.info("Locating Catalogue element");
			element = Driver.findElement(By.linkText("Catalogue"));
			Utils.highLight(element);
			Log.info("catalogue link is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method Catalogue");
			Log.error("catalogue link is not found on the Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement Products() throws Exception {

		try {
			Log.info("Locating Products element");
			element = Driver.findElement(By.xpath("//a[@href='#' and @title='Products']"));
			Utils.highLight(element);
			Log.info("Products link is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method Products");
			Log.error("Products link is not found on the Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement Help() throws Exception {

		try {
			Log.info("Locating Help element");
			element = Driver.findElement(By.linkText("Help"));
			Utils.highLight(element);
			Log.info("Help Link found under top navigation Section");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method Help");
			Log.error("Help link is not found under top navigation  Section");

			throw (e);

		}
		return element;

	}

	public static class Footer_Section {

		static WebElement element;

		public static WebElement Help_FAQ() throws Exception {

			try {
				Log.info("Locating Help_FAQ element");
				
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Help/FAQs')]"));
				Utils.highLight(element);

				Log.info("Help/FAQ Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Help_FAQ");
				Log.error("Help/FAQ link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Track_Order() throws Exception {

			try {
				Log.info("Locating Track_Order element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Track Order')]"));
				Utils.highLight(element);
				Log.info("Track Order Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Track_Order");
				Log.error("Track order link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Size_Guide() throws Exception {

			try {
				Log.info("Locating Size_Guide element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Size Guide')]"));
				Utils.highLight(element);
				Log.info("Size Guide Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Size_Guide");
				Log.error("Size Guide link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Buying_Guide() throws Exception {

			try {
				Log.info("Locating Buying_Guide element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Buying Guide')]"));
				Utils.highLight(element);
				Log.info("Buying Guide Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Buying_Guide");
				Log.error("Buying Guide link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement How_To_Buy() throws Exception {

			try {
				Log.info("Locating How_To_Buy element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'How do i shop?')]"));
				Utils.highLight(element);
				Log.info("How Do I Buy? Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method How_To_Buy");
				Log.error("How Do I Buy? link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement How_To_Pay() throws Exception {

			try {
				Log.info("Locating How_To_Pay element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'How do i pay?')]"));
				Utils.highLight(element);
				Log.info("How Do I Buy? Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method How_To_Pay");
				Log.error("How Do I Buy? link is not found under  Footer Section");
				Utils.highLight(element);
				throw (e);

			}
			return element;

		}

		public static WebElement Place_We_Deliever() throws Exception {

			try {
				Log.info("Locating Place_We_Deliever element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Find places we deliver')]"));
				Utils.highLight(element);
				Log.info("Find places we deliver Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Place_We_Deliever");
				Log.error("Find places we deliver link is not found under Footer Section");

				throw (e);

			}
			return element;

		}

		//public static WebElement Blog() throws Exception {

			//try {
				//Log.info("Locating Blog element");
				//element = Driver.findElement(By.xpath("//a[contains(@title, 'Blog')]"));

				//Log.info("Blog Link found under Footer Section");

			//} catch (Exception e) {
			//	Log.error("Exception in Class Home_Page | Method Blog");
				//Log.error("Blog link is not found under Footer Section");

				//throw (e);

			//}
			//return element;

		//}

		public static WebElement TermsAndConditions() throws Exception {

			try {
				Log.info("Locating TermsAndConditions element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Terms of use')]"));
				Utils.highLight(element);
				Log.info("Terms & Conditions  Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method TermsAndConditions");
				Log.error("Terms & Conditions  link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Privacy() throws Exception {

			try {
				Log.info("Locating Privacy element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Privacy')]"));
				Utils.highLight(element);
				Log.info("Privacy Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Privacy");
				Log.error("Privacy link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Shipping_Policy() throws Exception {

			try {
				Log.info("Locating Shipping_Policy element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Shipping Policy')]"));
				Utils.highLight(element);
				Log.info("Shipping Policy Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Shipping_Policy");
				Log.error("Shipping Policy link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Exchange_Returns() throws Exception {

			try {
				Log.info("Locating Exchange_Returns element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Exchanges & Returns')]"));
				Utils.highLight(element);
				Log.info("Exchange Returns Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Exchange_Returns");
				Log.error("Exchange Returns link is not found under  Footer Section");

				throw (e);

			}
			return element;
		}

		public static WebElement AboutUs() throws Exception {

			try {
				Log.info("Locating AboutUs element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'About us')]"));
				Utils.highLight(element);
				Log.info("AboutUs Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method AboutUs");
				Log.error("AboutUs link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Corporate_Site() throws Exception {

			try {
				Log.info("Locating Corporate_Site element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Corporate Site')]"));
				Utils.highLight(element);
				Log.info("Corporate Site Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Corporate_Site");
				Log.error("Corporate Site link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Store_Locator() throws Exception {

			try {
				Log.info("Locating Store_Locator element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Store locator')]"));
				Utils.highLight(element);
				Log.info("Store Locator Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Store_Locator");
				Log.error("Store Locator link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement First_Citizen() throws Exception {

			try {
				Log.info("Locating First_Citizen element");
				//element = Driver.findElement(By.xpath("//a[contains(@title, 'FIRST CITIZEN')]"));
				element = Driver.findElement(By.xpath("//a[@title='FIRST CITIZEN']"));
				Utils.highLight(element);
				Log.info("First Citizen Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method First_Citizen");
				Log.error("First Citizen link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Instant_Gifting() throws Exception {

			try {
				Log.info("Locating Instant_Gifting element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'Instant Gifting')]"));
				Utils.highLight(element);
				Log.info("Instant Gifting Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Instant_Gifting");
				Log.error("Instant Gifting link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Toll_Free() throws Exception {

			try {
				Log.info("Locating Toll_Free element");
				element = Driver.findElement(By.xpath("//a[contains(@title, '#1-800-419-6648 (toll free)')]"));
				Utils.highLight(element);
				Log.info("Toll Free Contact Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Toll_Free");
				Log.error("Toll Free Contact link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Phone_Number() throws Exception {

			try {
				Log.info("Locating Phone_Number element");
				element = Driver.findElement(By.xpath("//a[contains(@title, '+91-22-61290400')]"));
				Utils.highLight(element);
				Log.info("Contact Number Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Phone_Number");
				Log.error("Contact Number link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Estore_Link() throws Exception {

			try {
				Log.info("Locating Estore_Link element");
				element = Driver.findElement(By.xpath("//a[contains(@title, 'estore@shoppersstop.com')]"));
				Utils.highLight(element);
				Log.info("Store email id Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Estore_Link");
				Log.error("Store email id link is not found under  Footer Section");

				throw (e);

			}
			return element;

		}

		public static WebElement Facebook_Link() throws Exception {
			try {
				Log.info("Locating Facebook_Link element");
				element = Driver.findElement(By.xpath("//*[@class='facebook-icon']/a"));
				Utils.highLight(element);
				Log.info("Facebook Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Facebook_Link");
				Log.error("Facebook link is not found under  Footer Section");

				throw (e);

			}
			return element;
		}
		
		public static WebElement Instagram_Link() throws Exception{
			try{
				Log.info("locating Instagram Link");
				element = Driver.findElement(By.xpath("//*[@class='instagram-icon']/a"));
				Utils.highLight(element);
				Log.info("Located Instagram Link");
			}
			catch(Exception ex){
				Log.info("Unable to locate Instagram Link on Home Page || Method Instagram_Link");
				throw new Exception("Unable to locate Instagram Link on Home Page || Method Instagram_Link");
			}
			return element;
		}
		public static WebElement Twitter_Link() throws Exception {
			try {
				Log.info("Locating Twitter_Link element");
				Thread.sleep(3000);
				element = Driver.findElement(By.xpath("//*[@class='twitter-icon']/a"));
				Utils.highLight(element);
				Log.info("Twitter Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Twitter_Link");
				Log.error("Twitter link is not found under  Footer Section");

				throw (e);

			}
			return element;
		}

		public static WebElement Pinterest_Link() throws Exception {
			try {
				Log.info("Locating Pinterest_Link element");
				element = Driver.findElement(By.xpath("//*[@class='pinterest-icon']/a"));
				Utils.highLight(element);
				Log.info("Pinterest Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method Pinterest_Link");
				Log.error("Pinterest link is not found under  Footer Section");

				throw (e);

			}
			return element;
		}

		public static WebElement GooglePlus_Link() throws Exception {
			try {
				Log.info("Locating GooglePlus_Link element");
				element = Driver.findElement(By.xpath("//*[@class='google-plus-icon']/a"));
				Utils.highLight(element);
				Log.info("GooglePlus Link found under Footer Section");

			} catch (Exception e) {
				Log.error("Exception in Class Home_Page | Method GooglePlus_Link");
				Log.error("GooglePlus link is not found under  Footer Section");

				throw (e);

			}
			return element;
		}

	}

	public static WebElement Search_Box() throws Exception {

		try {
			Log.info("Locating Search_Box element");
			element = Driver.findElement(By.id("js-site-search-input"));
			Utils.highLight(element);
			Log.info("search box field is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method Search_Box");
			Log.error("search box field is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement Search_Btn() throws Exception {

		try {
			Log.info("Locating Search_Btn element");
			element = Driver.findElement(By.xpath("//*[@id='searchbox']/div/form/div/div/button"));
			Utils.highLight(element);
			Log.info("Search button is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method Search_Btn");
			Log.error("Search button is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement WelcomeNote() throws Exception {

		try {
			Log.info("Locating WelcomeNote element");
			element = Driver.findElement(By.xpath("//*[@id='loggedin']/ul/span[1]/li"));
			Utils.highLight(element);
			Log.info("Welcome note is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method WelcomeNote");
			Log.error("Welcome note is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement LogInUserName(String username) throws Exception {

		try {
			Log.info("Locating LogInUserName element");
			element = Driver.findElement(By.xpath("//a[contains(text(),'" + username + "')]"));
			Utils.highLight(element);
			Log.info("Log in username is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method LogInUserName");
			Log.error("Log in username is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement profileLink() throws Exception {

		try {
			Log.info("Locating profileLink element");
			element = Driver.findElement(By.xpath("//a[starts-with(text(), 'Profile')]"));
			Utils.highLight(element);
			Log.info("Profile link is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method profileLink");
			Log.error("Profile link is not found on the home page");
			throw e;
		}

		return element;

	}

	public static WebElement headerStoreLocatorIcon() throws Exception {

		try {
			Log.info("Locating headerStoreLocatorIcon element");
			element = Driver.findElement(By.xpath("//a[@class='locator' and contains(@href,'store-finder')]"));
			Utils.highLight(element);
			Log.info("Store locator icon is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerStoreLocatorIcon");
			Log.error("Store locator icon  is not found on the Header on home page");
			throw e;
		
		}

		return element;

	}

	public static WebElement headerTrackOrder() throws Exception {

		try {
			Log.info("Locating headerTrackOrder element");
			element = Driver.findElement(By.xpath("//a[@class='trackorder' and contains(@href,'trackorders')]"));
			Utils.highLight(element);
			Log.info("Track Order icon is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerTrackOrder");
			Log.error("Track Order icon  is not found on the Header on home page");
			throw e;
		}

		return element;

	}

	public static WebElement headerSoppersStopLogo() throws Exception {

		try {
			Log.info("Locating headerSoppersStopLogo element");
			element = Driver.findElement(By.cssSelector(".logo>a"));
			Utils.highLight(element);
			Log.info("Shoppers Stop logo is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerSoppersStopLogo");
			Log.error("Shoppers Stop logo is not found on the Header on Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement headerSoppersStopLogocheckout() throws Exception {

		try {
			Log.info("Locating headerSoppersStopLogo element");
			element = Driver.findElement(By.xpath("//a[@href='/']"));
			Utils.highLight(element);
			Log.info("Shoppers Stop logo is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerSoppersStopLogo");
			Log.error("Shoppers Stop logo is not found on the Header on Home Page");
			throw e;
		}

		return element;

	}
	
	public static WebElement menuSubCategoryFilter(String categoryTitle, String subCategoryTitle) throws Exception {
		try {
			Log.info("Locating menuSubCategory element");
			element = Driver.findElement(By.xpath("//a[@title='" + categoryTitle
					+ "']/following-sibling::div//a[contains(@href, 'women-westernwear/c-A2060')]"));
			Utils.highLight(element);
			Log.info("Sub Menu Category is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method menuSubCategory");
			Log.error("Sub Menu Category is not found on Home Page");
			throw e;
		}

		return element;
	}
	public static WebElement headerNotificationIcon() throws Exception {

		try {
			Log.info("Locating headerNotificationIcon element");
			element = Driver.findElement(By.xpath("*//div[contains(@class,'user-icons')]/ul/li/a[@class='alerts']"));
			Utils.highLight(element);
			Log.info("Notification icon is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerNotificationIcon");
			Log.error("Notification icon is not found on the Header on Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement headerWishlistIcon() throws Exception {

		try {
			Log.info("Locating headerWishlistIcon element");
			element = Driver.findElement(By.xpath("//a[@class='wishlist']"));
			Utils.highLight(element);
			Log.info("Notification icon is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerWishlistIcon");
			Log.error("Notification icon is not found on the Header on Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement headerWishlistItemCountIcon() throws Exception {

		try {
			Log.info("Locating headerWishlistItemCountIcon element");
			element = Driver
					.findElement(By.xpath("//a[@class='wishlist' and @href='/wishlist']/following-sibling::span"));
			Utils.highLight(element);
			Log.info("Notification icon is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerWishlistItemCountIcon");
			Log.error("Notification icon is not found on the Header on Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement headerMiniCartIcon() throws Exception {

		try {
			Log.info("Locating headerMiniCartIcon element");
			element = Driver.findElement(By.xpath("//*[contains(@class,'minicart') or @id='minicart_id']"));
			Utils.highLight(element);
			Log.info("Notification icon is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerMiniCartIcon");
			Log.error("Notification icon is not found on the Header on Home Page");
			throw e;
		}

		return element;

	}
	public static WebElement contactUs() throws Exception {

		try {
			Log.info("Locating contactUs element");
			element = Driver.findElement(By.cssSelector(".contactus"));
			Utils.highLight(element);
			Log.info("contactUs icon is found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method contactUs");
			Log.error("contactUs icon is not found on the Header on Home Page");
			throw e;
		}

		return element;

	}

	
	public static WebElement headerMiniCartIconclose() throws Exception {

		try {
			Log.info("Locating headerMiniCartIcon element");
			element = Driver.findElement(By.xpath("//*[@id='removeEntry_0']"));
			Utils.highLight(element);
			Log.info("close button found on the Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerMiniCartIcon");
			Log.error("Notification icon is not found on the Header on Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement headerMiniCartItemCountIcon() throws Exception {

		try {
			Log.info("Locating headerMiniCartItemCountIcon element");
			element = Driver.findElement(By.xpath("//span[@class='qtyHeaderMinicart']"));
			Utils.highLight(element);
			Log.info("Item Count icon is found on the mini cart Header on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerMiniCartItemCountIcon");
			Log.error("Item Count icon is not found on the mini cart Header on Home Page");
			throw (e);
		}

		return element;

	}

	public static WebElement headerWishlistMenuHeading() throws Exception {
		try {
			Log.info("Locating headerWishlistMenuHeading element");
			element = Driver.findElement(By.xpath(".//*[@id='wish-scroller']/h3"));
			Utils.highLight(element);
			Log.info("Wishlist alert heading is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerWishlistMenuHeading");
			Log.error("Wishlist alert heading is not found on the Home Page");
			throw e;
		}

		return element;
	}

	public static WebElement headerWishlistMenuText() throws Exception {
		try {
			Log.info("Locating headerWishlistMenuText element");
			element = Driver.findElement(By.xpath(".//*[@id='wish-scroller']/div/p"));
			Utils.highLight(element);
			Log.info("Wishlist alert text is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerWishlistMenuText");
			Log.error("Wishlist alert text is not found on the Home Page");
			throw e;
		}

		return element;

	}

	public static WebElement headerWishlistUserMenu()throws Exception {
		try {
			Log.info("Locating headerWishlistUserMenu elements");
			element = Driver.findElement(By.xpath("//div[contains(@class,'user-icons')]//li[3]/span"));
			Utils.highLight(element);
			Log.info("Wishlist user menu is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerWishlistUserMenu");
			Log.error("Wishlist user menu is not found on the Home Page");
			throw e;
		}

		return element;
	}

	public static WebElement productListHeading()throws Exception {
		try {
			Log.info("Locating productListHeading element");
			element = Driver.findElement(By.xpath("//div[@class='pro-list-heading col-md-4 search-result']/h1"));

			Log.info("Product List Heading is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method productListHeading");
			Log.error("Product List Heading is not found on the Home Page");
			throw e;

		}
		return element;
	}

	public static WebElement seeAllSearchResultButton()throws Exception {
		try {
			Log.info("Locating seeAllSearchResultButton element");
			element = Driver.findElement(By.id("searchAll"));
			Log.info("See All Search Result button is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method seeAllSearchResultButton");
			Log.error("See All Search Result button is not found on the Home Page");
			throw e;
		}
		return element;
	}

	public static WebElement menuSubCategoryClinique(String categoryTitle, String subCategoryTitle) throws Exception {
		try {
			Log.info("Locating menuSubCategory element");
			element = Driver.findElement(By.xpath("//a[@title='" + categoryTitle
					+ "']/following-sibling::div//a[contains(@href, 'brand/all')]"));
			Utils.highLight(element);
			Log.info("Sub Menu Category is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method menuSubCategory");
			Log.error("Sub Menu Category is not found on Home Page");
			throw e;
		}

		return element;
	}
	
	public static WebElement Clinique() throws Exception {

		try {
			Log.info("Locating Clinique Brand element");
			//element = Driver.findElement(By.xpath("//a[contains(@href,'clinique')]"));
			element = Driver.findElement(By.xpath("//a[contains(@href,'clinique?categoryCode=')]"));
			Utils.highLight(element);
			Log.info("Clinique Brand element is found on the Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method Clinique");
			Log.error("Clinique Brand element is not found on the Home Page");
			throw e;
		}

		return element;

	}
	public static WebElement headerNotificationAlert() throws Exception {
		try {
			Log.info("Locating headerNotificationAlert element");
			element = Driver.findElement(By.xpath("//div[@class='alert-wrap']/h3"));
			Utils.highLight(element);
			Log.info("Wishlist alert is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method headerNotificationAlert");
			Log.error("Wishlist alert is not found on the Home Page");
			throw e;
		}

		return element;
	}

	public static WebElement menuCategory(String categoryTitle) throws Exception {
		try {
			Log.info("Locating menuCategory element");
			element = Driver.findElement(By.xpath("//a[@title='" + categoryTitle + "']"));
			Utils.highLight(element);
			Log.info("Menu Category is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method menuCategory");
			Log.error("Menu Category is not found on Home Page");
			throw e;
		}

		return element;
	}

	public static WebElement menuSubCategory(String categoryTitle, String subCategoryTitle) throws Exception {
		try {
			Log.info("Locating menuSubCategory element");
			element = Driver.findElement(By.xpath("//a[@title='" + categoryTitle
					+ "']/following-sibling::div//a[@title='" + subCategoryTitle + "']"));
			Utils.highLight(element);
			Log.info("Sub Menu Category is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method menuSubCategory");
			Log.error("Sub Menu Category is not found on Home Page");
			throw e;
		}

		return element;
	}
	
	public static WebElement menuSubCategoryMain(String categoryTitle,String subCategoryMainTitle) throws Exception {
		try {
			Log.info("Locating menuSubCategory element");
			element = Driver.findElement(By.xpath("//a[@title='"+categoryTitle+"']/following-sibling::div//span/a[text()='"+subCategoryMainTitle+"']"));
			Log.info("Sub Menu Category main span is found on Home Page");
			Utils.highLight(element);
		} catch (Exception e) {
			Log.error("Exception in Class Home_Page | Method menuSubCategoryMain");
			Log.error("Sub Menu Category main span is not found on Home Page");
			throw e;
		}

		return element;
	}
	

	public static WebElement NewsletterEmail() throws Exception {
		try {
			Log.info("Locating NewsletterEmail element");
			element=Driver.findElement(By.xpath(".//*[@id='newsletterEmail']"));
			Utils.highLight(element);	
			Log.info("Newsletter Email subscribe field is found on Grid Box Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Static_Page | Method NewsletterEmail");
			Log.error("Newsletter Email subscribe is not found on Grid Box Home Page");
			throw (e);
		}
		return element;

	}

	public static WebElement NewsLetterButton() throws Exception {
		try {
			Log.info("Locating NewsLetterButton element");
		
			//System.out.println(Driver.findElement(By.xpath("html/body/main/footer/div[2]/div/div/div[2]")).getLocation());
			
		element = Driver.findElement(By.id("newLetterButton"));
		Utils.highLight(element);
			Log.info("Newsletter Subscribe Button is found on Grid Box Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Static_Page | Method NewsLetterButton");
			Log.error("Newsletter Subscribe Button is not found on Grid Box Home Page");
			throw (e);
		}
		return element;

	}

	public static WebElement NewsLetterAlert() throws Exception {
		try {
			Log.info("Locating NewsLetterAlert element");
			element = Driver.findElement(By.xpath(".//*[@id='newsletterSubmitForm']//span"));
			Utils.highLight(element);
			Log.info("NewsLetter Subscription alert is found on Home Page");

		} catch (Exception e) {
			Log.error("Exception in Class Static_Page | Method NewsLetterAlert");
			Log.error("NewsLetter Subscription alert is not found on the Home Page");
			throw e;
		}

		return element;
	}

}
