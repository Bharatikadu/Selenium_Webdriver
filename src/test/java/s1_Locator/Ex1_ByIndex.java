package s1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_ByIndex
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]")).sendKeys("Pune,Maharashtra");

        driver.close();
    }
}
