package com.automation.steps;

import org.junit.Assert;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefectSteps {
    

    @Given("the manager is on their correct home page")
    public void the_manager_is_on_their_correct_home_page(){
        TestRunner.driver.get("File://C:/Users/tati/Desktop/Project_Final/src/test/resources/web-pages/login.html");
    }

    @When("the manager creates the defect in the text box")
    public void the_manager_creates_the_defect_in_the_text_box(){
        TestRunner.manager.enterDefect("defectInput");
    }

    @When("the manager enters the testers username")
    public void the_manager_enters_the_testers_username(){
        TestRunner.manager.enterTester("tester");

    }

    @When("the manager clicks the submit button")
    public void the_manager_clicks_the_submit_button(){
        TestRunner.manager.clickButton();
    }

    @Then("the defect is sent to the tester and the manager returns to the login page")
    public void the_defect_is_sent_to_the_tester_and_the_manager_returns_to_the_login_page(){
        TestRunner.driver.get("File://C:/Users/tati/Desktop/Project_Final/src/test/resources/web-pages/login.html");
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Manager Page", title);
    }

}