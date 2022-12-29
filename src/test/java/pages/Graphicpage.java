package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphicpage {
WebDriver driver;
MobileActions mobileActions ;

private By ScaleToFit=new AppiumBy.ByAccessibilityId("ScaleToFit");
private By Vertices=new AppiumBy.ByAccessibilityId("Vertices");
private By Picture = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]");

    public Graphicpage(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollDown(){
        mobileActions=new MobileActions(driver);
        MobileActions.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(ScaleToFit).click();
    }
    public void scrollDown1(){
        mobileActions=new MobileActions(driver);

        MobileActions.scrollDownToSpecificText("Vertices");
        driver.findElement(Vertices).click();
        MobileActions.swipeRightOnElement(Picture,driver);
        MobileActions.swipeLeftOnElement(Picture);
    }


    }

