package todo.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import todo.base.BaseTest;
import todo.factory.DriverFactory;
import todo.pages.LoginPage;
import todo.pages.ToDoPage;

public class LoginTest extends BaseTest {

    @Test
    public void login (){
        LoginPage loginPage = new LoginPage(driver);
        boolean isDisplayed =
                loginPage
                        .login("test@testing.com","123456@aA")
                        .isWelcomeDisplayed();

        Assert.assertTrue(isDisplayed);

    }
}
