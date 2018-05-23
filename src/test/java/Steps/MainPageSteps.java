package Steps;

import Pages.EmailPage;
import Pages.MainPage;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class MainPageSteps {

    MainPage mainPage;
    public MainPageSteps() throws IOException {
        this.mainPage = new MainPage();
    }

    @When("^I login with email and password$")
    public void iLoginWithParams(){
        new MainPage().login();
        Assert.assertEquals(new EmailPage().isEmailPage() , true);
    }
}
