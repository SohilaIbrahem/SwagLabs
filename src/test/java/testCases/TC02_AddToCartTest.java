package testCases;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_AddToCart;
import utilities.utlity;

public class TC02_AddToCartTest extends TestBase{

    @Test
    public void addItemsToCart()
    {
       // private String username ="standard_user";
       // private String password = "secret_sauce";

        new P01_LoginPage(driver).UserAddUSERNAME("standard_user").UserAddPASSWORD("secret_sauce").UserClickOnLOGIN();
        new P02_AddToCart(driver).UserClickOnAddItem_1().UserClickOnAddItem_2().
                UserClickOnAddItem_3().UserClickOnAddItem_4().UserClickOnAddItem_5().
                UserClickOnAddItem_6().UserClickOntCart();
        //TODO : capture screenshot
        utlity.captureScreenshot(driver,"addToCart");

    }


}
