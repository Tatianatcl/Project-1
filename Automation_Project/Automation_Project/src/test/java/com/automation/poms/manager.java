package com.automation.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

// this class is going to be my Java version of my login webpage
public class Manager {
    /*
        By defining what web elements we want to interact with here instead of in the steps themselves we avoid 
        writing "boilerplate" (think redundant/repetitive) code.
     */

     private WebDriver driver; // this driver will only be used internally (in the class) so it is private

     // these web elements need to be referenced in our steps so they are public
     // this tells the PageFactory to find the element with the id username and assign it to this field

     // get the defect input element from the manager page
     @FindBy(id = "defect") 
     public WebElement defectInput;

     // this tells the PageFactory to find the element with the id password and assign it to this field
    @FindBy(id = "testername")
    Findby is not working here.
    Will attempt to get connection in method.
    public Select testerSelectInput;

     // this tells the PageFactory to find the first element created via button tags and assign it to this field
     @FindBy(id = "assignTester" )
     @FindBy(tagName = "button")
     public WebElement assignButton;

 

     // Constructor method -- public, named after the class, no return type
     public Manager(WebDriver driver){
        this.driver = driver; // this initializes the private driver field

        /*
            The PageFactory class is provided by Selenium and it abstracts away from us the code that handles
            initializing our WebElement fields. We simpply provide the initElements() method with the privite driver
            we initialize above, and the PageFactory class handles the rest!
         */
        PageFactory.initElements(driver,this);
     }

     /*
        these methods are public so we can access them in the steps, and their return type is void because 
        the functions do not return any values: they just interact with the web page
     */

     // this method will allow both managers and testers to enter their usernames
     public void enterDefect(String defect){

        // to enter a defect into the input element we use the sendKeys() method
        this.defectInput.sendKeys(defect);

     }
     public void enterDate(String d){

        // to enter a defect into the input element we use the sendKeys() method
        this.datereported.sendKeys(d);

     }
     public void enterStepsToReproduce(String steps){

        // to enter a defect into the input element we use the sendKeys() method
        this.stepstoreproduce.sendKeys(steps);

     }


     // this method will allow both managers and testers to enter their passwords
     public void testerSelect(String testerusername){

        // to enter a password into the input element we use sendKeys() again
        //this.passwordInput.sendKeys(password);
        WebElement t=driver.findElement(By.id("testername"));
        Select select = new Select(t);
        System.out.println("SELECT OBJECT:");
        System.out.println(select);
        select.selectByVisibleText(testerusername);

     }

     // this method will make selenium click on our login button
     public void clickButton(){

        // to click on an element you just use the click() method
        this.assignButton.click();

     }

}