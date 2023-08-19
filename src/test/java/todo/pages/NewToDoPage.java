package todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import todo.base.BasePage;

public class NewToDoPage extends BasePage{

    public NewToDoPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(css = "[data-testid=\"new-todo\"]")
    private WebElement newToDoInput;
    @FindBy(css = "[data-testid=\"submit-newTask\"]")
    private WebElement newToDoSubmit;

public ToDoPage addNewToDo(String item){
    newToDoInput.sendKeys(item);
    newToDoSubmit.click();
    return new ToDoPage(driver);
}

}
