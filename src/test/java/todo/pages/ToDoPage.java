package todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import todo.base.BasePage;

public class ToDoPage extends BasePage {
    public ToDoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[data-testid=\"welcome\"]")
    private WebElement welcomeMessage;

    @FindBy(css = "[data-testid=\"add\"]")
    private WebElement addButton;

    @FindBy(css = "[data-testid=\"todo-item\"]")
    private WebElement todo;

    @FindBy(css = "[data-testid=\"delete\"]")
    private WebElement delete;

    @FindBy(css = "[data-testid=\"no-todos\"]")
    private WebElement noToDoNessage;





    public boolean isWelcomeDisplayed(){
        return welcomeMessage.isDisplayed();

    }
    public NewToDoPage clickOnPlusButton(){
        addButton.click();
        return new NewToDoPage(driver);
    }
    public String getToDoText (){
        return todo.getText();
    }
    public ToDoPage clickOnDeleteButton(){
        delete.click();
        return this;

    }
    public boolean isNoToDoDisplayed() {
        return noToDoNessage.isDisplayed();
    }

}
