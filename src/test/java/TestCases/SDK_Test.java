package TestCases;

import Locators.SDK_Locators;
import Pages.All_Pages;
import Utils.DriverManager;
import Utils.GestureUtils;
import Utils.WaitUtils;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.*;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

@Epic("Fusion SDK")
@Feature("Full App Flow")


public class SDK_Test {

    static AndroidDriver driver;
    All_Pages page;

    @BeforeClass
    public void setUp() throws Exception {
        driver = DriverManager.initDriver();
        Thread.sleep(10000);
        page = new All_Pages(driver);
    }

    @Test(priority = 1, description = "Swipe through intro screens and check visibility")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Swipe")
    public void testSwipeGestures() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            GestureUtils.swipeRightToLeft(driver);
            Thread.sleep(1000);
        }

        boolean skip = false;
        if (!skip) {
            // Check the Basic visibility
            assert page.TitleVisible();
            assert page.DesVisible();
            assert page.isGuestButtonVisible();
            assert page.SignIn_Btn_Visible();
        } else {
            throw new SkipException("Skipping test: Visibility check skipped.");
        }
    }

    @Test(priority = 2, description = "Verify successful user sign-in")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Login")
    public void testSignInFlow() throws InterruptedException {
        boolean skip = false;
        if (!skip) {
            page.clickSignInButton();
            Thread.sleep(2000);
            page.SignIn();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @Test(priority = 3, description = "Navigate and close the side menu")
    @Severity(SeverityLevel.NORMAL)
    @Story("Menu Interaction")
    public void testMenuNavigation() {
        boolean skip = false;
        if (!skip) {
            page.openMenu();
            page.closeMenu();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @Test(priority = 4, description = "Submit a bug report with an image attachment")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Bug Reporting")
    public void testBugReportFlow() throws Exception {
        boolean skip = false;
        if (!skip) {
            page.clickReportBug();
            page.Bug_Title_Desc();
            page.Attach();
            page.ClickAddImages();

//            driver.pushFile("/sdcard/Download/Image1.png",
//                    new File("C:\\Users\\Ali Mirza\\IdeaProjects\\Fusion_SDK_Automation\\src\\main\\java\\Fixtures\\Image1.png"));
//            driver.pushFile("/sdcard/Download/Image2.png",
//                    new File("C:\\Users\\Ali Mirza\\IdeaProjects\\Fusion_SDK_Automation\\src\\main\\java\\Fixtures\\Image2.png"));

            page.SelectImage();
            page.ImageUpload();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @Test(priority = 5, description = "Verify that the Images edit")
    @Severity(SeverityLevel.NORMAL)
    @Story("Images Edit")
    public void testImageEdit() throws InterruptedException {
        boolean skip = false;
        if (!skip) {
            page.ImagePreviewEditScreen();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @Test(priority = 6, description = "Verify that the Voice Record")
    @Severity(SeverityLevel.NORMAL)
    @Story("Voice Recording Add and Delete")
    public void testVoiceRecord() throws InterruptedException {
        boolean skip = false;
        if (!skip) {
            page.VoiceRecord();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @Test(priority = 7, description = "Verify that the video recording works with gesture tap")
    @Severity(SeverityLevel.NORMAL)
    @Story("Video Recording")
    public void testVideoRecord() throws InterruptedException {
        boolean skip = false;
        if (!skip) {
            page.VideoRecord();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @Test(priority = 8, description = "Verify that the Assignee Selection")
    @Severity(SeverityLevel.NORMAL)
    @Story("Assignee Section")
    public void testAssignee() throws InterruptedException {
        boolean skip = false;
        if (!skip) {
            page.Add_Assignee();
            assert page.isAssigneeVisible();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @Test(priority = 9, description = "Verify that the Tags Section")
    @Severity(SeverityLevel.NORMAL)
    @Story("Tag Section")
    public void testTags() throws InterruptedException {
        boolean skip = false;
        if (!skip) {
            page.Add_Tags();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @Test(priority = 10, description = "Verify that the Bug submitted successfully")
    @Severity(SeverityLevel.NORMAL)
    @Story("Bug submitted successfully")
    public void testBugSubmit() throws InterruptedException {
        boolean skip = false;
        if (!skip) {
            page.submitBug();
        } else {
            throw new SkipException("Skipping test based on condition");
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Test case executed successfully.");
    }
}