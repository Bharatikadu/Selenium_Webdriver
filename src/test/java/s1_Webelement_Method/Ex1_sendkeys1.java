package s1_Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_sendkeys1
{
    public static  void main(String args[])
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement s1 = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        s1.sendKeys("abc");

    }
}
