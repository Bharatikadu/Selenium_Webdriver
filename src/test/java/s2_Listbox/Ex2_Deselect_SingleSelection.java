package s2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Ex2_Deselect_SingleSelection
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select s = new Select(colors);

        s.selectByIndex(1);
        s.selectByVisibleText("White");
        Thread.sleep(2000);

        s.deselectByIndex(1);
        s.deselectByVisibleText("White");
        Thread.sleep(2000);

        driver.close();
    }
}
