package s1_Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_isSelected1
{
    public  static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.instagram.com/?hl=en");
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        boolean result= driver.findElement(By.xpath("//input[@id='sunday']")).isSelected();
        System.out.println(result);

        if(result==true)
        {
            System.out.println("Checkbox is selected");
        }
        else
        {
            System.out.println("Checkbox is not selected");
        }

    }
}
