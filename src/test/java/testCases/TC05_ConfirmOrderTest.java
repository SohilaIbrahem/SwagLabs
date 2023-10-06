package testCases;

import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.*;
import utilities.utlity;

import static org.testng.AssertJUnit.assertEquals;
import static testCases.TC03_CheckoutTest.*;

public class TC05_ConfirmOrderTest extends TestBase{


    @Test(priority = 1,description =" User Can Create Order Successfully")
    public void ConfirmationOrder() throws InterruptedException {
        //Login page
        new P01_LoginPage(driver).UserAddUSERNAME("").UserAddPASSWORD("").UserClickOnLOGIN();
        //Add items to cart
        new P02_AddToCart(driver).addProductsToCard(3);
        //Checkout order
        new P03_CheckOut(driver).UserClickOnContinueButton().UerEnterFirstName(FIRSTNAME).UerEnterLastName(LASTNAME).
                                 UerEnterPostalCode(POSTALCODE).UserClickOnContinueButton();
        new P04_CheckoutOrderOverview(driver).UserClickOnFinishButton();
        //Assertion on Subtotal, Tax, Total
        new P05_ConfirmOrder(driver).CheckSubTotalItems();
        new P05_ConfirmOrder(driver).Checktax();
        new P05_ConfirmOrder(driver).CheckTotalItems();

       //Click finish Button
        new P05_ConfirmOrder(driver).UserClickOnFinishButton();

        //TODO : capture screenshot
        utlity.captureScreenshot(driver,"");

        //ToDo: Assert Confirmation Message
        new P05_ConfirmOrder(driver).confirmationMessage();

    }
}
