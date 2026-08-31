package s2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_ismultiple1
{
    public  static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select a=new Select(colors);

        boolean result = a.isMultiple();
        System.out.println(result);

        if(result)
        {
            System.out.println("Listbox is multi-seletable");
        }
        else
        {
            System.out.println("Listbox is not single-seletable");
        }
    }
}
