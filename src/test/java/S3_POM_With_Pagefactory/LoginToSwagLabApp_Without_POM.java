package S3_POM_With_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class LoginToSwagLabApp_Without_POM
{
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            //enter username
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
            Thread.sleep(2000);

            //enter pass
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
            Thread.sleep(2000);
            //click on login btn
            driver.findElement(By.xpath("//input[@id='login-button']")).click();
            Thread.sleep(2000);
            //verify logo text
            String LogoText = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
            String exptext = "Swag Labs";
            Thread.sleep(2000);

            if(LogoText.equals(exptext)){
                System.out.println("Swag Labs successfully logged in");
            }
            else{
                System.out.println("Swag Labs unsuccessfully logged in");
            }

        }
}
