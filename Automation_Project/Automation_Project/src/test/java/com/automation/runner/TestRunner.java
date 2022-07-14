import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runnerClass;
import org.openqa.Selenium.WebDriver;
import org.openqa.Selenium.chrome.ChromeDriver;
import org.openqa.Selenium.support.ui.WebDriverWait;

import com.automation.poms.Login;
import com.automation.poms.Manager;
import com.automation.poms.Tester;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucmberSelection;

@RunWith(Cumber.class)
@Cucumber(feature="classpath:features", glue="com/automation/steps")
public class TestRunner {
    //static final
    public static WebDriver driver;
    public static login login;
    public static WebDriverWait wait;
    public static Tester tester;


@BeforeClass //Method initiator
public static void setup(){
    System.setProperty(key:"webdriver.chrome.driver",value:"src/test/resorces/chromdriver.exe")
    driver = new ChromeDriver();
    login = new Login(driver);
    manager = new Manager (driver);
    tester = new Tester(driver);
    wait = new WebDriverWait(driver, 2);
}   

@AfterClass//Makes method execute
public static void teardown(){

}

}