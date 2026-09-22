package S3_POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
       // 1. Data member/Variable should be declared globally with access level private using @findBy Annotation
       @FindBy(xpath = "//input[@id='user-name']")private  WebElement un;
       @FindBy(xpath = "//input[@id='password']")private  WebElement psw;
       @FindBy(xpath = "//input[@id='login-button']")private WebElement loginBtn;
       @FindBy(xpath = "//h3[contains(text(),'Username and password')]") private  WebElement errorMsg;


       //2. initialize within a constructor with access level public using pagefactory class
        public  SwagLabLoginPage(WebDriver driver)
        {
            PageFactory.initElements(driver,this);   //classname.methodname(driver object)
        }

        //3. utilize within a method with public access level
        public void enterUN(String UNValue)
        {
            un.sendKeys(UNValue);
        }

        public void enterPSW(String PSWValue)
        {
            psw.sendKeys(PSWValue);
        }

        public void clickLoginButton()
        {
            loginBtn.click();
        }

        public String getErrorMsg()
        {
            String actErrorMsg = errorMsg.getText();
            return actErrorMsg;
        }



}

