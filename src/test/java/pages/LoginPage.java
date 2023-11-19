package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;
public class LoginPage extends CommonMethods {

   @FindBy(xpath = "//*[@data-testid='open-registration-form-button']")
    public WebElement createNewAccount_Btn;
}
