package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckboxPractice {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.get("http://practice.cybertekschool.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("size is "+allLinks.size());
       WebElement link = driver.findElement(By.linkText("Autocomplete"));
        //List<WebElement> checkbox = driver.findElements(By.tagName("input"));
        // driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/input[1]")).click();
       //WebElement checkbox2 =  driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

link.click();
Thread.sleep(3000);
driver.close();
//butoon.click();

    //   checkbox2.click();

    }
}
