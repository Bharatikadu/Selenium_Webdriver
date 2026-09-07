package s2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_SelectCheckbox_OfNameTablet
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//td[text()='Laptop']//parent::tr/td[4]/input")).click();

        driver.findElement(By.xpath("//td[text()='Wireless Earbuds']//parent::tr/td[4]/input")).click();

    }
}
