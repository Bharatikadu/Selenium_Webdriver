package s2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.TableHeaderUI;

public class Ex4_mouse_doubleClickAction
{
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);

        WebElement e = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act = new Actions(driver);

        /*approach1
        act.moveToElement(e).perform();
        act.doubleClick().perform();

        //approach2
        act.moveToElement(e).doubleClick().perform();*/

        //approach3
        act.doubleClick(e).perform();


    }
}
