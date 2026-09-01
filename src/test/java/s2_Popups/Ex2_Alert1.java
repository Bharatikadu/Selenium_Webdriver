package s2_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Alert1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("9978563421");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //switch to alert popup
        Alert alt = driver.switchTo().alert();

        //get text from popup
        String Text = alt.getText();
        System.out.println(Text);
        Thread.sleep(1000);

        //click dismiss button on popup
        //alt.dismiss();

        //click ok button on popup
        alt.accept();
        Thread.sleep(1000);

        //click on 2nd popup
        alt.accept();



    }
}
