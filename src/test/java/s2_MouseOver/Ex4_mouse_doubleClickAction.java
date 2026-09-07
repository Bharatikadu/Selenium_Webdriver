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
        driver.get("https://demo.guru99.com/test/simple_context_menuhtml");
        Thread.sleep(2000);

        WebElement e = driver.findElement(By.xpath(""));
        Actions act = new Actions(driver);

        /*approach1
        act.moveToElement(e).perform();
        act.doubleClick().perform();

        //approach2
        act.moveToElement(e).doubleClick().perform();*/

        //approach2
        act.doubleClick(e).perform();


    }
}
