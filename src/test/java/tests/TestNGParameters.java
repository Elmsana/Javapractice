package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
    @Test
    @Parameters({"email", "fullName"})
    public void LocatorsPracticecss(@Optional String eamil, @Optional String fullName) throws InterruptedException {
        {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://practice.cybertekschool.com/sign_up");

            driver.findElement(By.name("full_name")).sendKeys("full_name");
            Thread.sleep(20);
            driver.findElement(By.name("email")).sendKeys("email");

            Thread.sleep(20);
            driver.quit();
        }
    }
}