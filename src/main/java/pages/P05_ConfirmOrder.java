package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_ConfirmOrder {

    private WebDriver driver;

    public P05_ConfirmOrder(WebDriver driver) {

        this.driver = driver;
    }

    private final By subTotal = By.xpath("//div[@class='summary_subtotal_label']");
    private final By tax = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[6]/text()[2]");
    private final By TotalItems = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[7]/text()[2]");
    private final By finishButton = By.xpath("//a[@class='btn_action cart_button']");
    private final By confirmationMessage = By.xpath("//h2[@class='complete-header']");

    public boolean CheckSubTotalItems() {

        return driver.findElement(this.subTotal).getText().equals("129.94");
    }

    public boolean Checktax() {
        return driver.findElement(this.tax).getText().equals("10.40");
    }

    public boolean CheckTotalItems() {

        return driver.findElement(this.TotalItems).getText().equals("140.34");
    }

    public P05_ConfirmOrder UserClickOnFinishButton() {
        driver.findElement(this.finishButton).click();
        return this;
    }
    public boolean confirmationMessage() {
        return driver.findElement(this.confirmationMessage).getText().equals("THANK YOU FOR YOUR ORDER");
    }
}
