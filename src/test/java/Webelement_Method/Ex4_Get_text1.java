package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ex4_Get_text1
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");

        //get text from header element

        String actHeader = driver.findElement(By.xpath("//h1[@class='title']")).getText();
        System.out.println(actHeader);
    }
}
