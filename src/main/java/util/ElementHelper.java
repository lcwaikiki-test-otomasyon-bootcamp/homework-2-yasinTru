package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper {
    WebDriver driver;
   WebDriverWait wait= new WebDriverWait(driver,10);

   Actions action= new Actions(driver);

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
       // this.wait = new WebDriverWait(driver, 10);
        //this.action = new Actions(driver);
    }





}
