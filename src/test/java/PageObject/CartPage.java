package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	public WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[normalize-space()='Samsung galaxy s6']")
	private WebElement itemSamsungS6;
	@FindBy(xpath = "//td[normalize-space()='Nokia lumia 1520']")
	private WebElement itemNokia1520;
	@FindBy(xpath = "//td[normalize-space()='Samsung galaxy s7']")
	private WebElement itemSamsungS7;
	@FindBy(xpath = "//h3[@id='totalp']")
	private WebElement totalPriceText;
	@FindBy(xpath = "//button[normalize-space()='Place Order']")
	private WebElement placeOrderBtn;
	@FindBy(xpath = "//label[contains(text(),'Total')]")
	private WebElement totalPricePurchase;
	@FindBy(xpath = "//form//input[@id='name']")
	private WebElement inputName;
	@FindBy(xpath = "//form//input[@id='country']")
	private WebElement inputCountry;
	@FindBy(xpath = "//form//input[@id='city']")
	private WebElement inputCity;
	@FindBy(xpath = "//form//input[@id='card']")
	private WebElement inputCreditCard;
	@FindBy(xpath = "//form//input[@id='month']")
	private WebElement inputMonth;
	@FindBy(xpath = "//form//input[@id='year']")
	private WebElement inputYear;
	@FindBy(xpath = "//button[@type='button' and normalize-space()='Purchase']")
	private WebElement purchaseBtn;
	@FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
	private WebElement thankyouMsg;
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement OKBtn;
	
	
	public String[] getAllProducts() {
		String[] products = new String[3];
		products[0] = itemSamsungS6.getText();
		products[1] = itemSamsungS7.getText();
		products[2] = itemNokia1520.getText();
		return products;
	}

	public String getTotalPrice() {
		return totalPriceText.getText();
	}
	
	public void clickPlaceOrderBtn() {
		placeOrderBtn.click();
	}
	
	public String getTotalPricePurchase() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(totalPricePurchase));
		return totalPricePurchase.getText();
	}
	
	public void enterName(String name) {
		inputName.sendKeys(name);
	}
	
	public void enterCountry(String counrty) {
		inputCountry.sendKeys(counrty);
	}
	
	public void enterCity(String city) {
		inputCity.sendKeys(city);
	}
	
	public void enterCreditCardNumber(String credCardNum) {
		inputCreditCard.sendKeys(credCardNum);
	}
	
	public void enterMonth(String month) {
		inputMonth.sendKeys(month);
	}
	
	public void enterYear(String string) {
		inputYear.sendKeys(string);
	}
	
	public void clickPurchaseBtn() {
		purchaseBtn.click();
	}
	
	public String verifyThankYouMsg() {
		return thankyouMsg.getText();
	}
	
	public void clickOkBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(OKBtn));
		OKBtn.click();
	}

}
