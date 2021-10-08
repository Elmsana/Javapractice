package SeleniumTestCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url1 = "https://www.google.com/";
        String url2 = "https://www.amazon.com/";
        //maximize the page
        driver.manage().window().maximize();

        driver.get(url1);
        Thread.sleep(3000);
// Load a new web page in the current browser window
        driver.navigate().to(url2);

        Thread.sleep(3000);
//Move in the broweser history to the previous URL
        driver.navigate().back();
        Thread.sleep(3000);

        //move forward in  the browser history, Does mothing if we are on the latest page viewed.
        driver.navigate().forward();
        //Load a new web page in the current browser window
        driver.navigate().refresh();
        //close the current page
        driver.close();
        //close all the opened page
        driver.quit();
    }
}
