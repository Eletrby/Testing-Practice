package todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import todo.base.BasePage;

public class LoginPage extends BasePage {

    private WebDriver driver;
    public LoginPage (WebDriver driver){
        super(driver );
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[data-testid=\"email\"]")
    private WebElement emailInput;
    @FindBy(css = "[data-testid=\"password\"]")
    private WebElement passwordInput;
    @FindBy(css = "[data-testid=\"submit\"]")
    private WebElement submitLogin;

    public ToDoPage login(String email , String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitLogin.click();
        return new ToDoPage(driver);

    }
}

