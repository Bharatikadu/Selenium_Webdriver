package s2_HandlingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex4_getSizeOfAllCheckboxes
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/bharati%20kadu/IdeaProjects/Selenium%20Webdriver/HtmlFile/MultipleCheckbox.html");

        List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int boxsize = allcheckboxes.size();
        System.out.println("Size of all checkboxes is "+boxsize);




    }
}
