package s2_HandlingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex6_SelectDeselectAllCheckboxesInReverseOrder
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/bharati%20kadu/IdeaProjects/Selenium%20Webdriver/HtmlFile/MultipleCheckbox.html");

        List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        //selecting checkbox
        for(WebElement singlecheckbox : allcheckboxes)
        {
            singlecheckbox.click();
            Thread.sleep(1000);
        }
        //deselecting
        for(int i=allcheckboxes.size()-1;i>=0;i--)
        {
            allcheckboxes.get(i).click();
            Thread.sleep(1000);
        }
    }
}
