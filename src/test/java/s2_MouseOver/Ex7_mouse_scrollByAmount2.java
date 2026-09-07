package s2_MouseOver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7_mouse_scrollByAmount2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        Actions act = new Actions(driver);

        //scroll right 1st parameter=+ve , 2nd para=0 pixel value
        act.scrollByAmount(100, 0).perform();
        Thread.sleep(3000);

    }
}
