package S2_ChromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex1_OpenBrowserInMaxState
{
        public  static void main(String[] args) throws InterruptedException {
            ChromeOptions opts = new ChromeOptions();
            opts.addArguments("start-maximized");

            ChromeDriver driver = new ChromeDriver(opts);
            driver.get("https://www.facebook.com/");

            Thread.sleep(2000);
        }
}
