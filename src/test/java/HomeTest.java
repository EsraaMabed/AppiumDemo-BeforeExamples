import Actions.MobileActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HomeTest {
    WebDriver driver;
    Homepage homepage;
    AccessabilityPage accessabilityPage;
    AppPage appPage;
    ActivityPage activityPage;
    CustomTitlePage customTitlePage;
    QueryPage querypage;
    MobileActions mobileActions;
    Graphicpage graphicpage;
    ViewPage viewPage;
    RadioButtonPage radioButtonPage;


    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Esraa");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        homepage = new Homepage(driver);
        accessabilityPage = new AccessabilityPage(driver);
        appPage = new AppPage(driver);
        activityPage = new ActivityPage(driver);
        customTitlePage = new CustomTitlePage(driver);
        querypage = new QueryPage(driver);
        mobileActions = new MobileActions(driver);
        graphicpage = new Graphicpage(driver);
        viewPage=new ViewPage(driver);
        radioButtonPage=new RadioButtonPage(driver);

    }

    @Test
    public void test_click_Action() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homepage.clickOnAccessability();
        Assert.assertEquals(accessabilityPage.getTitle(), "Accessibility Node Provider");

    }

    @Test
    public void test_typing1() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homepage.clickOnAppbutton();
        appPage.clickOnAcivity();
        activityPage.clickOnCustomTitle();
        customTitlePage.sendText("Appium");
        Assert.assertEquals(customTitlePage.getText(), "Appium");
    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homepage.clickOnAccessability();
        accessabilityPage.clickOnQueryButton();
        querypage.clickOnCheckBox();
        Assert.assertEquals(querypage.checkStatus(), "true");

    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        homepage.clickOnGraphicsbutton();
        graphicpage.scrollDown();

    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homepage.clickOnGraphicsbutton();
        graphicpage.scrollDown1();
    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homepage.clickOnviewsbutton();
        viewPage.clickOnRadioPage();
        radioButtonPage.clickOnRadioButton();
       Assert.assertEquals(radioButtonPage.checkStatus2(),"true");

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}