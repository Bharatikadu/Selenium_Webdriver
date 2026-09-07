package S2_DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getRatingAndReviewFromFlipkartApp
{
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);

        //click on close icon on popup
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);

        //search for mobile in search box
        driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn26'])[1]")).sendKeys("Nothing 3a pro");
        Thread.sleep(2000);

        //click on search icon
        driver.findElement(By.xpath("(//button[@class='XFwMiH'])[1]")).click();
        Thread.sleep(2000);




    }
}
