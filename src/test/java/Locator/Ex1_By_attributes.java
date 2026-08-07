package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_By_attributes
{
     public  static void main(String[]args)
     {
         WebDriver driver=new ChromeDriver();
         driver.get("https://testautomationpractice.blogspot.com/");
         driver.manage().window().maximize();

         driver.findElement(By.xpath("//input[@id='name']")).click();
         driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Akshay");

     }


}
