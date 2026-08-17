package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_sendkeys2
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement c1 = driver.findElement(By.xpath("//input[@id='_R_1hmkqsqppb6amH1_']"));
        c1.sendKeys("12345");
        Thread.sleep(10000);
        driver.close();

    }
}
