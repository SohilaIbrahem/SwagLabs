package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.utlity;

import static org.testng.AssertJUnit.assertEquals;
import static testCases.TC01_LoginTest.password;
import static testCases.TC01_LoginTest.username;
import static testCases.TC03_CheckoutInformationTest.*;

public class TC05_ConfirmOrderTest extends TestBase{


    @Test(priority = 1,description =" User Can Create Order Successfully")
    public void ConfirmationOrder() throws InterruptedException {
        //Login page
        new P01_LoginPage(driver).UserAddUSERNAME(username).UserAddPASSWORD(password).UserClickOnLOGIN();
        //Add items to cart
        new P02_AddToCart(driver).addProductsToCard(3).UserClickOnCartBtton().getClickOnCheckout();
        //Checkout order
        new P03_CheckOut(driver).UserClickOnContinueButton().UerEnterFirstName(FIRSTNAME).UerEnterLastName(LASTNAME).
                                 UerEnterPostalCode(POSTALCODE).UserClickOnContinueButton();
        new P05_ConfirmOrder(driver).UserclickOnFinishButton();

        //TODO : capture screenshot
        utlity.captureScreenshot(driver,"ConfirmOrder");

        //ToDo: Assert Confirmation Message
        Assert.assertTrue(new P05_ConfirmOrder(driver).confirmationMessage());

    }
}
