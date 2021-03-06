#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: OLX
  I want to use this template for my feature file

  @tag1
  Scenario: search Product
    Given user should be on home page
    When user will enter <product> in search Field
    And click on search button
    Then user should land on products page
    
    Examples: 
    | product |
    | cars |
    | mobiles |

  @tag2
  Scenario Outline: login
    Given user should be on home age
    When user will click on login
    And user will click on continue with phone
    And user will enter mobile number
    Then user should encounter OTP page

   
