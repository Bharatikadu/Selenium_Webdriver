package s1_Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_isSelected2
{
    public static void main(String[]args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@value='sunday']")).click();

        boolean result = driver.findElement(By.xpath("//input[@value='sunday']")).isSelected();
        System.out.println(result);

        if(result)
        {
            System.out.println("Checkbox is selected");
        }
        else
        {
            System.out.println("Checkbox is not selected");
        }


    }
}
