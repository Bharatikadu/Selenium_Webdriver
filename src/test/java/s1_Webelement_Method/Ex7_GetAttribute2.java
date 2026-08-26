package s1_Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7_GetAttribute2
{
    public   static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String a2 = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).getAttribute("type");
        System.out.println(a2);
    }
}
