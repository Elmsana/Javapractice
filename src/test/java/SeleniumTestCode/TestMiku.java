package SeleniumTestCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TestMiku {
    /*
    TC #2: Selecting state from State dropdown and verifyingresult1.Open Chrome browser2.
    Go to http://practice.cybertekschool.com/dropdown3.Select Illinois4.Select Virginia5.
    Select California6.Verify final selected option is California.Use all Select options.
    (visible text, value, index)
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.findElement(By.id("state")).sendKeys("Illinois");


        driver.get("https://qa2.vytrack.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.id("prependedInput")).sendKeys("user7");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);

        WebElement fleetModule = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/a/span"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fleetModule).perform();
        WebElement vehicleTab = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span"));
        actions.moveToElement(vehicleTab).click().perform();

        //Assert.assertTrue(driver.getTitle();
        //System.out.println(driver.getTitle());
        // Assert.assertEquals(driver.getTitle(), "Car - Entities - System - Car - Entities - System");
    }

}
