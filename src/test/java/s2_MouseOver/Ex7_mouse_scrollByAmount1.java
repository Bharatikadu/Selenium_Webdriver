package s2_MouseOver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7_mouse_scrollByAmount1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        Actions act = new Actions(driver);

        //scroll up 1st parameter=0, 2nd para=-ve pixel value
        act.scrollByAmount(0,-500).perform();
        Thread.sleep(3000);


    }
}
