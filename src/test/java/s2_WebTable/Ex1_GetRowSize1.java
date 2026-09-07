package s2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_GetRowSize1
{
    public  static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");


        //approach1
        List<WebElement> allrows =driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int rowSize = allrows.size();
        System.out.println("Row Size: " + rowSize);

        //app2
        int rowsize1 =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Row Size: " + rowsize1);

        //app3
        System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size());




    }
}
