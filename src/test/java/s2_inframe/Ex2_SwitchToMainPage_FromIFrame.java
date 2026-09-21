package s2_inframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex2_SwitchToMainPage_FromIFrame
{
        public static  void main(String[] args)
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

            //switch to iframe
            driver.switchTo().frame("iframeResult");

            //click on date nd time button
            driver.findElement(By.xpath("//button[contains(text(),' Date and Time.')]")).click();

            //switch to main page from iframe
            driver.switchTo().parentFrame();
            driver.switchTo().defaultContent();

            //click on mune option from main page
            driver.findElement(By.xpath("//a[@id='menuButton']")).click();

        }
}
