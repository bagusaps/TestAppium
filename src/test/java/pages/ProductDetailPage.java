package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import setups.AppDriver;

import java.util.concurrent.TimeUnit;

public class ProductDetailPage {
    private AndroidDriver androidDriver;
    public ProductDetailPage(){
        this.androidDriver = AppDriver.getDriverInstance();
    }
    private static String TITLE_PRODUCT_DETAIL_PAGE_ID = "com.saucelabs.mydemoapp.android:id/productTV";
    private static String COLOR_ACCESSIBILITY_ID = "%s color";
    private static String INCREASE_ITEM_QUANTITY_ACCESSIBILITY_ID = "Increase item quantity";
    private static String ADD_TO_CART_BUTTON_ID = "com.saucelabs.mydemoapp.android:id/cartBt";
    private static String MY_CART_ICON_ID = "com.saucelabs.mydemoapp.android:id/cartIV";

    public static void scrollToAddToCartSection(AndroidDriver<MobileElement> driver) {
        MobileElement el = (MobileElement) driver.findElementByAndroidUIAutomator(
                "new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().resourceIdMatches(\"" + ADD_TO_CART_BUTTON_ID + "\"));");
    }
    public String getTitleProductDetailPage(){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver.findElementById(TITLE_PRODUCT_DETAIL_PAGE_ID).getText();
    }
    public void clickColorByColorName(String colorName){
        scrollToAddToCartSection(androidDriver);
        String color = String.format(COLOR_ACCESSIBILITY_ID, colorName);
        androidDriver.findElementByAccessibilityId(color).click();
    }
    public void clickIncreaseItemQuantity(){
        scrollToAddToCartSection(androidDriver);
        androidDriver.findElementByAccessibilityId(INCREASE_ITEM_QUANTITY_ACCESSIBILITY_ID).click();
    }

    public void clickAddtoCartButton(){
        scrollToAddToCartSection(androidDriver);
        androidDriver.findElementById(ADD_TO_CART_BUTTON_ID).click();
    }

    public void clickMyCartIcon(){
        androidDriver.findElementById(MY_CART_ICON_ID).click();
    }




}
