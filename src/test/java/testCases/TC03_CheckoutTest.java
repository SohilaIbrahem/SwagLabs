package testCases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_AddToCart;
import pages.P03_CheckOut;

public class TC03_CheckoutTest extends TestBase{

    static Faker faker = new Faker();

    static final String FIRSTNAME = faker.name().firstName();
    static final String LASTNAME = faker.name().lastName();
    static final String POSTALCODE = faker.number().digits(6);
    double expectedTotal = 129.94;
    @Test
    public void checkoutTest()
    {

        new P02_AddToCart(driver).UserClickOnAddItem_1().UserClickOnAddItem_2().
                UserClickOnAddItem_3().UserClickOnAddItem_4().UserClickOnAddItem_5().
                UserClickOnAddItem_6().UserClickOntCart();

        new P03_CheckOut(driver).UserClickOnCheckout().UerEnterFirstName(FIRSTNAME).UerEnterLastName(LASTNAME).
                UerEnterPostalCode(POSTALCODE).UserClickOnContinueButton();

        Assert.assertEquals(expectedTotal,totalItem);


    }


}
