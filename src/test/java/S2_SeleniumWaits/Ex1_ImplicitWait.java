package S2_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex1_ImplicitWait
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//button[@class='start']")).click();

        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
        driver.switchTo().alert().accept();
    }
}
