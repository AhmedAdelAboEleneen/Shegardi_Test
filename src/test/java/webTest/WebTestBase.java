package webTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class WebTestBase {

    public static WebDriver driver;

@Test
    @BeforeTest
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName) {

        if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Link
        driver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");

        // Live Link
        // driver.navigate().to("Link live here");
    }

    @AfterTest
    public void stopDriver() {

      //  driver.quit();
    }

    // Take Screenshot when test case fail and add it in screenshot folder
    @AfterMethod
    public void screenShootsOnFailure(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            System.out.println("Failed!");
            System.out.println("Taking ScreenShot.......");
            //Helper.caputreScreenShoot(driver, result.getName());

        }
    }
}
