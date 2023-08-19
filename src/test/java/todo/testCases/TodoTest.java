package todo.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import todo.base.BaseTest;
import todo.factory.DriverFactory;
import todo.pages.LoginPage;
import todo.pages.NewToDoPage;
import todo.pages.ToDoPage;

public class TodoTest extends BaseTest {

    @Test
    public void newToDo (){
        LoginPage loginPage = new LoginPage(driver);
        String actualResult = loginPage
                        .login("test@testing.com","123456@aA")
                        .clickOnPlusButton()
                        .addNewToDo("learning selenium")
                        .getToDoText();
        Assert.assertEquals(actualResult ,"learning selenium" );



    }
    @Test (enabled = false)
    public void delete(){
        LoginPage loginPage = new LoginPage(driver);
        boolean delete =  loginPage
                .login("test@testing.com" , "123456@aA")
                .clickOnPlusButton()
                .addNewToDo("Learning Selenium")
                .clickOnDeleteButton()
                .isNoToDoDisplayed();
        Assert.assertTrue(delete);

    }
}
