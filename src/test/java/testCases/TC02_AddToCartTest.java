package testCases;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_AddToCart;
import utilities.utlity;

public class TC02_AddToCartTest extends TestBase{

    @Test
    public void addItemsToCart() throws InterruptedException {

        new P01_LoginPage(driver).UserAddUSERNAME("standard_user").UserAddPASSWORD("secret_sauce").UserClickOnLOGIN();
        new P02_AddToCart(driver).addProductsToCard(3).UserClickOnCartBtton().getClickOnCheckout();
        //TODO : capture screenshot
        utlity.captureScreenshot(driver,"addToCart");

    }

}
