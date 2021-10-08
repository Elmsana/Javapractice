package SeleniumTestCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class WindowHandlePractice {

    @Test
    public void HoverOver () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //driver.manage().window().maximize();
       //1 driver.get("https://qa2.vytrack.com/");
        driver.get("https://login2.nextbasecrm.com");
        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing6@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser",Keys.ENTER);
       //2 driver.findElement(By.id("prependedInput")).sendKeys("user7");
       //3 driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
     driver.findElement(By.xpath("//*[@id=\"blog-post-addc-add-556\"]")).click();


     WebElement swiiframe= driver.findElement(By.xpath("//iframe[@class=\"bx-editor-iframe\"]"));
     driver.switchTo().frame(swiiframe);
     driver.findElement(By.xpath("/html/body")).sendKeys("we Got it");


     driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id=\"blog-post-addc-add-556\"]")).click();
        driver.findElement(By.xpath("//button[@class='ui-btn ui-btn-sm ui-btn-primary']")).click();

     // driver.findElement(By.xpath("//*[@id=\"lhe_button_submit_blogCommentFormx7zZ\"]")).click();



        //driver.findElement(By.id("//*[@id=\"bxed_idLHE_blogCommentFormacqp\"]")).sendKeys("UserUser123", Keys.ENTER);
      ///driver.findElements(By.id("//*[@id=\"bxed_idLHE_blogCommentFormacqp\"]"))

              //  driver.findElement(By.xpath("//*[@id=\"lhe_button_submit_blogCommentFormm88X\"]")).click();




        //driver.findElement(By.xpath("/html/body")).sendKeys();

       /* driver.findElement(By.id(""));
        WebDriverWait wait = new WebDriverWait(driver,20);

        WebElement comment = driver.findElement(By.xpath("/html/body"));
        Actions actions = new Actions(driver);
        actions.moveToElement(comment).perform();
        WebElement vehicleTab = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span"));
        actions.moveToElement(vehicleTab).click().perform();

      //4  WebElement fleetModule = driver.findElement(By.xpath("//span[@class=\"title title-level-1\"]"));
       /* Actions actions = new Actions(driver);
        actions.moveToElement(fleetModule).perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span"))));

        actions.moveToElement(fleetModule).perform();
        WebElement vehicleTab =  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]"))));
        actions.moveToElement(vehicleTab).click().perform();

*/
    }
    }

