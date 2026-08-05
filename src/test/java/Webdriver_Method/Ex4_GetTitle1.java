package Webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_GetTitle1
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String Title = driver.getTitle();
        String expTitle = "OrangeHRM";
        System.out.println("-----------------------------");

        if (Title.equals(expTitle))
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
