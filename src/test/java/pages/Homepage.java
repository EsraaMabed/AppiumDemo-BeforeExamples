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


    public AccessabilityPage clickOnAccessability(){
        driver.findElement(Accessabilitybutton).click();
        return new AccessabilityPage(driver);
    }
    public AppPage clickOnAppbutton(){
        driver.findElement(Appbutton).click();
        return new AppPage(driver);

    }
    public Graphicpage clickOnGraphicsbutton(){
        driver.findElement(Graphicsbutton).click();
        return new Graphicpage(driver);

    }
    public ViewPage clickOnviewsbutton(){
        driver.findElement(Viewsbutton).click();
        return new ViewPage(driver);

    }




}

