package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_AddToCart {

    private WebDriver driver;
    public P02_AddToCart(WebDriver driver)
    {
        this.driver=driver;
    }
    //TODO:define locators
    private final By Item_1 = By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]");
    private final By Item_2 = By.xpath("//body//div[@id='page_wrapper']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]");
    private final By Item_3 = By.xpath("//div[3]//div[3]//button[1]");
    private final By Item_4 = By.xpath("//div[4]//div[3]//button[1]");

    private final By Item_5 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[3]/button[1]");
    private final By Item_6 = By.xpath("//div[6]//div[3]//button[1]");
    private final By Cart  = By.xpath("//*[name()='path' and contains(@fill,'currentCol')]");


    //TODO : define Actions

    public P02_AddToCart UserClickOnAddItem_1() {
        driver.findElement(this.Item_1).click();
       // driver.navigate().back();
        return this;
    }

    public P02_AddToCart UserClickOnAddItem_2() {
        driver.findElement(this.Item_2).click();
        //driver.navigate().back();
        return this;
    }

    public P02_AddToCart UserClickOnAddItem_3() {
        driver.findElement(this.Item_3).click();
        //driver.navigate().back();
        return this;
    }

    public P02_AddToCart UserClickOnAddItem_4() {
        driver.findElement(this.Item_4).click();
        //driver.navigate().back();
        return this;
    }

    public P02_AddToCart UserClickOnAddItem_5() {
        driver.findElement(this.Item_5).click();
        //driver.navigate().back();
        return this;
    }

    public P02_AddToCart UserClickOnAddItem_6() {
        driver.findElement(this.Item_6).click();
        //driver.navigate().back();
        return this;
    }

    public P02_AddToCart UserClickOntCart() {
        driver.findElement(this.Cart).click();
        return this;
    }

}
