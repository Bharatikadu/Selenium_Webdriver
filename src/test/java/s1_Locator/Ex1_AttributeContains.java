package s1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_AttributeContains
{
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@id,'comboBox')]")).click();
        Thread.sleep(20000);

        driver.findElement(By.xpath("//div[contains(@id,'section1')]")).click();
        Thread.sleep(20000);
        driver.close();






    }
}
