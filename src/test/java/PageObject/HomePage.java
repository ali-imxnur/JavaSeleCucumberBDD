package PageObject;

import java.time.Duration;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Cart']")
	private WebElement cartMenu;

	@FindBy(xpath = "//div[@id='navbarExample']/ul/li[2]")
	private WebElement contactMenu;

	@FindBy(xpath = "//div[@id='navbarExample']/ul/li[1]")
	private WebElement homeMenu;

	@FindBy(xpath = "//div[@id='navbarExample']/ul/li[3]")
	private WebElement aboutMenu;
	
	@FindBy(xpath = "//a[text()='CATEGORIES']")
	private WebElement categories;
	
	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	private WebElement productSamsungGalaxyS6;

	@FindBy(xpath = "//a[text()='Nokia lumia 1520']")
	private WebElement productNokiaLumia1520;

	@FindBy(xpath = "//a[text()='Nexus 6']")
	private WebElement productNexus6;

	@FindBy(xpath = "//a[text()='Samsung galaxy s7']")
	private WebElement productSamsungGalaxyS7;

	@FindBy(xpath = "//a[text()='Iphone 6 32gb']")
	private WebElement productIphone632gb;

	@FindBy(xpath = "//a[text()='Sony xperia z5']")
	private WebElement productSonyXperiaZ5;

	@FindBy(xpath = "//a[text()='HTC One M9']")
	private WebElement productHTCOneM9;

	@FindBy(xpath = "//a[text()='Sony vaio i5']")
	private WebElement productSonyVaioI5;

	@FindBy(xpath = "//a[text()='Sony vaio i7']")
	private WebElement productSonyVaioI7;

	@FindBy(id = "logout2")
	private WebElement logoutMenu;

	public void clickHomeMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(homeMenu)); 
		homeMenu.click();

	}

	public void clickCartMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(cartMenu)); 
		cartMenu.click();
	}

	public void clickContactMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(contactMenu)); 
		contactMenu.click();
	}

	public void clickAboutMenu() {
		aboutMenu.click();
	}
	
	public boolean categoriesMenu() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(categories)); 
		return categories.isDisplayed();
	}

	public void clickLogOutBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(logoutMenu));
		logoutMenu.click();
	}

	public void clickOnSamsungGalaxyS6() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productSamsungGalaxyS6));
		int retries = 0;
		while (retries < 2) {
			try {
				productSamsungGalaxyS6.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

	public void clickOnSamsungGalaxyS7() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productSamsungGalaxyS7));
		int retries = 0;
		while (retries < 2) {
			try {
				productSamsungGalaxyS7.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

	public void clickOnNokiaLumia1520() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productNokiaLumia1520));
		int retries = 0;
		while (retries < 2) {
			try {
				productNokiaLumia1520.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

	public void clickOnNexus6() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productNexus6));
		int retries = 0;
		while (retries < 2) {
			try {
				productNexus6.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

	public void clickOnIphone6() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productIphone632gb));
		int retries = 0;
		while (retries < 2) {
			try {
				productIphone632gb.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

	public void clickOnSonyXperiaZ5() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productSonyXperiaZ5));
		int retries = 0;
		while (retries < 2) {
			try {
				productSonyXperiaZ5.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

	public void clickOnHTCOneM9() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productHTCOneM9));
		int retries = 0;
		while (retries < 2) {
			try {
				productHTCOneM9.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

	public void clickOnSonyVaioI5() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productSonyVaioI5));
		int retries = 0;
		while (retries < 2) {
			try {
				productSonyVaioI5.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

	public void clickOnSonyVaioI7() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(productSonyVaioI7));
		int retries = 0;
		while (retries < 2) {
			try {
				productSonyVaioI7.click();
				break;
			} catch (StaleElementReferenceException e) {
				// reinitialize page elements
				PageFactory.initElements(driver, this);
				retries++;
			}
		}
	}

}
