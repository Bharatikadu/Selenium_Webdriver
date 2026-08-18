package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ex2_Clear1
{
    public  static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement a1 = driver.findElement(By.xpath("//input[@id='_R_1hmkqsqppb6amH1_']"));
        a1.sendKeys("1234");
        Thread.sleep(2000);
        a1.clear();
        a1.sendKeys("5678");
        Thread.sleep(2000);


    }
}
