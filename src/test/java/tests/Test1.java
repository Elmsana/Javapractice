package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[43]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div/input")).sendKeys("aman");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/input")).sendKeys("beaman@gmail.com");
        driver.findElement(By.name("wooden_spoon")).click();

    }
}