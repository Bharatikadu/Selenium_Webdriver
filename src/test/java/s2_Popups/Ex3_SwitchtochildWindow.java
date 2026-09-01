package s2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchtochildWindow
{
    public static  void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        //click on new tab from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        //get child window id
        Set<String> allId = driver.getWindowHandles();
        ArrayList<String> al = new ArrayList<>(allId);
        String childWindowId= al.get(1);

        //switch to child window
        driver.switchTo().window(childWindowId);

        //click on training link from child window
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();





    }
}
