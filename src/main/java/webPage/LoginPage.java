package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends WebPageBase {

    @FindBy(id = "kt_header")
    public WebElement checkHi;
    @FindBy(id = "email")
    private WebElement emailTx;
    @FindBy(id = "password")
    private WebElement passwordTx;
    @FindBy(id = "btn_login kt_login_signin_submit")
    private WebElement loginBt;
    @FindBy(xpath = "//*[@id=\"content\"]/div/a")
    private WebElement logoutBt;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void AddEmail (String email){
        emailTx.sendKeys(email);
    }
    public void AddPassWord (String password){
        passwordTx.sendKeys(password);
    }
    public void clickLogin (){
        loginBt.click();
    }
    public void clickLogout (){
        logoutBt.click();
    }
}