package pages;

import io.appium.java_client.android.AndroidDriver;
import setups.AppDriver;

import java.util.concurrent.TimeUnit;

public class MyCartPage {
    private AndroidDriver androidDriver;

    public MyCartPage(){
        this.androidDriver = AppDriver.getDriverInstance();
    }

    private static String MY_CART_PAGE_TITLE_ID = "com.saucelabs.mydemoapp.android:id/productTV";
    private static String MY_CART_ITEM_NAME_ID = "com.saucelabs.mydemoapp.android:id/titleTV";
    private static String MY_CART_ITEM_QUANTITY_ID = "com.saucelabs.mydemoapp.android:id/noTV";
    private static String MY_CART_ITEM_TOTAL_QUANTITY_ID = "com.saucelabs.mydemoapp.android:id/itemsTV";
    private static String MY_CART_PROCEED_TO_CHECKOUT_BUTTON_ACCESSIBILITY_ID = "Confirms products for checkout";

    public String getMyCartPageTitle(){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver.findElementById(MY_CART_PAGE_TITLE_ID).getText();
    }

    public String getItemName(){
        return androidDriver.findElementById(MY_CART_ITEM_NAME_ID).getText();
    }

    public String getItemQuantity(){
        return androidDriver.findElementById(MY_CART_ITEM_QUANTITY_ID).getText();
    }

    public String getItemTotalQuantity(){
        return androidDriver.findElementById(MY_CART_ITEM_TOTAL_QUANTITY_ID).getText();
    }

    public void clickProceedToCheckoutButton(){
        androidDriver.findElementByAccessibilityId(MY_CART_PROCEED_TO_CHECKOUT_BUTTON_ACCESSIBILITY_ID).click();
    }

}
