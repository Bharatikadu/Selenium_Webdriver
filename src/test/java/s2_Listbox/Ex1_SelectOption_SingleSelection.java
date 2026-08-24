package s2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SelectOption_SingleSelection
{   public static void main(String[] args) {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testautomationpractice.blogspot.com/");

    WebElement Country = driver.findElement(By.xpath("//select[@id='country']"));
    Select s = new Select(Country);
    s.selectByVisibleText("United States");
    s.selectByValue("india");
    s.selectByIndex(7);
}
}
