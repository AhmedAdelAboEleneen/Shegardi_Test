package mobileUserTest;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.Helper;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTestBase {

    public static WebDriver driver;

    // Start driver for android
    @BeforeSuite
    public void startDriver() throws MalformedURLException {

        DesiredCapabilities AndroidObject = new DesiredCapabilities();

        AndroidObject.setCapability("platformName", "Android");

        AndroidObject.setCapability("platformVersion", "11.0");

        AndroidObject.setCapability("deviceName", "Android Emulator");

        AndroidObject.setCapability("appPackage", "com.mnasat.nashmi");

        AndroidObject.setCapability("appActivity", "com.mnasat.nashmi.presentation.splash.SplashActivity");

        AndroidObject.setCapability( "appium:automationName", "UiAutomator2");

        driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/"), AndroidObject);

    }

   /* // Start driver for iOS
    @BeforeSuite
    public void startDriver() throws MalformedURLException {

        DesiredCapabilities iOSObject = new DesiredCapabilities();

        iOSObject.setCapability("platformName", "");

        iOSObject.setCapability("platformVersion", "");

        iOSObject.setCapability("deviceName", "");

        iOSObject.setCapability("appPackage", "");

        iOSObject.setCapability("appActivity", "");

        driver = new IOSDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), iOSObject);

    }*/

    @AfterSuite
    public void stopDriver() {

        driver.quit();
    }

    //Take Screenshot when test case fail and add it in screenshot folder
    @AfterMethod
    public void screenShootsOnFailure(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            System.out.println("Failed!");
            System.out.println("Taking ScreenShot.......");
            Helper.caputreScreenShoot(driver, result.getName());

        }

    }
}