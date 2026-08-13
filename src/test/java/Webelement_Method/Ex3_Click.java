package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3_Click
{
    public  static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");

        //click male radio button
        driver.findElement(By.xpath("//input[@id='male']")).click();

        //click on sunday
        driver.findElement(By.xpath("//input[@id='sunday']")).click();

    }
}
