package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppPage {
    WebDriver driver;
    private By Activity = new AppiumBy.ByAccessibilityId("Activity");


    public AppPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAcivity() {
        driver.findElement(Activity).click();
    }
}

