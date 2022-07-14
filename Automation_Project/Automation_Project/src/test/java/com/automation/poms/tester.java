package com.automation.poms;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import java.util.List;

// this class is going to be my Java version of my login webpage
public class Tester {
   
     private WebDriver driver; // this driver will only be used internally (in the class) so it is private

     // get the defect input element from the tester page
     @FindBy(how=How.CLASS_NAME, using="accept_button") 
     public List<WebElement> acceptButtons;


     @FindBy(how=How.CLASS_NAME, using="decline_button") 
     public List<WebElement> declineButtons;

     @FindBy(how=How.CLASS_NAME, using="rejected_button") 
     public List<WebElement> rejectButtons;

     @FindBy(how=How.CLASS_NAME, using="fixed_button") 
     public List<WebElement> fixedButtons;

     @FindBy(how=How.CLASS_NAME, using="shelved_button") 
     public List<WebElement> shelvedButtons;

 

     

     // Constructor method -- public, named after the class, no return type
     public Tester(WebDriver driver){
        this.driver = driver; // this initializes the private driver field

        /*
            The PageFactory class is provided by Selenium and it abstracts away from us the code that handles
            initializing our WebElement fields. We simpply provide the initElements() method with the privite driver
            we initialize above, and the PageFactory class handles the rest!
         */
        PageFactory.initElements(driver,this);
     }

  
     // this method will make selenium click the first accept button in the pending defect table
     public void clickAccept(){

        // to click the first button in the acceptButtons list
        this.acceptButtons.get(0).click();

     }



public void clickDecline(){

    // to click the first button in the acceptButtons list
    this.declineButtons.get(0).click();

 }


public void clickReject(){

    // to click the first button in the acceptButtons list
    this.rejectButtons.get(0).click();

 }

 public void clickFixed(){

    // to click the first button in the acceptButtons list
    this.fixedButtons.get(0).click();

 }



public void clickShelved(){

    // to click the first button in the acceptButtons list
    this.shelvedButtons.get(0).click();

 }


public void clickButton() {
}


public void enterPassword(String string) {
}


public void enterUsername(String string) {
}
}
