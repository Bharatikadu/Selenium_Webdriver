package s1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_By_text
{
    public static  void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //start button
        driver.findElement(By.xpath("//button[text()='START']")).click();
        //days
        driver.findElement(By.xpath("//label[text()='Days:']")).click();
        //colour
        driver.findElement(By.xpath("//label[text()='Colors:']")).click();

        Thread.sleep(2000);
        //driver.close();






    }
}
