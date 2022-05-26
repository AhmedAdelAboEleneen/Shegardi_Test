package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    //
    @Test(priority = 1)
    public void Login() {

        loginPage = new LoginPage(driver);
        loginPage.AddEmail("mohamed.ghazaly@shgardi.app");
        loginPage.AddPassWord("123456");
        loginPage.clickLogin();
        //Assert.assertTrue(loginPage.checkHi.getText().contains("Hi,"));

    }
}