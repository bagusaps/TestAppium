package setups;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppDriver {

    private static AndroidDriver driverInstance;

    public static AndroidDriver getDriverInstance() {
        return AppDriver.driverInstance;
    }

    public void setDriverInstance(AndroidDriver instance) {
        AppDriver.driverInstance = instance;
    }
}
