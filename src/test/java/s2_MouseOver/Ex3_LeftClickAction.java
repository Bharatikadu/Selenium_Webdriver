package s2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_LeftClickAction
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        //click on close icon
        driver.findElement(By.xpath("//span[@class='b3wTlE")).click();
        Thread.sleep(2000);

        WebElement cart = driver.findElement(By.xpath("//span[@class='b3wTlE']"));
        Actions act = new Actions(driver);

        /*approach 1
        act.moveToElement(cart).perform();
        act.click().perform();

        //approach2
        act.moveToElement(cart).click().perform();*/

        //approach3
        act.click(cart).perform();

    }

}

