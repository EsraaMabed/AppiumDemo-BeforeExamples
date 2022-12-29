package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {
    WebDriver driver;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }
    private By RadioButton=new AppiumBy.ByAccessibilityId("All of them");

    public void clickOnRadioButton(){
        driver.findElement(RadioButton).click();
    }

    public String checkStatus2(){
        return driver.findElement(RadioButton).getAttribute("checked");
    }
}
