package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueryPage {
    WebDriver driver;

    private By CheckboxButton = By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]");
    public QueryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnCheckBox(){
        driver.findElement(CheckboxButton).click();
        }
        public String checkStatus(){
      return   driver.findElement(CheckboxButton).getAttribute("checked");
    }

}
