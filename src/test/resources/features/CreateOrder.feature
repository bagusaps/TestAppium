@CreateOrderFeature
Feature: Create Order Feature

  @Positive @CheckoutComplete
  Scenario Outline: Checkout and create order
    Given user in product catalog page
    When user click product "<itemName>"
    Then user in product "<itemName>" detail page
    When user select color "<color>"
    And user put quantity item is <quantity>
    And user click add to cart
    And user click my cart icon
    Then user in my cart page
    And my cart page item name is "<itemName>"
    And my cart page item quantity is "<quantity>"
    And my cart page item total quantity is "<quantity>"
    When user click proceed to checkout
    Then user in login page
    When user input username "<username>"
    And user input password "<password>"
    And user click login
    Then user in checkout shipping address page
    When user input full name "<customerName>" in checkout shipping address page
    And user input address line one "<addressLine>" in checkout shipping address page
    And user input city "<city>" in checkout shipping address page
    And user input zipcode "<zipCode>" in checkout shipping address page
    And user input country "<country>" in checkout shipping address page
    And user click to payment
    Then user in checkout payment page
    When user input full name "<customerName>" in checkout payment page
    And user input card number "<cardNumber>" in checkout payment page
    And user input expiration date "<cardExpiration>" in checkout payment page
    And user input security code "<cardSecurityCode>" in checkout payment page
    And user click review order
    Then user in review order page
    And review order product name is "<itemName>"
    And scroll to see detail in review order page
    And review order deliver address full name is "<customerName>"
    And review order deliver address address is "<addressLine>"
    And review order payment method card name is "<customerName>"
    And review order payment method card number is "<cardNumber>"
    And review order total items is "<quantity>"
    When user click place order
    Then user in checkout complete page

    Examples:
      | itemName             | color | quantity | username        | password | customerName    | addressLine    | city            | zipCode | country   | cardNumber       | cardExpiration | cardSecurityCode |
      | Sauce Lab Back Packs | Blue  | 2        | bod@example.com | 10203040 | Bagus Pamungkas | Film Residence | Jakarta Selatan | 68371   | Indonesia | 1234567890101112 | 0325           | 345              |


