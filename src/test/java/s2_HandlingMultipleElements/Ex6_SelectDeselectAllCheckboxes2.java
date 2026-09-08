package s2_HandlingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class Ex6_SelectDeselectAllCheckboxes2
{
        public  static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://testautomationpractice.blogspot.com/");

            List<WebElement> allcheckboxes = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input[@type='checkbox']"));

            //selecting checkbox
            for(WebElement singlecheckbox : allcheckboxes)
            {
                singlecheckbox.click();
                Thread.sleep(1000);
            }
            //deselecting
            for(WebElement singlecheckbox : allcheckboxes)
            {
                singlecheckbox.click();
                Thread.sleep(1000);
            }
        }
}
