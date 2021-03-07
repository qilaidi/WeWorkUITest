package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePage{
    public ContactPage add(String username, String id, String phone){
        findElement(By.id("username")).sendKeys(username);
        findElement(By.id("memberAdd_acctid")).sendKeys(id);
        findElement(By.id("memberAdd_phone")).sendKeys(phone);
        findElement(By.linkText("Save")).click();
        return this;
    }

    public ContactPage delete(String keyword){
        findElement(By.id("memberSearchInput")).clear();
        findElement(By.id("memberSearchInput")).sendKeys(keyword);
        try{
            waitClickable(By.linkText("Edit"));
        }catch (Exception e){
            System.out.println("not found");
            return this;
        }
        findElement(By.linkText("Delete")).click();
        findElement(By.linkText("Confirm")).click();
        findElement(By.id("clearMemberSearchInput")).click();
        driver.navigate().refresh();
        return this;
    }

    public void list(){

    }
}
