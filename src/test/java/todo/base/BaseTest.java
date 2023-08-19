package todo.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import todo.factory.DriverFactory;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp (){
        driver = new DriverFactory().intializeDrive();
    }
    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
