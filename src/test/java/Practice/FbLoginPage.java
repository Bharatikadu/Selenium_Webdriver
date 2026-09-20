package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage
{   //step 1. initialization
    @FindBy(xpath = "//input[@name='email']") private WebElement un;
    @FindBy(xpath = "//input[@name='pass']") private  WebElement pwd;
    @FindBy(xpath = "//span[text()='Log in']") private  WebElement login;


    //step2. Declaration
    public FbLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //step 3. utilization with methods
    public void enterUn(String unValue)
    {
        un.sendKeys(unValue);
    }
    public  void enterPWD(String  pwdValue)
    {
        pwd.sendKeys(pwdValue);
    }
    public void clickLoginButton()
    {
        login.click();
    }

}
