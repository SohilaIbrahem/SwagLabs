package testCases;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_AddToCart;
import pages.P03_CheckOut;
/*tatic Faker faker = new Faker();

static final String FIRSTNAME = faker.name().firstName();
static final String LASTNAME = faker.name().lastName();*/

public class TC04_CheckoutOrderOverviewTest extends TestBase{


    @Test(priority = 1,description = "Check Add Products to List and Validate Total Price")
    public void checkAddProductstoCard() throws InterruptedException {
        new P01_LoginPage(driver).UserAddUSERNAME("standard_user").UserAddPASSWORD("secret_sauce").UserClickOnLOGIN();
        new P02_AddToCart(driver).addProductsToCard(3);
        new P03_CheckOut(driver).UserClickOnContinueButton().UerEnterFirstName("test").
                UerEnterLastName("test").UerEnterPostalCode("0000").UserClickOnContinueButton();


    }
}
