Feature: Manager of my bug catcher application should be able to login their homepages

    Scenario: As a manager I want to sign in so I can view my custom homepage

        Given   the manager is on the login page
        When    the manager enters their correct username
        When    the manager enters their correct password
        When    the manager clicks the login button
        Then    the manager should be logged in to the manager home page

    Scenario: As a manager I want to be able to create a defect and assign it to the chosen tester
       
        Given the manager is on the login page
        When the manager creates a defect 
        When the manager assigns the tester to the defect 
        When the manager clicks the assign button
        Then the defect is assinged to the prospective tester