package steps;

import io.cucumber.java.en.Given;

public class Login_Steps {

    @Given("I navegate to facebook login page")
    public void i_navegate_to_facebook_login_page() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
