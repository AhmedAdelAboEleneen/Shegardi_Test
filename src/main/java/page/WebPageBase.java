package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebPageBase {

    // create constructor
    public WebPageBase(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

}