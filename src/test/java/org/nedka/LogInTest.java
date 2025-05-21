package org.nedka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogInTest {

    //Page URL
    String PAGE_URL_LOGIN = "http://training.skillo-bg.com:4300/users/login";

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    //Element Selection
    String USER_NAME_INPUT_FIELD_XPATH = "//input[contains(@id,\"defaultLoginFormUsername\")]";
    String PASSWORD_INPUT_FIELD_XPATH = "//input[contains(@id,\"defaultLoginFormPassword\")]";
    String LOG_IN_BUTTON_XPATH = "//button[contains(@id,\"sign-in-button\")]";

    @BeforeMethod
    public void tearUp(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void verifyUserTestLogin() throws InterruptedException {
        driver.get(PAGE_URL_LOGIN);

        provideTextInWebElementXPATH("Username or email", "TextUser");

        System.out.println("User can log in.");
    }

    @Test
    public void verifyUserCanNotLoginWithWrongPassword(){
        System.out.println("User can't log in");
    }

    @Test
    public void verifyErrorWhenUserProvideWrongUserName(){
        System.out.println("User can't log in");
    }

    public void provideTextInWebElementXPATH(String webElementSelector, String text) throws InterruptedException {
        //1. Create WebElement
        Thread.sleep(1000);
        String locator = "//input[contains(@placeholder,\""+ webElementSelector +"\")]";

    //1.1. String that contains our localization strategy
     if (driver.findElement(By.cssSelector(locator)).isDisplayed()) {
        WebElement element = driver.findElement(By.cssSelector(locator));
        System.out.println("The web element was found: " + locator);
        element.click();
        element.clear();
        element.sendKeys(text);
     } else {
         System.out.println("The element was not found.");
     }

        System.out.println("The user has provided text: " + text);
             }

    @AfterMethod
    public void tearDownDriver() {
        driver.quit();
    }
}
