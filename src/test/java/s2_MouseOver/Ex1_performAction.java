package s2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ex1_performAction
{
    public  static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");


        //click on close menu
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);

        //step 1. identify mouse over element
        WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));

        //step2. create an object of action class with webdriver as a input
        Actions act = new Actions(driver);

        //step3. call action method from moveToElement
        act.moveToElement(login).perform();
        Thread.sleep(2000);

        //click on order link from mouse hover element
        driver.findElement(By.xpath("//div[text()='Orders']")).click();

    }
}
