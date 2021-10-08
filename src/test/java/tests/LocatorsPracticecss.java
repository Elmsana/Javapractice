package tests;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

public class LocatorsPracticecss {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("b");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("haye");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("anhaye");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("emaikschool.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("ond234");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("777-777-7777");
        driver.findElement(By.cssSelector("input[value='female']")).click();
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("05/24/1991");
        Select select = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        select.selectByVisibleText("SDET");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(3000);
        driver.quit();



    }


}
