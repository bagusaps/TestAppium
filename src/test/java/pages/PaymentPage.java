package pages;

import io.appium.java_client.android.AndroidDriver;
import setups.AppDriver;

import java.util.concurrent.TimeUnit;

public class PaymentPage {

    private AndroidDriver androidDriver;

    public PaymentPage(){
        this.androidDriver = AppDriver.getDriverInstance();
    }

    private static String TITLE_PAYMENT_PAGE_ID = "com.saucelabs.mydemoapp.android:id/enterPaymentMethodTV";
    private static String INPUT_FULL_NAME_PAYMENT_ID = "com.saucelabs.mydemoapp.android:id/nameET";
    private static String INPUT_CARD_NUMBER_PAYMENT_ID = "com.saucelabs.mydemoapp.android:id/cardNumberET";
    private static String INPUT_EXPIRATION_DATE_PAYMENT_ID = "com.saucelabs.mydemoapp.android:id/expirationDateET";
    private static String INPUT_SECURITY_CODE_PAYMENT_ID = "com.saucelabs.mydemoapp.android:id/securityCodeET";
    private static String REVIEW_ORDER_BUTTON_ID = "com.saucelabs.mydemoapp.android:id/paymentBtn";

    public String getPaymentTitle(){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver.findElementById(TITLE_PAYMENT_PAGE_ID).getText();
    }

    public void inputFullNamePayment(String fullName){
        androidDriver.findElementById(INPUT_FULL_NAME_PAYMENT_ID).sendKeys(fullName);
    }

    public void inputCardNumberPayment(String cardNumber){
        androidDriver.findElementById(INPUT_CARD_NUMBER_PAYMENT_ID).sendKeys(cardNumber);
    }

    public void inputExpirationDate(String expirationDate){
        androidDriver.findElementById(INPUT_EXPIRATION_DATE_PAYMENT_ID).sendKeys(expirationDate);
    }

    public void inputSecurityCodePayment(String securityCode){
        androidDriver.findElementById(INPUT_SECURITY_CODE_PAYMENT_ID).sendKeys(securityCode);
    }

    public void clickReviewOrderButton(){
        androidDriver.findElementById(REVIEW_ORDER_BUTTON_ID).click();
    }
}
