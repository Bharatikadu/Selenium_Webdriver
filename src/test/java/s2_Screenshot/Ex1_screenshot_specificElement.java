package s2_Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class Ex1_screenshot_specificElement
{
    public  static void main(String[]args) throws IOException
    {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        File src = driver.findElement(By.xpath("//button[@name='start']")).getScreenshotAs(OutputType.FILE);
        System.out.println(src);

        File dest = new File("C:\\Users\\bharati kadu\\IdeaProjects\\Screenshot\\bk.png");
        FileHandler.copy(src,dest);


    }
}
