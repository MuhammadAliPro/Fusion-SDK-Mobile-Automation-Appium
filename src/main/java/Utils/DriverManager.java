package Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    public static AndroidDriver driver;

    public static AndroidDriver initDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Redmi 13C");
        options.setUdid("VC59TSTG6X8PXCOJ");
        options.setPlatformName("Android");
        options.setPlatformVersion("15");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.production.fusion.sdk");
        options.setAppActivity("com.hostapp.o3interfaces.activities.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, options);
        return driver;
    }
}
