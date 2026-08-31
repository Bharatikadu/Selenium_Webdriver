package s2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4_getFirstSelectedOption1
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select c = new Select(colors);

        c.selectByIndex(0);
        c.selectByValue("red");
        c.selectByVisibleText("Red");

        WebElement c1 = c.getFirstSelectedOption();
        System.out.println(c1.getText());

        System.out.println("*********************************************************");

        WebElement c2 = c.getFirstSelectedOption();
        System.out.println(c2.getText());

        System.out.println("**********************************************************");

        System.out.println(c.getFirstSelectedOption().getText());





    }
}
