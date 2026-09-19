package S3_POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{   //1. Declaration
    @FindBy(xpath = "//div[text()='Swag Labs']") private WebElement logoText;

    //2.Initialization
    public  SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    //3. utilization
    public String  getLogoText()
    {
        String actLogoText = logoText.getText();
        return actLogoText;
    }


}
