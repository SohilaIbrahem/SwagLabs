package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage {

    private WebDriver driver;

    //Constructor
    public P01_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //TODO: define locator using By
    private final By USERNAME = By.id("user-name");
    private final By PASSWORD = By.id("password");

    private final By LOGIN = By.id("login-button");

    //TODO: add action method
    public P01_LoginPage UserAddUSERNAME(String username) {
        driver.findElement(this.USERNAME).sendKeys(username);
        return this;
    }

    public P01_LoginPage UserAddPASSWORD(String pass) {
        driver.findElement(this.PASSWORD).sendKeys(pass);
        return this;
    }

    public P01_LoginPage UserClickOnLOGIN() {
        driver.findElement(this.LOGIN).click();
        return this;
    }


}
