package S2_HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Ex2_selectSpecificMobileFromAutosugetion
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
        List<WebElement> allOptions =  driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li[1]"));
        String expected = "redmi note 15";

        for(WebElement element: allOptions)
        {
            String actText =  element.getText();
            if(actText.equals(expected))
            {
                element.click();
                break;
            }
        }



    }
}
