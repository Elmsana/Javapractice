package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TestFrames {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/iframe");

        String userName = ("username");
        String password = ("password");
        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        driver.findElement(By.id("prependedInput2")).sendKeys(password + Keys.ENTER);
        // Driver.getDriver().findElement(By.id("_submit")).click();
        WebElement fleetModule = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/a/span"));
        // Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(fleetModule).perform();
        WebElement vehicleTab = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span"));
        actions.moveToElement(vehicleTab).click().perform();
        // Thread.sleep(2000);
        //Assert.assertTrue(Driver.getDriver().getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Car - Entities - System - Car - Entities - System");
    }

    }

