package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    WebDriver driver;
    private By CustomTitle =new AppiumBy.ByAccessibilityId("Custom Title");

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }
    public CustomTitlePage clickOnCustomTitle(){
        driver.findElement(CustomTitle).click();
        return new CustomTitlePage(driver);

    }

}
