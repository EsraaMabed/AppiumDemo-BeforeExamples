package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    WebDriver driver;
   private By Accessabilitybutton = new AppiumBy.ByAccessibilityId("Access'ibility");
   private By Appbutton = new AppiumBy.ByAccessibilityId("App");
   private By Graphicsbutton = new AppiumBy.ByAccessibilityId("Graphics");
   private By Viewsbutton = new AppiumBy.ByAccessibilityId("Views");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnAccessability(){
        driver.findElement(Accessabilitybutton).click();
    }
    public void clickOnAppbutton(){
        driver.findElement(Appbutton).click();
    }
    public void clickOnGraphicsbutton(){
        driver.findElement(Graphicsbutton).click();
    }
    public void clickOnviewsbutton(){
        driver.findElement(Viewsbutton).click();
    }




}

