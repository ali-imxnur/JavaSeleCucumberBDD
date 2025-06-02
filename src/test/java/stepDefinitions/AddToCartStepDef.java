package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.CartPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.ProductDetailsPage;
import io.cucumber.java.en.*;
import utils.DriverManager;

public class AddToCartStepDef {

	public WebDriver driver;
	public static LoginPage loginpage;
	public static HomePage homePage;
	public static ProductDetailsPage productDetailsPage;
	public static CartPage cartPage;

	@When("user clicks on Samsung Galaxy S6 product")
	public void user_clicks_on_samsung_galaxy_s6_product() {
		driver = DriverManager.driver;
		loginpage = new LoginPage(driver);
		homePage = new HomePage(driver);
		productDetailsPage = new ProductDetailsPage(driver);
		cartPage = new CartPage(driver);
		homePage.clickOnSamsungGalaxyS6();
	}

	@Then("product detail page opens with Add to Cart button")
	public void product_detail_page_opens_with_add_to_cart_button() {
		String actualProdName = productDetailsPage.productName();

		System.out.println("Product Name: " + actualProdName);

		boolean isButtonVisible = productDetailsPage.verifyAddToCartBtn();
		assertEquals(isButtonVisible, true, "Add to Cart button not visible");
	}

	@When("user clicks on Add to Product button")
	public void user_clicks_on_add_to_product_button() {
		productDetailsPage.clickAddToCartBtn();
	}

	@Then("an alert popped up and accepted")
	public void an_alert_popped_up_and_accepted() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		String actualAlertText = alert.getText();
		System.out.println("Alert Text: " + actualAlertText);
		alert.accept();
	}
}
