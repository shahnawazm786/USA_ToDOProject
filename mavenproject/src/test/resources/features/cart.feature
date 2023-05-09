@cart
Feature: Cart Feature

  @cart_shoes
  Scenario: Cart item
    Given user visit to login page
    When user select 1.25 shoe
    Then user see 1.45 shoe in the cart
