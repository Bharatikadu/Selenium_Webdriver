package s2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex5_getAllSelectedOption1
{
    public static void main (String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select s =  new Select(colors);

        s.selectByVisibleText("Blue");
        s.selectByIndex(0);
        s.selectByIndex(1);
        s.selectByIndex(2);


        List<WebElement> allSelectedOptions  = s.getAllSelectedOptions();

        for (WebElement o1 : allSelectedOptions)
        {
            System.out.println(o1.getText());
        }
        //System.out.println(allSelectedOptions.size());


    }
}
