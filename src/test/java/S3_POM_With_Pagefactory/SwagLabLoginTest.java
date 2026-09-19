package S3_POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SwagLabLoginTest
{
    public  static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");

        SwagLabLoginPage login = new SwagLabLoginPage(driver);
        login.enterUN("standard_user");
        Thread.sleep(2000);
        login.enterPSW("secret_sauce");
        Thread.sleep(2000);
        login.clickLoginButton();
        Thread.sleep(2000);

        SwagLabHomePage home = new SwagLabHomePage(driver);
        String actLogoText = home.getLogoText();
        String expLogoText = "Swag Labs";

        if(actLogoText.equals(expLogoText))
        {
            System.out.println("Tc Pass");
        }
        else
        {
            System.out.println("Tc Fail");
        }
    }
}
