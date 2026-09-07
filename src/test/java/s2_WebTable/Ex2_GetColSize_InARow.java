package s2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_GetColSize_InARow
{
    public  static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");


        //approach1
        List<WebElement> allrows =driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]/td"));
        int colSize = allrows.size();
        System.out.println("Row Size: " + colSize);

        //app2
        int colsize1 =driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]/td")).size();
        System.out.println("Row Size: " + colsize1);

        //app3
        System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]/td")).size());




    }
}

