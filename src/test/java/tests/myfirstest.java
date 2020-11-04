package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myfirstest {
    public static void main(String[] args) throws Throwable{
        //System.setProperty("webdriver.chrome.driver","chromedriver");
       // WebDriver driver = new ChromeDriver();
       WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String URL = "https://www.google.com/";
        String URL2 ="https://www.amazon.com/";

        driver.get(URL);
        Thread.sleep(3000);

        driver.navigate().to(URL2);
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();

    }
}
