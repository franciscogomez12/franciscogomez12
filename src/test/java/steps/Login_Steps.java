package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.CommonMethods;

public class Login_Steps extends CommonMethods {

    @Given("I navegate to facebook login page")
    public void i_navegate_to_facebook_login_page() {
        Assert.assertEquals("Facebook - log in or sign up", driver.getTitle());
    }

    @When("I click in create account")
    public void i_click_in_create_account() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CommonMethods.click(LoginPage.login.createNewAccount_Btn);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("I fill the form")
    public void i_fill_the_form() {

    }

    @Then("Im able to submit the form using pachogomez786123546newsupersecretpassword1")
    public void im_able_to_submit_the_form_using_pachogomez786123546newsupersecretpassword1() {

    }


}
