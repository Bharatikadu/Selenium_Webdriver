package s2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_HiddenDivision
{
    public static void  main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mobikwik.com/");

        //click on login button
        driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();
        Thread. sleep(10000);

        //perform action on hidden division popup
        //enter mob num

        driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("2356891570");
        driver.close();


    }
}
