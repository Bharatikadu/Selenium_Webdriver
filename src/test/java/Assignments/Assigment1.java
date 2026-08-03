package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment1
{
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String Title = driver.getTitle();
        System.out.println(Title);
        String expTitle = "OrangeHRM";
        System.out.println(expTitle);
        Thread.sleep(2000);

        driver.get("https://www.instagram.com/?hl=en");
        String Inst = driver.getTitle();
        System.out.println(Inst);
        String expInst = "Instagram";
        System.out.println(expInst);
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();

    }
}
