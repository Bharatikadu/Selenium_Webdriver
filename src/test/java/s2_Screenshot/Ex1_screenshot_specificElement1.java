package s2_Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex1_screenshot_specificElement1
{
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        File s = driver.findElement(By.xpath("//label[text()='Email address or mobile number']")).getScreenshotAs(OutputType.FILE);
        System.out.println(s);

        File dest = new File("C:\\Users\\bharati kadu\\IdeaProjects\\Screenshot\\bk1.png");
        FileHandler.copy(s,dest);
    }
}
