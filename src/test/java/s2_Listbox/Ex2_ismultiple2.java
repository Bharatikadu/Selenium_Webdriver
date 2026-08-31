package s2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_ismultiple2
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select c=new Select(country);

        boolean result= c.isMultiple();
        System.out.println(result);

        if(result)
        {
            System.out.println("Listbox is multi-selectable");
        }
        else
        {
            System.out.println("Listbox is not multi-selectable");
        }

    }
}
