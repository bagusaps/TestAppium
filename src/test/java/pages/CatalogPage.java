package pages;

import io.appium.java_client.android.AndroidDriver;
import setups.AppDriver;

public class CatalogPage {

    private AndroidDriver androidDriver;
    public CatalogPage(){
        this.androidDriver = AppDriver.getDriverInstance();
    }
    private static String TITLE_CATALOG_PAGE_ID = "com.saucelabs.mydemoapp.android:id/productTV";
    private static String PRODUCT_LIST_ACCESSIBILITY_ID = "%s";

    public Boolean isCatalogPageDisplayed(){
        return androidDriver.findElementById(TITLE_CATALOG_PAGE_ID).isDisplayed();
    }
    public void clickProduct(String productName){
        String product = String.format(PRODUCT_LIST_ACCESSIBILITY_ID, productName);
        androidDriver.findElementByAccessibilityId(product).click();
    }







}
