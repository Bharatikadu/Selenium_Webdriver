package S3_POM_With_Pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabLoginPage
{
       // 1. Data member/Variable should be declared globally with access level private using @findBy Annotation
       @FindBy(xpath = "//input[@id='user-name']")private  WebElement un;
       @FindBy(xpath = "//input[@id='password']")private  WebElement psw;
       @FindBy(xpath = "//input[@id='login-button']")private WebElement loginBtn;

}
