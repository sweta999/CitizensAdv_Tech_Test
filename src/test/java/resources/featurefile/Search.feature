Feature:Search Functionality
  As a User I can Search google for Citizens Advice and verifying the search functionality on Citizens Advice Website

#  // Test: 1
  Scenario: As a User I should be able to search for Citizens Advice on Google
    Given I am on Google page
    And   I click on I agree PopUp
    When  I input text Citizens Advice in search box
    And   I click google search button
    And   I click on the Citizens Advice Link
    Then  I should be navigated to Citizens Advice Website
    And   I click England as option
    And   I am on Citizens Advice home page with England Selected

#    // Test: 2
  Scenario Outline: I can see and verify the list of items on the main navigation header of the home page
    Given I am on Google page
    And   I click on I agree PopUp
    When  I input text Citizens Advice in search box
    And   I click google search button
    And   I click on the Citizens Advice Link
    Then  I should be navigated to Citizens Advice Website
    And   I click England as option
    And   I am on Citizens Advice home page with England Selected
    And   I am able to see the list of items
    Then  Verify list of items "<items>" on the main navigation header of the home page.
    Examples:
      | items          |
      | Benefits       |
      | Work           |
      | Debt and money |
      | Consumer       |
      | Housing        |
      | Family         |
      | Law and courts |
      | Immigration    |
      | Health         |
      | More from us   |

#    //Test:3
  Scenario: Search for "Immigration" on home page, verify a link "Staying in the UK on a visa without your partner,
            Navigate to the link and I can see immigration related help under main immigration section.
            I can search for "Immigration on Brexit" on home page and verify search results contain a link to,
            "Staying in the UK on a visa without your partner".
    Given I am on Google page
    And   I click on I agree PopUp
    When  I input text Citizens Advice in search box
    And   I click google search button
    And   I click on the Citizens Advice Link
    Then  I should be navigated to Citizens Advice Website
    And   I click England as option
    And   I am on Citizens Advice home page with England Selected
    When  I click on Immigration tab
    And   Verify I am navigated to Immigration page
    And   Verify search results contain a link Staying in the UK on a visa without your partner
    And   I click on Staying in the UK on a visa without your partner link
    And   I am navigated to Staying in the UK on a visa without your partner page
    Then  Verify I can see immigration related help under main immigration section

