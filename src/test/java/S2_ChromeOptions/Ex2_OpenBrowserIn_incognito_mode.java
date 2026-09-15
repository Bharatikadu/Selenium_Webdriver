package S2_ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex2_OpenBrowserIn_incognito_mode
{
    public static  void main(String[] args)
    {
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--incognito");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }
}
