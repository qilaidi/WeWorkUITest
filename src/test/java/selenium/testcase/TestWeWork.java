package selenium.testcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.page.App;

import java.util.concurrent.TimeUnit;

public class TestWeWork {
    public static App app;
    @BeforeClass
    public static void beforeAll(){
        app = new App();
        app.loginWithCookie();
    }
    @Test
    public void testStart(){
        String name = "demo-1030";
        app.toMemberAdd().add(name, "123123", "13900001231");
    }

    @Test
    public void delete(){
        String name = "demo-1031";
        app.toMemberAdd().add(name, name, "13900001232").delete(name);
    }

    @Test
    public void deleteCurrentPage(){
        app.toContact().deleteCurrentPage();
    }

    @AfterClass
    public static void afterAll() throws InterruptedException {
        app.quit();
    }

}
