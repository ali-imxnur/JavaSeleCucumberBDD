package PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login2")
	private WebElement loginLink;
	
	@FindBy(id = "loginusername")
	private WebElement username;
	
	@FindBy(id = "loginpassword")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	private WebElement loginBtn;
	
	@FindBy(id = "nava")
	private WebElement productStore;
	
	
	
	public void clickLoginUrl() {
		loginLink.click();
	}
	public void enterUsername(String us) {
		username.sendKeys(us);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
}
