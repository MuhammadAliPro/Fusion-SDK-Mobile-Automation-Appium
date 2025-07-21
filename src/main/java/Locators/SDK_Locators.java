package Locators;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class SDK_Locators {

    //Text Visibility Locators
    public static By Title_Text = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvTitle\"]");
    public static By Description_Text = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvDesc\"]");
    public static By Guest_Button = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnGuest\"]");
    public static By SignIn_Btn_Visible = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnSignIn\"]");

    public static By SignIn_Click = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.production.fusion.sdk:id/btnSignIn\")");
    public static By Back_Button = By.xpath("//android.widget.ImageButton[@resource-id=\"com.production.fusion.sdk:id/btnBack\"]");

    //Login Locators
    public static By Email_Field = By.xpath("//android.widget.EditText[@resource-id=\"com.production.fusion.sdk:id/etEmail\"]");
    public static By Password_Field = By.xpath("//android.widget.EditText[@resource-id=\"com.production.fusion.sdk:id/etPassword\"]");
    public static By Show_Password = AppiumBy.accessibilityId("Show password");
    public static By Submit_SignIn = By.xpath("(//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnSignIn\"])[1]");

    //Menu Locators
    public static By Menu_Button = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivMenu\"]");
    public static By Menu_Close = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/btnClose\"]");

    //Bug Report Locators
    public static By Report_Bug = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnReport\"]");
    public static By Report_Title = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvTitle\" and @text=\"Report a Bug\"]");
    public static By Issue_Title = By.xpath("//android.widget.EditText[@resource-id=\"com.production.fusion.sdk:id/etIssueTitle\"]");
    public static By Issue_Desc = By.xpath("//android.widget.EditText[@resource-id=\"com.production.fusion.sdk:id/etIssueDesc\"]");
    public static By Bug_Submit = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnSubmit\"]");
    public static By Bug_Submitted_Dialog = By.xpath("//android.widget.FrameLayout[@resource-id=\"com.production.fusion.sdk:id/design_bottom_sheet\"]/android.view.ViewGroup");
    public static By Done_btn = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnPrimary\"]");

    //Attached Media
    public static By Attach_btn = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivIcon\"])[1]");
    public static By Add_Images_Btn = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnReport\"]");
    public static By GalleryImage1 = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View[2]/android.view.View");
    public static By GalleryImage2 = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.view.View[3]/android.view.View[2]/android.view.View");
    public static By Image_DoneBtn = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.widget.Button");
    public static By ImagePreviewBtn = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/tvCount\"]");
    public static By ImageEdit = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/iv_edit_attachment\"]");
    public static By DrawIcon = By.xpath("(//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.production.fusion.sdk:id/rvTools\"])[2]/android.view.ViewGroup[1]");
    public static By ColorSelection = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/btnSelectedColor\"]");
    public static By PurpleColorSelect = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/image_brush_color\"])[2]");
    public static By PinkColorSelect = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/image_brush_color\"])[3]");
    public static By OrangeColorSelect = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/image_brush_color\"])[4]");
    public static By YellowColorSelect = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/image_brush_color\"])[5]");
    public static By GreenColorSelect = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/image_brush_color\"])[6]");
    public static By WhiteColorSelect = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/image_brush_color\"])[7]");
    public static By GrayColorSelect = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/image_brush_color\"])[8]");
    public static By BlackColorSelect = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/image_brush_color\"])[9]");
    public static By DotedLine = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivIcon\"])[7]");
    public static By BoldLine = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivIcon\"])[10]");
    public static By PreviewScreen = By.xpath("//android.widget.FrameLayout[@resource-id=\"com.production.fusion.sdk:id/imageEditorView\"]");
    public static By Type = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvName\" and @text=\"Type\"]");
    public static By TextField = By.xpath("//android.widget.EditText[@text=\"Type something\"]");
    public static By SideCLick = By.xpath("//android.view.View[@resource-id=\"com.production.fusion.sdk:id/viewShadow\"]");
    public static By Shape = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvName\" and @text=\"Shape\"]");
    public static By RoundShape = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivIcon\"])[7]");
    public static By DotedRoundShape = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivIcon\"])[9]");
    public static By fillRoundShape = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivIcon\"])[10]");
    public static By Blur = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvName\" and @text=\"Blur\"]");
    public static By DoneEditingBtn = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnDone\"]");
    public static By ImageDeleteIcon = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/iv_delete_attachment\"]");
    public static By AddMoreAttachImages = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivAddMoreAttachment\"]");

    //Voice Record Locators
    public static By VoiceIcon = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvName\" and @text=\"Voice\"]");
    public static By TapToBeginVoice = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnReport\"]");
    public static By AllowRecordAudio = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_one_time_button\"]");
    public static By AudioStopIcon = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivAudioAction\"]");
    public static By AudioDoneBtn = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvDone\"]");
    public static By AddMoreAudio = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivAddMore\"]");
    public static By OpenAudio = By.xpath("(//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvRecording\"])[2]");
    public static By PlayAudio = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/btnPlayAudio\"]");
    public static By DeleteVoiceIcon = By.xpath("//android.widget.ImageButton[@resource-id=\"com.production.fusion.sdk:id/btn_delete_voice\"]");
    public static By AudioDone = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvDoneTop\"]");

    //Video Recoding Locators
    public static By VideoRecord = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvName\" and @text=\"Record\"]");
    public static By StartRecording = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnReport\"]");
    public static By StartRecordingScope = By.xpath("//android.widget.TextView[@text=\"A single app\"]");
    public static By SelectEntireScreen = By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Entire screen\"]");
    public static By StartRecordingBtn = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    public static By NotificationDialog = By.xpath("//android.widget.LinearLayout[@resource-id=\"com.android.permissioncontroller:id/grant_dialog\"]");
    public static By NotificationAllow = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    public static By VideoStep1 = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnShowFeature\"]");

    //Assign Locators
    public static By AssignSection = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvName\" and @text=\"Assign\"]");
    public static By AddAssignee = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnReport\"]");
    public static By SearchAssignee = By.xpath("//android.widget.EditText[@resource-id=\"com.production.fusion.sdk:id/etSearch\"]");
    public static By SelectAssignee = By.xpath("//android.view.View[@resource-id=\"com.production.fusion.sdk:id/viewBg\"]");
    public static By AddAssigneeBtn = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnApply\"]");
    public static By VerifyAssignee = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/tvCount\"]");
    public static By AssigneeIsVisible = By.xpath("//android.view.ViewGroup[@resource-id=\"com.production.fusion.sdk:id/viewAssignee\"]");

    //Tags Locators
    public static By TagSection = By.xpath("//android.widget.TextView[@resource-id=\"com.production.fusion.sdk:id/tvName\" and @text=\"Tag\"]");
    public static By AddTags = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnReport\"]");
    public static By Tag1 = By.xpath("(//android.view.View[@resource-id=\"com.production.fusion.sdk:id/viewBg\"])[1]");
    public static By Tag2 = By.xpath("(//android.view.View[@resource-id=\"com.production.fusion.sdk:id/viewBg\"])[2]");
    public static By AddTagsBtn = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/btnApply\"]");
    public static By VerifyTags = By.xpath("//android.widget.Button[@resource-id=\"com.production.fusion.sdk:id/tvCount\"]");
    public static By RemoveTag = By.xpath("(//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivRemove\"])[1]");
    public static By Add_More_Tag = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivAddMore\"]");
    public static By SearchTags = By.xpath("//android.widget.EditText[@resource-id=\"com.production.fusion.sdk:id/etSearch\"]");
    public static By ClearSearch = By.xpath("//android.widget.ImageView[@resource-id=\"com.production.fusion.sdk:id/ivClearSearch\"]");
    public static By SelectTag = By.xpath("//android.view.View[@resource-id=\"com.production.fusion.sdk:id/viewBg\"]");

}
