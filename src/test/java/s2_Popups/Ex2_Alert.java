package s2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Alert
{
    public static  void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        //enter customer Id
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("");

        //click on submit button
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //now we have to get text from alert popup
        String at = driver.switchTo().alert().getText();
        System.out.println("Alert Text" + " : " + at);

        Thread.sleep(10000);

        //click on cancel button from popup
        //driver.switchTo().alert().dismiss();

        //click on okay button from popup
        driver.switchTo().alert().accept();

        Thread.sleep(1000);

        //click ok from 2nd alert popup
        driver.switchTo().alert().accept();

        //enter input in alert popup
        //driver.switchTo().alert().sendKeys("abcde");

        driver.close();
    }
}
