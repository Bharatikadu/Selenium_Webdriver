package s1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_Name
{
    public static void main(String[]args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/bharati%20kadu/IdeaProjects/Selenium%20Webdriver/HtmlFile/Demo1_title.html");

        driver.findElement(By.name("username")).sendKeys("Bharati");

        driver.findElement(By.name("pass")).sendKeys("1234");

    }
}
