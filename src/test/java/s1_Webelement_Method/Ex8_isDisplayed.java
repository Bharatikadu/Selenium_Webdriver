package s1_Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_isDisplayed
{
    public static void main(String[] args)
    {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        boolean result = false;

        try
        {
          result = driver.findElement(By.xpath("//a[text()='Online Trainings']")) .isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            System.out.println(e);
        }
        System.out.println(result);

        if(result)
        {
            System.out.println("Displayed");
        }
        else
        {
            System.out.println("Not Displayed");
        }
    }
}
