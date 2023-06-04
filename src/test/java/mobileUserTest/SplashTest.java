package mobileUserTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;
import mobileUserPage.SplashPage;

public class SplashTest extends MobileTestBase {

    SplashPage splashPage;

    @Test
    public void Test (){
        splashPage = new SplashPage((AppiumDriver<MobileElement>) driver);
        splashPage.clickNext();
        splashPage.clickNext();
    }
}
