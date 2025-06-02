package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
	public WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id=\"tbodyid\"]/h2")
	private WebElement productName;

	@FindBy(xpath = "//div[@id=\"tbodyid\"]/h3")
	private WebElement productPrice;

	@FindBy(xpath = "//div[@id=\"more-information\"]/p")
	private WebElement productDescription;

	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement productAddedAlert;
	
	public String productName() {
		return productName.getText();
	}

	public boolean verifyAddToCartBtn() {
		return addToCartButton.isDisplayed();
	}
	
	public void clickAddToCartBtn() {
		addToCartButton.click();
	}
	

}
