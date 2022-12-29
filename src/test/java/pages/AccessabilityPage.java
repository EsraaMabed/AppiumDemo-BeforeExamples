package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccessabilityPage {
  private   By AccessibilityNodeProviderButton =new AppiumBy.ByAccessibilityId("Accessibility Node Provider");
  private By AccessibilityNodeQueryingButton = new AppiumBy.ByAccessibilityId("Accessibility Node Querying");
    WebDriver driver;

    public AccessabilityPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle(){
       return driver.findElement(AccessibilityNodeProviderButton).getText();

    }
    public AccessabilityPage clickOnQueryButton(){
        driver.findElement(AccessibilityNodeQueryingButton).click();
        return new AccessabilityPage(driver);

    }
}
