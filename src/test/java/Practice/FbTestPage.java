package Practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.time.Duration;

public class FbTestPage
{
    public static  void  main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com");

        FbLoginPage login = new FbLoginPage( driver );
        login.enterUn("Bharati sadar");
        Thread.sleep(2000);
        login.enterPWD("Chaha@123");
        Thread.sleep(2000);
        login.clickLoginButton();
        Thread.sleep(2000);
    }
}
