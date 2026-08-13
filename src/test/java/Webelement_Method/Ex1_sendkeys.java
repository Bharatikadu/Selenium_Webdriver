package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_sendkeys
{
    public  static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement a1 = driver.findElement(By.xpath("//input[@name='username']"));
        a1.sendKeys("Admin");

        /*WebElement a2 = driver.findElement(By.xpath("//label[text()='Password']"));
        a2.sendKeys("admin123");*/

    }
}
