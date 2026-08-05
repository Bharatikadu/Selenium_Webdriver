package Webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_OpenBrowser
{
    public static void main(String[]args)
    {
        WebDriver driver = new ChromeDriver();
        driver.close();
    }
}
