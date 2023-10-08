package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utilities.NumberGenerator;
import utilities.utlity;

import java.util.Random;

public class P02_AddToCart {

    private WebDriver driver;
    NumberGenerator generator ;
    private JavascriptExecutor javascriptExecutor;
    public P02_AddToCart(WebDriver driver) {

        this.driver = driver;
    }
    public void scrollToBottom()
    {

        javascriptExecutor.executeScript("scrollBy(0,2500)");
    }

    private final By ClickOnCart = By.xpath("//div[@id=\"shopping_cart_container\"]");

    private final By ClickOnCheckout = By.xpath("//a[text()=\"CHECKOUT\"]");

    static float totalPrice = 0;


    //TODO : define Actions

    public P02_AddToCart addProductsToCard(int numOfProducts) throws InterruptedException {
        generator = new NumberGenerator();
        for (int i = 1; i <= numOfProducts; i++) {
            int uniqueRandomNumber = generator.generateUniqueRandomNumber(5);
            driver.findElement(By.xpath("(//button[@class=\"btn_primary btn_inventory\"])[" + uniqueRandomNumber + "]")).click();
//            driver.findElements(addToCartButton).get(i).click();
            totalPrice += utlity.removeFirstLetterAndReturnFloatNumber
                    (driver.findElement(By.xpath("(//div[@class=\"inventory_item_price\"])[" + uniqueRandomNumber + "]")).getText());
            System.out.println(totalPrice);
            Thread.sleep(500);
        }
        System.out.println(totalPrice);
        return this;
    }

    public P02_AddToCart UserClickOnCartBtton() {
        driver.findElement(this.ClickOnCart).click();
        return this;
    }
    public P02_AddToCart getClickOnCheckout() {
        driver.findElement(this.ClickOnCheckout).click();
        return this;
    }

}
