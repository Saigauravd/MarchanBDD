Feature: Marchant portal

  Background:

    Given The user is on Chrome Browser
    When The user enter the URL "https://qaportal.uncode.io/growapps/login".
    And The user Enter Username "winautomationqa@gmail.com"
    And The user Enter  Password "Test@123"
    Then User Successfully Login to Marchant portal


    Scenario: User can able to add product with required field only
    
 When The user click on Click on inventory module and enter the validate input
 And After clicking on save button if the product present in grid view 
 Then Product is successfully added in Inventory
 
    