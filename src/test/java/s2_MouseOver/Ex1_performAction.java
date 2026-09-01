package s2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_performAction
{
    public  static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.xpath("")).click();

        //step 1. identify mouse over element
        WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
        login.click();
    }
}
