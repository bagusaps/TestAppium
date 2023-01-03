package pages;

import io.appium.java_client.android.AndroidDriver;
import setups.AppDriver;

import java.util.concurrent.TimeUnit;

public class CheckoutCompletePage {

    AndroidDriver androidDriver;

    public CheckoutCompletePage(){
        this.androidDriver = AppDriver.getDriverInstance();
    }
    public static String TITLE_CHECKOUT_COMPLETE_PAGE_ID = "com.saucelabs.mydemoapp.android:id/completeTV";

    public String getTitleCheckoutComplete(){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver.findElementById(TITLE_CHECKOUT_COMPLETE_PAGE_ID).getText();
    }
}
