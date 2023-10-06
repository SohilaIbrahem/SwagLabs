package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import retry.Retry;
import utilities.utlity;

@Epic("Login Feature")
@Story("Login")
public class TC01_LoginTest extends TestBase {

    //TODO: define read test data From Json file
   /* private String username =utlity.getData(System.getProperty("user.dir")+"/src/test/resources/testData/loginData.json","username");
    private String password = utlity.getData(System.getProperty("user.dir")+"/src/test/resources/testData/loginData.json","password");
*/
    //TODO: define read test data From Excel file
  static String username = utlity.getExcelData(1,0,"Sheet1");
    static String password = utlity.getExcelData(1,1,"Sheet1");

    //TODO: positive testcases check login with valid username and password
    @Test (priority = 1 , description = "check login with valid username and password",retryAnalyzer = Retry.class)
    @Description("Login with valid username and password")
    public void LoginTestWithValidData_P()
    {
        new P01_LoginPage(driver).UserAddUSERNAME(username).UserAddPASSWORD(password).UserClickOnLOGIN();
        //TODO: capture screenshot
        utlity.captureScreenshot(driver,"login");
        //TODO:check if login Successfully

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