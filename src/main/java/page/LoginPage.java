package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(xpath = "//*[@id=\"kt_header\"]/kt-topbar/div/kt-user-profile/div/div[1]/div/span[1]")
    public WebElement checkHi;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_login kt_login_signin_submit")
    public WebElement loginBt;
    @FindBy(xpath = "//*[@id=\"content\"]/div/a")
    public WebElement logoutBt;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void AddEmail (String value){
        email.sendKeys(value);
    }
    public void AddPassWord (String value){
        password.sendKeys(value);
    }
    public void clickLogin (){
        loginBt.click();
    }
    public void clickLogout (){
        logoutBt.click();
    }
}