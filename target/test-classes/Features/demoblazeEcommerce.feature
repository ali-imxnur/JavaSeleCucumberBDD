Feature: demoblaze.com

  @Sanity
  Scenario: To verify user is able to login with valid credentials
    Given User launch the browser
    When user enter the url "https://www.demoblaze.com/index.html"
    And clicks on Login link
    And user enters valid username as "aliimanur" and password as "test@123"
    And clicks on Login button again
    Then user is navigated to homepage
    And user clicks on logout and close the browser

  @Regression
  Scenario: To verify user is able to add products into Cart
    Given User launch the browser
    And user enter the url "https://www.demoblaze.com/index.html"
    And clicks on Login link
    And user enters valid username as "aliimanur" and password as "test@123"
    And clicks on Login button again
    Then user is navigated to homepage
    When user clicks on Samsung Galaxy S6 product
    Then product detail page opens with Add to Cart button
    When user clicks on Add to Product button
    Then an alert popped up and accepted
    And user clicks on logout and close the browser

  @Functional
  Scenario Outline: To verify user is able to add multiple product to the cart and place an order
    Given User launch the browser
    And user enter the url "https://www.demoblaze.com/index.html"
    And clicks on Login link
    And user enters valid username as "aliimanur" and password as "test@123"
    And clicks on Login button again
    Then user is navigated to homepage
    When user clicks on Samsung Galaxy S6 product
    Then product detail page opens with Add to Cart button
    When user clicks on Add to Product button
    Then an alert popped up and accepted
    When user clicks on Home hyperlink from Menu
    Then user is navigated to homepage
    When user clicks on Nokia Lumia1520 product
    Then product detail page opens with Add to Cart button
    When user clicks on Add to Product button
    Then an alert popped up and accepted
    When user clicks on Home hyperlink from Menu
    Then user is navigated to homepage
    When user clicks on Samsung Galaxy S7 product
    Then product detail page opens with Add to Cart button
    When user clicks on Add to Product button
    Then an alert popped up and accepted
    When user clicks on Cart hyperlink from Menu
    Then Cart page is opened with all added product with Total price
    When user clicks on Place Order button
    Then Purchase page opened with total price
    When User enters delivary details such as name address as <Name> <Country> <City> <CreditCardNumber> <Month> <Year>
    And user clicks on Purchase button
    Then Thank you for your purchase page is opened
    When user clicks on OK button
    Then user is navigated to homepage
    And user clicks on logout and close the browser

    Examples: 
      | Name     | Country | City      | CreditCardNumber | Month | Year |
      | "Imanur" | "India" | "Kolkata" |           123489 | "May" | 2025 |
