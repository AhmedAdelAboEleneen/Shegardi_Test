package test;

import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends WebTestBase {
    LoginPage loginPage;

    //
    @Test(priority = 1)
    public void Login() {

        loginPage = new LoginPage(driver);
        loginPage.AddEmail("mohamed.ghazaly@shgardi.app");
        loginPage.AddPassWord("123456");
        loginPage.clickLogin();
//        Assert.assertTrue(loginPage.checkHi.getText().contains("Hi,"));

    }
}