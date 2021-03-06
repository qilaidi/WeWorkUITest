package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    public static WebDriver driver;

    public WebElement findElement(By by){
        return driver.findElement(by);
    }
    public List<WebElement> findElements(By by){
        return driver.findElements(by);
    }
    public void waitClickable(By by, int timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(by));
    }
    public void waitClickable(By by){
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(by));
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(by));
    }
    public void waitPageLoad(By by){
//        new WebDriverWait(driver, 5).until(ExpectedConditions.)
    }
    public void quit() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
