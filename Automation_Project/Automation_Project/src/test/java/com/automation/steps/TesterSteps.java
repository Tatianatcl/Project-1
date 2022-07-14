package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {
    

    @Given("the tester is on their correct home page")
    public void the_tester_is_on_their_correct_home_page(){
        TestRunner.driver.get("File://C:/Users/tati/Desktop/Project_Final/src/test/resources/web-pages/login.html");
    }

    @When("the tester accepts the defect")
    public void the_tester_accepts_the_defect(){
        Select testdefect = new Select(TestRunner.driver.findElement(By.name("Accepted")));
        testdefect.selectByVisibleText("accepted");}
    
    

    @When("the tester declines the defect")
    public void the_tester_declines_the_defect(){
        Select testdefect = new Select(TestRunner.driver.findElement(By.name("Accepted")));
        testdefect.selectByVisibleText("declined");}

    

    @When("the tester fix the defect")
    public void the_tester_fix_the_defect(){
        Select testdefect = new Select(TestRunner.driver.findElement(By.name("Fix")));
        testdefect.selectByVisibleText("Fix");
    }
    @When("the tester shelves the defect")
    public void the_tester_shelve_the_defect(){
        Select testdefect = new Select(TestRunner.driver.findElement(By.name("Fix")));
        testdefect.selectByVisibleText("Shelved");
    }


    @When("the tester clicks the submit button")
    public void the_tester_clicks_the_submit_button(){
        TestRunner.tester.clickButton();
    }

    @Then("the tester returns to the login page")
    public void the_tester_returns_to_the_login_page(){
        TestRunner.driver.get("File://C:/Users/tati/Desktop/Project_Final/src/test/resources/web-pages/login.html");
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Login", title);
    }

}
