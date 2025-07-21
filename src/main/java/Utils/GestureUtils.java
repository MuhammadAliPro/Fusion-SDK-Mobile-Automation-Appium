package Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class GestureUtils {

    public static void swipeRightToLeft(AppiumDriver driver) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        int startX = (int) (screenWidth * 0.968);
        int endX = (int) (screenWidth * 0.585);
        int y = (int) (screenHeight * 0.499);

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, y));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(895), PointerInput.Origin.viewport(), endX, y));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(swipe));
    }
    public static void TapToBeginButtonTab(AppiumDriver driver) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tapSequence = new Sequence(finger, 1);

        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        // Use percentage-based coordinates for flexibility
        int startX = (int) (screenWidth * 0.357); // 35.7%
        int startY = (int) (screenHeight * 0.883); // 88.3%
        int endX = (int) (screenWidth * 0.406); // 40.6%
        int endY = (int) (screenHeight * 0.884); // 88.4%

        tapSequence.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
        tapSequence.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tapSequence.addAction(finger.createPointerMove(Duration.ofMillis(104), PointerInput.Origin.viewport(), endX, endY));
        tapSequence.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tapSequence));
    }
}
