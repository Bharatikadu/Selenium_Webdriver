package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_Tagname
{   public static void main(String[]args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/bharati%20kadu/IdeaProjects/Selenium%20Webdriver/HtmlFile/Demo1_title.html");
        //for usrname
        driver.findElement(By.tagName("input")).sendKeys("Bharati");

        //password
        driver.findElement(By.tagName("input")).sendKeys("1234");
    }
}
