package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueryPage {
    WebDriver driver;

    private By CheckboxButton = By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]");
    public QueryPage(WebDriver driver) {
        this.driver = driver;
    }
    public QueryPage clickOnCheckBox()
    {
        driver.findElement(CheckboxButton).click();
        return new QueryPage(driver);

    }
        public String checkStatus(){
      return   driver.findElement(CheckboxButton).getAttribute("checked");
    }

}
