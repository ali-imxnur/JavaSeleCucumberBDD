package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;

import PageObject.CartPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.ProductDetailsPage;
import io.cucumber.java.en.*;
import utils.DriverManager;

public class PlaceOrderStepDef {

	String totalPrice;
	public WebDriver driver;
	public static LoginPage loginpage;
	public static HomePage homePage;
	public static ProductDetailsPage productDetailsPage;
	public static CartPage cartPage;

	@When("user clicks on Home hyperlink from Menu")
	public void user_clicks_on_home_hyperlink_from_menu() {
		driver = DriverManager.driver;
		loginpage = new LoginPage(driver);
		homePage = new HomePage(driver);
		productDetailsPage = new ProductDetailsPage(driver);
		cartPage = new CartPage(driver);
		homePage.clickHomeMenu();
	}

	@When("user clicks on Nokia Lumia1520 product")
	public void user_clicks_on_nokia_lumia1520_product() {
		homePage.clickOnNokiaLumia1520();
	}

	@When("user clicks on Samsung Galaxy S7 product")
	public void user_clicks_on_samsung_galaxy_s7_product() {
		homePage.clickOnSamsungGalaxyS7();
	}

	@When("user clicks on Cart hyperlink from Menu")
	public void user_clicks_on_cart_hyperlink_from_menu() {
		homePage.clickCartMenu();
	}

	@Then("Cart page is opened with all added product with Total price")
	public void cart_page_is_opened_with_all_added_product_with_total_price() {
		String[] allProducts = cartPage.getAllProducts();

		System.out.println("Products in cart:");
		for (String product : allProducts) {
			System.out.println(" - " + product);
		}

		if (!Arrays.asList(allProducts).contains("Nokia lumia 1520")) {
			throw new AssertionError("Nokia lumia 1520 is not present in the cart!");
		}
		if (!Arrays.asList(allProducts).contains("Samsung galaxy s7")) {
			throw new AssertionError("Samsung galaxy s7 is not present in the cart!");
		}

		// Store total price for later comparison
		totalPrice = cartPage.getTotalPrice();
		System.out.println("Total Price in Cart: " + totalPrice);
	}

	@When("user clicks on Place Order button")
	public void user_clicks_on_place_order_button() {
		cartPage.clickPlaceOrderBtn();
	}

	@Then("Purchase page opened with total price")
	public void purchase_page_opened_with_total_price() {
		String totalPricePurchase = cartPage.getTotalPricePurchase();
		System.out.println("Total Price in Purchase: " + totalPricePurchase);
		if(totalPricePurchase.contains(totalPrice)) {
			System.out.println("Total price is matched -- Perfect");
		}
		else
			System.out.println("Price mismatched - Not Perfect");
		
	}

	@When("User enters delivary details such as name address as {string} {string} {string} {int} {string} {int}")
	public void user_enters_delivary_details_such_as_name_address_as(String name, String country, String city,
			int creditCardNum, String month, int year) {
		cartPage.enterName(name);
		cartPage.enterCountry(country);
		cartPage.enterCity(city);
		cartPage.enterCreditCardNumber(String.valueOf(creditCardNum));
		cartPage.enterMonth(month);
		cartPage.enterYear(String.valueOf(year));
	}

	@And("user clicks on Purchase button")
	public void user_clicks_on_purchase_button() {
		cartPage.clickPurchaseBtn();
	}

	@Then("Thank you for your purchase page is opened")
	public void thank_you_for_your_purchase_page_is_opened() throws InterruptedException {
		String thankYouMsg = cartPage.verifyThankYouMsg();
		assertEquals(thankYouMsg, "Thank you for your purchase!", "Thank you message mismatch");
		Thread.sleep(2000);
	}

	@When("user clicks on OK button")
	public void user_clicks_on_ok_button() {
		cartPage.clickOkBtn();
	}
}
