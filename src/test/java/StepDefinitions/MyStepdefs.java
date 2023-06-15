package StepDefinitions;

import io.cucumber.java.en.When;
import pages.udemyPages;
import util.DriverFactory;

public class MyStepdefs {
    udemyPages udemyPage = new udemyPages(DriverFactory.getDriver());
    @When("Click on the Browse Button")
    public void clickOnTheBrowseButton() {
      udemyPages.clickBrowseButton();
    }

    @When("Click on the Sign In Button")
    public void clickOnTheSignInButton() {
        udemyPages.clickSignInButton();
    }

    @When("Click on the Sign In With Email Button")
    public void clickOnTheSignInWithEmailButton() {
        udemyPages.clickSignInWithEmailButton();
    }

    @When("The email is entered")
    public void theEmailIsEntered() {
        udemyPages.EmailEntered();
    }

    @When("Click on the Next Button")
    public void clickOnTheNextButton() {
        udemyPages.clickNextButton();
    }

    @When("The password is entered")
    public void thePasswordIsEntered() {
        udemyPages.PasswordEntered();
    }

    @When("Click on the Sign Inn Button")
    public void clickOnTheSignInnButton() {
        udemyPages.clickEndSignInButton();
    }
}
