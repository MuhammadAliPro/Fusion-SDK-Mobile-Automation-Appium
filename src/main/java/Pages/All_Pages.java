package Pages;

import Locators.SDK_Locators;
import Utils.GestureUtils;
import Utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static Utils.WaitUtils.waitForElementToBeVisible;
import static Utils.WaitUtils.waitForSeconds;

public class All_Pages {

    WebDriver driver;

    public All_Pages(WebDriver driver) {
        this.driver = driver;
    }

    public boolean TitleVisible() {
        return driver.findElement(SDK_Locators.Title_Text).isDisplayed();
    }

    public boolean DesVisible() {
        return driver.findElement(SDK_Locators.Description_Text).isDisplayed();
    }

    public boolean isGuestButtonVisible() {
        return driver.findElement(SDK_Locators.Guest_Button).isDisplayed();
    }

    public boolean SignIn_Btn_Visible() {
        return driver.findElement(SDK_Locators.SignIn_Btn_Visible).isDisplayed();
    }

    public void clickSignInButton() {
        driver.findElement(SDK_Locators.SignIn_Click).click();
    }

    public void SignIn() {
        driver.findElement(SDK_Locators.Email_Field).sendKeys("husnain.aqeel@o3interfaces.com");
        driver.findElement(SDK_Locators.Password_Field).sendKeys("Pakistan@100");
        driver.findElement(SDK_Locators.Show_Password).click();
        driver.findElement(SDK_Locators.Submit_SignIn).click();

    }

    public void openMenu() {
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.Menu_Button, 10);
        driver.findElement(SDK_Locators.Menu_Button).click();
    }

    public void closeMenu() {
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.Menu_Close, 5);
        driver.findElement(SDK_Locators.Menu_Close).click();
    }

    public void clickReportBug() {
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.Report_Bug, 10);
        driver.findElement(SDK_Locators.Report_Bug).click();
    }

    public void Bug_Title_Desc() {
        WaitUtils.waitForElementToBeVisible(driver, SDK_Locators.Report_Title, 10);
        driver.findElement(SDK_Locators.Issue_Title).sendKeys("The standard Lorem Ipsum passage");
        driver.findElement(SDK_Locators.Issue_Desc).sendKeys("Testing Automation - Lorem ipsum dolor sit amet, consectetuer adipiscing elit...");
    }

    public void Attach() {
        driver.findElement(SDK_Locators.Attach_btn).click();
    }

    public void ClickAddImages() {
        driver.findElement(SDK_Locators.Add_Images_Btn).click();

    }
    public void SelectImage() {
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.GalleryImage1, 10);
        driver.findElement(SDK_Locators.GalleryImage1).click();
        driver.findElement(SDK_Locators.GalleryImage2).click();
    }
    public void ImageUpload() {
        driver.findElement(SDK_Locators.Image_DoneBtn).click();
    }
    public void ImagePreviewEditScreen() {
        driver.findElement(SDK_Locators.ImagePreviewBtn).click();
        driver.findElement(SDK_Locators.ImageEdit).click();
        driver.findElement(SDK_Locators.DrawIcon).click();

        driver.findElement(SDK_Locators.ColorSelection).click();
        List<By> colorOptions = Arrays.asList(
                SDK_Locators.PurpleColorSelect,
                SDK_Locators.PinkColorSelect,
                SDK_Locators.OrangeColorSelect,
                SDK_Locators.YellowColorSelect,
                SDK_Locators.GreenColorSelect,
                SDK_Locators.WhiteColorSelect,
                SDK_Locators.GrayColorSelect,
                SDK_Locators.BlackColorSelect
        );
        Random random = new Random();
        By randomColor = colorOptions.get(random.nextInt(colorOptions.size()));
        driver.findElement(randomColor).click();
        driver.findElement(SDK_Locators.DotedLine).click();
        driver.findElement(SDK_Locators.BoldLine).click();
        driver.findElement(SDK_Locators.PreviewScreen).click();
        driver.findElement(SDK_Locators.Type).click();
        driver.findElement(SDK_Locators.TextField).sendKeys("Testing Automation");
        driver.findElement(SDK_Locators.SideCLick).click();

        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.Shape, 10);
        driver.findElement(SDK_Locators.Shape).click();
        driver.findElement(SDK_Locators.RoundShape).click();
        driver.findElement(SDK_Locators.DotedRoundShape).click();
        driver.findElement(SDK_Locators.fillRoundShape).click();

        driver.findElement(SDK_Locators.Blur).click();
        driver.findElement(SDK_Locators.DoneEditingBtn).click();
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.ImageDeleteIcon, 10);
        driver.findElement(SDK_Locators.ImageDeleteIcon).click();

        driver.findElement(SDK_Locators.AddMoreAttachImages).click();
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.GalleryImage2, 10);
        driver.findElement(SDK_Locators.GalleryImage2).click();
        driver.findElement(SDK_Locators.Image_DoneBtn).click();
    }
    public void VoiceRecord() {
        driver.findElement(SDK_Locators.VoiceIcon).click();
        driver.findElement(SDK_Locators.TapToBeginVoice).click();
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.AllowRecordAudio, 10);
        driver.findElement(SDK_Locators.AllowRecordAudio).click();
        waitForSeconds(3);
        driver.findElement(SDK_Locators.AudioStopIcon).click();
        driver.findElement(SDK_Locators.AudioDoneBtn).click();

        driver.findElement(SDK_Locators.AddMoreAudio).click();
        waitForSeconds(5);
        driver.findElement(SDK_Locators.AudioStopIcon).click();
        driver.findElement(SDK_Locators.AudioDoneBtn).click();

        driver.findElement(SDK_Locators.OpenAudio).click();
        driver.findElement(SDK_Locators.PlayAudio).click();
        waitForSeconds(3);
        driver.findElement(SDK_Locators.PlayAudio).click();
        driver.findElement(SDK_Locators.DeleteVoiceIcon).click();
        driver.findElement(SDK_Locators.AudioDone).click();

    }
    public void VideoRecord() {
        driver.findElement(SDK_Locators.VideoRecord).click();
        driver.findElement(SDK_Locators.StartRecording).click();
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.StartRecordingScope, 10);
        driver.findElement(SDK_Locators.StartRecordingScope).click();
        driver.findElement(SDK_Locators.SelectEntireScreen).click();
        driver.findElement(SDK_Locators.StartRecordingBtn).click();
        waitForSeconds(2);

        GestureUtils.TapToBeginButtonTab((AppiumDriver) driver);
        WaitUtils.waitForElementToBeVisible(driver, SDK_Locators.NotificationDialog, 10);
        driver.findElement(SDK_Locators.NotificationAllow).click();
        WaitUtils.waitForElementToBeVisible(driver, SDK_Locators.VideoStep1, 5);
        driver.findElement(SDK_Locators.VideoStep1).click();
        waitForSeconds(8);
        GestureUtils.TapToBeginButtonTab((AppiumDriver) driver);
        waitForSeconds(2);
        GestureUtils.TapToBeginButtonTab((AppiumDriver) driver);

    }
    public void Add_Assignee(){
        WaitUtils.waitForElementToBeClickable(driver, SDK_Locators.AssignSection, 10);
        driver.findElement(SDK_Locators.AssignSection).click();
        driver.findElement(SDK_Locators.AddAssignee).click();
        driver.findElement(SDK_Locators.SearchAssignee).sendKeys("Behzad Qasim");
        driver.findElement(SDK_Locators.SelectAssignee).click();
        driver.findElement(SDK_Locators.AddAssigneeBtn).click();
        driver.findElement(SDK_Locators.VerifyAssignee).click();
    }
    public boolean isAssigneeVisible() {return driver.findElement(SDK_Locators.AssigneeIsVisible).isDisplayed(); }

    public void Add_Tags(){
        driver.findElement(SDK_Locators.TagSection).click();
        driver.findElement(SDK_Locators.AddTags).click();
        driver.findElement(SDK_Locators.Tag1).click();
        driver.findElement(SDK_Locators.Tag2).click();
        driver.findElement(SDK_Locators.AddTagsBtn).click();
        driver.findElement(SDK_Locators.VerifyTags).click();
        driver.findElement(SDK_Locators.RemoveTag).click();
        driver.findElement(SDK_Locators.Add_More_Tag).click();
        waitForSeconds(2);
        driver.findElement(SDK_Locators.SearchTags).sendKeys("test");
        driver.findElement(SDK_Locators.ClearSearch).click();
        driver.findElement(SDK_Locators.SearchTags).sendKeys("Functional Issue");
        driver.findElement(SDK_Locators.SelectTag).click();
        driver.findElement(SDK_Locators.AddTagsBtn).click();
    }

    public void submitBug() {
        driver.findElement(SDK_Locators.Bug_Submit).click();
        WaitUtils.waitForElementToBeVisible(driver, SDK_Locators.Bug_Submitted_Dialog, 10);
        driver.findElement(SDK_Locators.Done_btn).click();
    }
}
