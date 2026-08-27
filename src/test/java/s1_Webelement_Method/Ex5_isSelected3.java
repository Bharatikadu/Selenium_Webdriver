package s1_Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_isSelected3
{
    public   static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement d1 = driver.findElement(By.xpath("//input[@value='sunday']"));
        d1.click();
        Thread.sleep(2000);

        boolean result = d1.isSelected();
        System.out.println(result);

        if(result)
        {
            System.out.println("Checkbox is selected");
        }
        else {
            System.out.println("Checkbox is not selected");
        }




    }
}
