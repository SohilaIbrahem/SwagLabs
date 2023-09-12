package testCases;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import utilities.utlity;

public class TC01_LoginTest extends TestBase {

    //TODO: define test data
    private String username ="standard_user";
    private String password = "secret_sauce";

    //TODO: positive testcases check login with valid username and password
    @Test (priority = 1 , description = "check login with valid username and password")
    public void LoginTestWithValidData_P()
    {
        new P01_LoginPage(driver).UserAddUSERNAME(username).UserAddPASSWORD(password).UserClickOnLOGIN();
        //TODO: capture screenshot
        utlity.captureScreenshot(driver,"login");
        //TODO:check if login

    }

    @Test (priority = 2 , description = "check login with Invalid username and password")
    public void LoginTestWithInvalidUsername_N()
    {
        username="test";
        new P01_LoginPage(driver).UserAddUSERNAME(username).UserAddPASSWORD(password).UserClickOnLOGIN();
        //TODO: capture screenshot
        utlity.captureScreenshot(driver,"login");
        //TODO:check if login

    }

    @Test (priority = 3 , description = "check login with valid username and Invalid password")
    public void LoginTestWithInvalidPassword_N()
    {
        password="test";
        new P01_LoginPage(driver).UserAddUSERNAME(username).UserAddPASSWORD(password).UserClickOnLOGIN();
        //TODO: capture screenshot
        utlity.captureScreenshot(driver,"login");
        //TODO:check if login

    }



    @Test (priority = 4 , description = "check login with Invalid username and Invalid password")
    public void LoginTestWithInvalidUsernameAndInvalidPassword_N()
    {
        username="test";
        password="test";
        new P01_LoginPage(driver).UserAddUSERNAME(username).UserAddPASSWORD(password).UserClickOnLOGIN();
        //TODO: capture screenshot
        utlity.captureScreenshot(driver,"login");
        //TODO:check if login

    }




}