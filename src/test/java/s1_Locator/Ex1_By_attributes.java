package s1_Locator;

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
         //name
         driver.findElement(By.xpath("//input[@id='name']")).click();
         driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bharati");

         //email
         driver.findElement(By.xpath("//input[@placeholder='Enter EMail']")).click();
         driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bk@gmail.com");

         //phone number
         driver.findElement(By.xpath("//label[text()='Phone']")).click();
         driver.findElement(By.xpath("////label[text()='Phone']")).sendKeys("1234567890");

     }


}
