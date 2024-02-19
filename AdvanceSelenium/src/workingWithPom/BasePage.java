package workingWithPom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	// Step-1:Create constructor
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Step-2: find all the web Elements
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement logoDemoWebShop;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement logInLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishListLink;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchTextBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement headerMenuBOOKS;
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	private WebElement headerMenuCOMPUTERS;
	
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	private WebElement headerMenuELECTRONICS;
	
	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	private WebElement headerMenuAPPARELSHOES;
	
	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	private WebElement headerMenuDIGITALDOWNLOADS;
	
	@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
	private WebElement headerMenuJEWELRY;
	
	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	private WebElement headerMenuGIFTCARDS;
	
	@FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/child::li/child::a")
	private List<WebElement> headerMenu;

//	@FindBys
//	({ 
//			@FindBy(xpath = "(//a[contains(text(),'Books')])[1]"),
//
//			@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]"),
//
//			@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]"),
//
//			@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]"),
//
//			@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]"),
//
//			@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]"),
//
//			@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
//
//	})
//	private List<WebElement> headerMenu;

	public WebElement getLogoDemoWebShop() {
		return logoDemoWebShop;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLogInLink() {
		return logInLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	
	
	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getHeaderMenuBOOKS() {
		return headerMenuBOOKS;
	}

	public WebElement getHeaderMenuCOMPUTERS() {
		return headerMenuCOMPUTERS;
	}

	public WebElement getHeaderMenuELECTRONICS() {
		return headerMenuELECTRONICS;
	}

	public WebElement getHeaderMenuAPPARELSHOES() {
		return headerMenuAPPARELSHOES;
	}

	public WebElement getHeaderMenuDIGITALDOWNLOADS() {
		return headerMenuDIGITALDOWNLOADS;
	}

	public WebElement getHeaderMenuJEWELRY() {
		return headerMenuJEWELRY;
	}

	public WebElement getHeaderMenuGIFTCARDS() {
		return headerMenuGIFTCARDS;
	}

	public List<WebElement> getHeaderMenu() {
		return headerMenu;
	}



}
