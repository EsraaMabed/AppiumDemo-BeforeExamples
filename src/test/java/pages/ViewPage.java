package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewPage {
    WebDriver driver;
    MobileActions mobileActions ;

    By RadioGroup = new AppiumBy.ByAccessibilityId("Radio Group");


    public ViewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnRadioPage(){
        mobileActions=new MobileActions(driver);
        MobileActions.scrollDownToSpecificText("Radio Group");
        driver.findElement(RadioGroup).click();
    }
}
