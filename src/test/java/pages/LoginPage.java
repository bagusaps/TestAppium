package pages;

import io.appium.java_client.android.AndroidDriver;
import setups.AppDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private AndroidDriver androidDriver;

    public LoginPage(){
        this.androidDriver = AppDriver.getDriverInstance();
    }

    private static String LOGIN_PAGE_TITLE_ID = "com.saucelabs.mydemoapp.android:id/loginTV";
    private static String INPUT_USERNAME_LOGIN_ID = "com.saucelabs.mydemoapp.android:id/nameET";
    private static String INPUT_PASSWORD_LOGIN_ID = "com.saucelabs.mydemoapp.android:id/passwordET";
    private static String LOGIN_BUTTON_ID = "com.saucelabs.mydemoapp.android:id/loginBtn";

    public String getLoginPageTitle(){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver.findElementById(LOGIN_PAGE_TITLE_ID).getText();
    }

    public void inputUsernameLogin(String username){
        androidDriver.findElementById(INPUT_USERNAME_LOGIN_ID).sendKeys(username);
    }

    public void inputPasswordLogin(String password){
        androidDriver.findElementById(INPUT_PASSWORD_LOGIN_ID).sendKeys(password);
    }

    public void clickLoginButton(){
        androidDriver.findElementById(LOGIN_BUTTON_ID).click();
    }


}
