package mobileUserPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import mobileUserPage.MobilePageBase;

public class SplashPage extends MobilePageBase {

    @AndroidFindBy (id = "com.mnasat.nashmi:id/nextView")
    private MobileElement nextBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btn_continue")
    private MobileElement continueBt;

    public SplashPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    public void clickNext (){
        nextBt.click();
    }
}
