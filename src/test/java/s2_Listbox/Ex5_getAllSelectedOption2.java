package s2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex5_getAllSelectedOption2
{
    public static void main (String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select s =  new Select(colors);




        List<WebElement> allOptions  = s.getOptions();//all address find out by this method

        for (WebElement o1 : allOptions)
        {
            System.out.println(o1.getText());
        }
        //System.out.println(allOptions.size());


    }
}
