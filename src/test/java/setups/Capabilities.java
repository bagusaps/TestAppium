package setups;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Capabilities extends AppDriver{
    private static AndroidDriver ANDROID_DRIVER;

    private AppiumDriverLocalService service;

    protected void preparation() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8");
        capabilities.setCapability("appPackage", "com.saucelabs.mydemoapp.android");
        capabilities.setCapability("appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
        capabilities.setCapability("udid", "emulator-5554");
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service Address: " + service_url);
        ANDROID_DRIVER = new AndroidDriver(new URL(service_url), capabilities);
        ANDROID_DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        setDriverInstance(ANDROID_DRIVER);
    }
    public void stopServer() {
        service.stop();
    }

}
