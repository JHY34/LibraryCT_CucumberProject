Feature: AC#1-Verify that As a librarian, I should be able to create a new "User" by clicking "+Add User" button on the Users module.


  Scenario: Add an User
    Given I am on the "Users" module
    When I click  on the "+Add User" button,
    And providing all necessary information and clicking  on "Save changes"
    Then I should be able to create a new  "User" which will be appear on the Users page.