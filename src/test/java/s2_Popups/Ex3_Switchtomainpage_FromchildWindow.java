package s2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex3_Switchtomainpage_FromchildWindow
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        //click on new tab from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        //get child window id
        Set<String> allIds = driver.getWindowHandles();
        ArrayList<String> al = new ArrayList<>(allIds);

        //switch to child window
        driver.switchTo().window(al.get(1));

        //click on training link
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
        Thread.sleep(2000);

        //switch to main page
        driver.switchTo().window(al.get(0));
        Thread.sleep(2000);

        //click on newWindow button from main page
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();


    }
}
