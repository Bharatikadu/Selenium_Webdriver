package s2_HandlingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_SelectAllCheckboxes
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/bharati%20kadu/IdeaProjects/Selenium%20Webdriver/HtmlFile/MultipleCheckbox.html");

        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(WebElement singlecheckbox : allCheckboxes)
        {
           singlecheckbox.click();
           Thread.sleep(1000);
        }
    }
}
