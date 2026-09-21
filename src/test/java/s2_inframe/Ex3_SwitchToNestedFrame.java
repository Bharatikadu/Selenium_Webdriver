package s2_inframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex3_SwitchToNestedFrame
{
        public  static void main(String[] args)
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://autotestsandbox.com/examples/nested-iframes");


            //switc tp outer frame
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer nested frame']")));

            //get text
            String text = driver.findElement(By.xpath("//p[text()='Outer iframe']")).getText();
            System.out.println(text);

            //switch to inner frame
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Inner']")));

            //get text
            String text1 = driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();
            System.out.println(text1);

        }
}
