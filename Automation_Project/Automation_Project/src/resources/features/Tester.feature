Feature: Users of my bug catcher application should be able to accept a defect and 
   
    Scenario: As a tester I want to sign in so I can view my custom homepage

        Given   the tester is on the login page
        When    the tester enters their correct username
        When    the tester enters their correct password
        When    the tester clicks the login button
        Then    the tester should be logged in to the tester home page

   Scenario: As a tester I want to be able to accept, fix, shelve or decline defects
    
       Given    the tester is on their correct home page
       When     the tester accepts the defect
       When     the tester declines the defect
       When     the tester fixes the defect
       When     the tester shelves the defect
       Then     the tester returns to the login page
