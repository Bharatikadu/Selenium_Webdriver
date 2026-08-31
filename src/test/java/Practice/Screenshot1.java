package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class Screenshot1
{
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        File src = driver.findElement(By.xpath("(//div[@class='x3nfvp2 x1n2onr6 xh8yej3'])[2]")).getScreenshotAs(OutputType.FILE);
        System.out.println(src);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src2 = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(src2);

        File dest = new File("C:\\Users\\bharati kadu\\IdeaProjects\\Screenshot\\bb.png");
        FileHandler.copy(src,dest);

        File dest2 = new File("C:\\Users\\bharati kadu\\IdeaProjects\\Screenshot\\fs.png");
        FileHandler.copy(src2,dest2);

    }
}
