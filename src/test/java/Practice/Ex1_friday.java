package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_friday
{
    public  static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web.umang.gov.in/web_new/login");

        driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']")).sendKeys("1234567");
    }
}
