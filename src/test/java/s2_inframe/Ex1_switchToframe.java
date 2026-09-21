package s2_inframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_switchToframe
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");


        //switch to frame
        //driver.switchTo().frame("");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

        driver.findElement(By.xpath("//button[contains(text(),' Date and Time.')]")).click();
    }
}
