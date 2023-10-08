package testCases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_AddToCart;
import pages.P03_CheckOut;

import static testCases.TC01_LoginTest.password;
import static testCases.TC01_LoginTest.username;


public class TC04_CheckoutOrderOverviewTest extends TestBase{
     static Faker faker = new Faker();
    static final String FIRSTNAME = faker.name().fullName();
    static final String LASTNAME = faker.name().lastName();
    static final  String ZIP = faker.address().zipCode();

    @Test(priority = 1,description = "Check Add Products to List and Validate Total Price")
    public void checkOrderOverview() throws InterruptedException {
        new P01_LoginPage(driver).UserAddUSERNAME(username).UserAddPASSWORD(password).UserClickOnLOGIN();
        new P02_AddToCart(driver).addProductsToCard(3).UserClickOnCartBtton().getClickOnCheckout();
        new P03_CheckOut(driver).UserClickOnContinueButton().UerEnterFirstName("user").
                UerEnterLastName(LASTNAME).UerEnterPostalCode(ZIP).UserClickOnContinueButton();


    }
}
