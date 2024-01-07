package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//*[@data-testid='open-registration-form-button']")
    public WebElement createNewAccount_Btn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

}
