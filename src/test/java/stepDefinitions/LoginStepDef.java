package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.CartPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DriverManager;

public class LoginStepDef {

	public static WebDriver driver;
	public static LoginPage loginpage;
	public static HomePage homePage;
	public static CartPage cartPage;

	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Given("User launch the browser")
	public void user_launch_the_browser() {

		System.out.println("Browser is launched");
		loginpage = new LoginPage(driver);
		homePage = new HomePage(driver);
		cartPage = new CartPage(driver);
		DriverManager.driver = driver;
	}

	@When("user enter the url {string}")
	public void user_enter_the_url(String url) {
		driver.get(url);
		System.out.println("Inside Steps - user enters URL: " + url);
	}

	@And("clicks on Login link")
	public void clicks_on_login_link() {
		loginpage.clickLoginUrl();
		System.out.println("Inside Steps - user clicks on login link");
	}

	@And("user enters valid username as {string} and password as {string}")
	public void user_enters_valid_username_as_and_password_as(String username, String password) {
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		System.out.println("Inside Steps - user enters valid username and password");
	}

	@And("clicks on Login button again")
	public void clicks_on_login_button_again() {
		loginpage.clickLoginBtn();
		System.out.println("Inside Steps - user clicks on login button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		boolean isDisplayed = homePage.categoriesMenu();
		if (isDisplayed) {
			System.out.println("Inside Steps - user navigated to homepage");
		} else {
			throw new AssertionError("Homepage not opened - categories menu not displayed");
		}
	}

	@And("user clicks on logout and close the browser")
	public void user_clicks_on_logout_and_close_the_browser() {
		homePage.clickLogOutBtn();
		System.out.println("Inside Steps - user clicks on Logout link");
		// driver.close();
	}
}
