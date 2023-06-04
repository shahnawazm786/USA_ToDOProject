@nopcommerce
Feature: Home Page

@homepage @nopsanity
  Scenario: Home Page Activity
    Given Validate home page title
    When clik on get started
    Then verify the title of the page
   
@productpage  @nopsanity
  Scenario: Product Page Activity
    Given Validate home page title
    When clik on product menu
    Then verify the title of the product page
 