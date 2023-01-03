package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import setups.AppDriver;

import java.util.concurrent.TimeUnit;

public class ShippingAddressPage {

    private AndroidDriver androidDriver;

    public ShippingAddressPage(){
        this.androidDriver = AppDriver.getDriverInstance();
    }

    private static String TITLE_SHIPPING_ADDRESS_PAGE_ID = "com.saucelabs.mydemoapp.android:id/enterShippingAddressTV";

    private static String INPUT_FULL_NAME_SHIPPING_ADDRESS_ID = "com.saucelabs.mydemoapp.android:id/fullNameET";

    private static String INPUT_ADDRESS_LINE_ONE_SHIPPING_ADDRESS_ID = "com.saucelabs.mydemoapp.android:id/address1ET";

    private static String INPUT_CITY_SHIPPING_ADDRESS_ID = "com.saucelabs.mydemoapp.android:id/cityET";

    private static String INPUT_ZIP_CODE_SHIPPING_ADDRESS_ID = "com.saucelabs.mydemoapp.android:id/zipET";

    private static String INPUT_COUNTRY_SHIPPING_ADDRESS_ID = "com.saucelabs.mydemoapp.android:id/countryET";

    private static String TO_PAYMENT_BUTTON_ID = "com.saucelabs.mydemoapp.android:id/paymentBtn";

    public static void scrollToPaymentButton(AndroidDriver<MobileElement> driver) {
        MobileElement el = (MobileElement) driver.findElementByAndroidUIAutomator(
                "new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().resourceIdMatches(\"" + TO_PAYMENT_BUTTON_ID + "\"));");
    }

    public String getShippingAddressTitle(){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver.findElementById(TITLE_SHIPPING_ADDRESS_PAGE_ID).getText();
    }

    public void inputFullNameShippingAddress(String fullName){
        androidDriver.findElementById(INPUT_FULL_NAME_SHIPPING_ADDRESS_ID).sendKeys(fullName);
    }

    public void inputAddressLineOneShippingAddress(String addressLineOne){
        androidDriver.findElementById(INPUT_ADDRESS_LINE_ONE_SHIPPING_ADDRESS_ID).sendKeys(addressLineOne);
    }

    public void inputCityShippingAddress(String city){
        androidDriver.findElementById(INPUT_CITY_SHIPPING_ADDRESS_ID).sendKeys(city);
    }

    public void inputZipCodeShippingAddress(String zipCode){
        androidDriver.findElementById(INPUT_ZIP_CODE_SHIPPING_ADDRESS_ID).sendKeys(zipCode);
    }

    public void inputCountryShippingAddress(String country){
        androidDriver.findElementById(INPUT_COUNTRY_SHIPPING_ADDRESS_ID).sendKeys(country);
    }

    public void clickToPaymentButton(){
        scrollToPaymentButton(androidDriver);
        androidDriver.findElementById(TO_PAYMENT_BUTTON_ID).click();
    }

}
