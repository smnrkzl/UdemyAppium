package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class udemyPages {
    static AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    static By BrowseButton = MobileBy.AndroidUIAutomator(" new UiSelector().text(\"Browse\")");
    //static By StayInEnglishButton = MobileBy.AndroidUIAutomator("  new UiSelector().text(\"Stay in English\")");
    static By SignInButton = MobileBy.AndroidUIAutomator(" new UiSelector().text(\"SIGN IN\")");
    static By SignInWithEmailButton = MobileBy.AndroidUIAutomator(" new UiSelector().text(\"Sign in with email\")");
    static By EmailButton = MobileBy.AndroidUIAutomator(" new UiSelector().text(\"Email\")");
    //static By NextButton = MobileBy.AndroidUIAutomator(" new UiSelector().text(\"Next\")");
    static By NextButton = MobileBy.id("com.udemy.android:id/nextBtn");
    static By PasswordButton = MobileBy.AndroidUIAutomator(" new UiSelector().text(\"Password (8+ characters)\")");
    static By SıgnInEndButton = MobileBy.AndroidUIAutomator(" new UiSelector().text(\"Sign In\")");
    public udemyPages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, (10));
        this.elementHelper = new ElementHelper(driver);
    }


    public static void clickBrowseButton() {
        driver.findElement(BrowseButton).click();
    }

    public static void clickSignInButton() {
        driver.findElement(SignInButton).click();
    }

    public static void clickSignInWithEmailButton() {
        driver.findElement(SignInWithEmailButton).click();
    }


    public static void EmailEntered() {
        driver.findElement(EmailButton).sendKeys("semanur@gmail.com");
    }

    public static void clickNextButton() {
        driver.findElement(NextButton).click();
    }

    public static void PasswordEntered() {
        driver.findElement(PasswordButton).sendKeys("123456");
    }

    public static void clickEndSignInButton() {
        driver.findElement(SıgnInEndButton).click();
    }
}
