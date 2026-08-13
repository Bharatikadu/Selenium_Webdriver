package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ex2_Clear
{
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");

        WebElement s1 = driver.findElement(By.xpath("//input[@id='name']"));
        s1.sendKeys("Bharati");
        Thread.sleep(2000);
        s1.clear();
        Thread.sleep(2000);
        s1.sendKeys("Sanavi");
    }
}
