import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import Actions.MobileActions;



public class Test_MobileActions {
    WebDriver driver;

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
    }

    @Test
    public void testClickAction() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Access'ibility")).click();
        Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Provider")).getText(), "Accessibility Node Provider");
    }

    @Test

    public void  testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("App")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("Activity")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("Custom Title")).click();
       driver.findElement(new By.ByXPath("//android.widget.EditText[@content-desc=\"Left is best\"]")).clear();
        driver.findElement(new By.ByXPath("//android.widget.EditText[@content-desc=\"Left is best\"]")).sendKeys("Appium");
driver.findElement(new AppiumBy.ByAccessibilityId("Change Left")).click();
    Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Left is best\"]")).getText(),"Appium");
    }


    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Access'ibility")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Querying")).click();
        By button=AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]");
        driver.findElement(button).click();
        Assert.assertEquals(driver.findElement(button).getAttribute("checked"),"true");

    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        MobileActions mobileActions = new MobileActions(driver);
        driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
        MobileActions.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(new AppiumBy.ByAccessibilityId("ScaleToFit")).click();

    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        MobileActions mobileActions = new MobileActions(driver);
        driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
        MobileActions.scrollDownToSpecificText("Vertices");
        driver.findElement(AppiumBy.accessibilityId("Vertices")).click();
        By picture =(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"));

        MobileActions.swipeRightOnElement(picture,driver);
        MobileActions.swipeLeftOnElement(picture);



    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        MobileActions mobileActions = new MobileActions(driver);
        By testRadioButton_locator = AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"All of them\"]");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        MobileActions.scrollDownToSpecificText("Radio Group");
        driver.findElement(AppiumBy.accessibilityId("Radio Group")).click();
        driver.findElement(AppiumBy.accessibilityId("All of them")).click();

        Assert.assertEquals(driver.findElement(testRadioButton_locator).getAttribute("checked"),"true");

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
