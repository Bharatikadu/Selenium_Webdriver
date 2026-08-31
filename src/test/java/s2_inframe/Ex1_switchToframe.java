package s2_inframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_switchToframe
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");


        //switch to frame
        //driver.switchTo().frame("");
        driver.switchTo().frame(driver.findElement(By.xpath("")));

        driver.findElement(By.xpath("//button{text()=' Click me to display Date and Time']")).click();
    }
}
