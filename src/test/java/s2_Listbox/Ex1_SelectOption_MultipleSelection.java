package s2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Ex1_SelectOption_MultipleSelection
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select s = new Select(colors);

        s.selectByVisibleText("Red");
        s.selectByVisibleText("Blue");
        s.selectByVisibleText("green");
        s.selectByIndex(0);
        s.selectByIndex(1);
        s.selectByIndex(2);
    }
}
