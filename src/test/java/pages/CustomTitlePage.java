package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitlePage {
    WebDriver driver;
    private By PlaceHolder = By.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]");
    private By ChangeLeftButton = new AppiumBy.ByAccessibilityId("Change Left");


    public CustomTitlePage(WebDriver driver) {

        this.driver = driver;
    }
    public void sendText(String name){
        driver.findElement(PlaceHolder).clear();
        driver.findElement(PlaceHolder).sendKeys(name);
        driver.findElement(ChangeLeftButton).click();
    }
public String getText(){
        return driver.findElement(PlaceHolder).getText();
}

}
