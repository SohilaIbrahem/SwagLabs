package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.P02_AddToCart.totalPrice;

public class P04_CheckoutOrderOverview {
    private WebDriver driver;
    public P04_CheckoutOrderOverview(WebDriver driver)
    {

        this.driver=driver;
    }
    private final By subTotalItems = By.xpath("//div[@class=\"summary_subtotal_label\"]");
    private final By finishButton = By.xpath("//a[@class='btn_action cart_button']");

    public P04_CheckoutOrderOverview UserClickOnFinishButton() {
        driver.findElement(this.finishButton).click();
        return this;
    }

    // Assertion Check
    public boolean checkTotalPriceBeforeTax(){
        return driver.findElement(this.subTotalItems).getText().equals("Item total: $"+totalPrice);
    }

}
