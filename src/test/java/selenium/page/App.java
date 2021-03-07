package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App extends BasePage{


    public App loginWithCookie(){
        String url = "https://work.weixin.qq.com/";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        findElement(By.linkText("Login")).click();

        driver.manage().addCookie(new Cookie("wwrtx.refid", "3272727991660583"));
        driver.manage().addCookie(new Cookie("wwrtx.sid", "NuCv9eTzx8KodH3qxSOuJczThAoaqQfNSE8-d9VkuUioe2OFauFVj8VsJTqGlL4S"));

        driver.navigate().refresh();
        return this;
    }

    public ContactPage toContact(){
        findElement(By.linkText("Contacts")).click();
        return new ContactPage();
    }

    public ContactPage toMemberAdd(){
        driver.findElement(By.linkText("Add members")).click();
        return new ContactPage();
    }
}
