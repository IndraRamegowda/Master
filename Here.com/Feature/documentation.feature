Feature: Validate all internal links on the web page

Scenario: For given URL validate all internal links on the page if accessible
    Given User should be able to launch the browser 
    When  User should be able to navigate to the required URL
    Then  Get all the Links on the web page 
    Then  Click on all the links in the documentation page and check for 2XX response status
    Then  Validate Angular JS is initialized on the page or not