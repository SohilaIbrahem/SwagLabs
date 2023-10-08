package testCases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_AddToCart;
import pages.P03_CheckOut;
import utilities.utlity;

public class TC03_CheckoutInformationTest extends TestBase{

    static Faker faker = new Faker();

    static final String FIRSTNAME = faker.name().fullName();
    static final String LASTNAME = faker.name().lastName();
    static final String POSTALCODE = faker.number().digits(6);
    @Test
    public void checkoutInformationTest() throws InterruptedException {

        new P01_LoginPage(driver).UserAddUSERNAME("standard_user").UserAddPASSWORD("secret_sauce").UserClickOnLOGIN();
        new P02_AddToCart(driver).addProductsToCard(3).UserClickOnCartBtton().getClickOnCheckout();
        new P03_CheckOut(driver).UerEnterFirstName(FIRSTNAME).UerEnterLastName(LASTNAME).
                UerEnterPostalCode(POSTALCODE).UserClickOnContinueButton();
        //TODO : capture screenshot
        utlity.captureScreenshot(driver,"CheckOut");
        //TODO: Assert
        Assert.assertTrue(new P03_CheckOut(driver).Assertion());

    }


}
