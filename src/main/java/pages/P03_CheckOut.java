package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class P03_CheckOut {
    private WebDriver driver;
    private JavascriptExecutor javascriptExecutor;
    public P03_CheckOut(WebDriver driver)
    {
        this.driver=driver;
        this.javascriptExecutor = (JavascriptExecutor) driver;
    }
    public void scrollToBottom()
    {
        javascriptExecutor.executeScript("scrollBy(0,2500)");
    }


   private final By checkout = By.xpath("//a[@class='btn_action checkout_button']");
   private final By firstName = By.xpath("//input[@id=\"first-name\"]");
    private final By lastName =By.xpath("//input[@id=\"last-name\"]");
   private final By postalCode = By.xpath("//input[@id=\"postal-code\"]");
   private final By ContinueButton = By.xpath("//input[@class=\"btn_primary cart_button\"]");
   private final By totalItems = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]/text()[2]");



    public P03_CheckOut UserClickOnCheckout() {
        driver.findElement(this.checkout).click();
        return this;
    }

    public P03_CheckOut UerEnterFirstName(String FName) {
        driver.findElement(this.firstName).sendKeys(FName);
        return this;
    }

    public P03_CheckOut UerEnterLastName(String LName) {
        driver.findElement(this.lastName).sendKeys(LName);
        return this;
    }

    public P03_CheckOut UerEnterPostalCode(String PCode) {
        driver.findElement(this.postalCode).sendKeys(PCode);
        return this;
    }

    public P03_CheckOut UserClickOnContinueButton() {
        driver.findElement(this.ContinueButton).click();
        return this;
    }

     public double total(double totalItem)
     {
         return ;
     }
    public double calculateTotalItems() {
        String totalItemsText = driver.findElement(this.totalItems).getText().trim();
        double total = Double.parseDouble(totalItemsText.replaceAll("", ""));
        return total;
    }

    public void assertTotalItems(double expectedTotal) {
        double actualTotal = calculateTotalItems();
        if (actualTotal != expectedTotal) {
            throw new AssertionError("Total items mismatch. Expected: " + expectedTotal + ", Actual: " + actualTotal);
        }
    }

}
