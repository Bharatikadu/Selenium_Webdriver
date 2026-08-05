package Webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_GetTitle
{
    public static void main(String[]args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String Title = driver.getTitle();
        System.out.println(Title);

        System.out.println("---------------------");

        System.out.println(driver.getTitle());


    }
}
