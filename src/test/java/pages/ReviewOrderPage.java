package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import setups.AppDriver;

import java.util.concurrent.TimeUnit;

public class ReviewOrderPage {
    private AndroidDriver androidDriver;

    public ReviewOrderPage(){
        this.androidDriver = AppDriver.getDriverInstance();
    }

    private static String TITLE_REVIEW_ORDER_PAGE_ID = "com.saucelabs.mydemoapp.android:id/enterShippingAddressTV";
    private static String PRODUCT_NAME_REVIEW_ORDER_ID = "com.saucelabs.mydemoapp.android:id/titleTV";
    private static String FULL_NAME_DELIVER_ADDRESS_REVIEW_ORDER_ID = "com.saucelabs.mydemoapp.android:id/fullNameTV";
    private static String ADDRESS_DELIVER_ADDRESS_REVIEW_ORDER_ID = "com.saucelabs.mydemoapp.android:id/addressTV";
    private static String CARD_NAME_PAYMENT_METHOD_REVIEW_ORDER_ID = "com.saucelabs.mydemoapp.android:id/cardHolderTV";
    private static String CARD_NUMBER_PAYMENT_METHOD_REVIEW_ORDER_ID = "com.saucelabs.mydemoapp.android:id/cardNumberTV";
    private static String TOTAL_ITEM_REVIEW_ORDER_ID = "com.saucelabs.mydemoapp.android:id/itemNumberTV";
    private static String PLACE_ORDER_BUTTON_ID = "com.saucelabs.mydemoapp.android:id/paymentBtn";
    private static String LOGISTIC_REVIEW_ORDER_ID = "com.saucelabs.mydemoapp.android:id/dhlTV";

    public void scrollToDetail() {
        MobileElement el = (MobileElement) androidDriver.findElementByAndroidUIAutomator(
                "new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().resourceIdMatches(\""+LOGISTIC_REVIEW_ORDER_ID+"\"));");
    }

    public String getTitleReviewOrder(){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver.findElementById(TITLE_REVIEW_ORDER_PAGE_ID).getText();
    }

    public String getProductNameReviewOrder(){
        return androidDriver.findElementById(PRODUCT_NAME_REVIEW_ORDER_ID).getText();
    }

    public String getFullNameDeliverAddress(){
        return androidDriver.findElementById(FULL_NAME_DELIVER_ADDRESS_REVIEW_ORDER_ID).getText();
    }

    public String getAddressDeliverAddress(){
        return androidDriver.findElementById(ADDRESS_DELIVER_ADDRESS_REVIEW_ORDER_ID).getText();
    }

    public String getCardNamePaymentMethod(){
        return androidDriver.findElementById(CARD_NAME_PAYMENT_METHOD_REVIEW_ORDER_ID).getText();
    }

    public String getCardNumberPaymentMethod(){
        return androidDriver.findElementById(CARD_NUMBER_PAYMENT_METHOD_REVIEW_ORDER_ID).getText();
    }

    public String getTotalItemReviewOrder(){
        return androidDriver.findElementById(TOTAL_ITEM_REVIEW_ORDER_ID).getText();
    }

    public void clickPlaceOrderButton(){
        androidDriver.findElementById(PLACE_ORDER_BUTTON_ID).click();
    }

}
