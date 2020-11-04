package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        List<WebElement> elementLists = driver.findElements(By.tagName("a"));
        System.out.println("Amount of links: "+elementLists.size());

        WebElement link = driver.findElement(By.linkText("Autocomplete"));
        link.click();
        driver.findElement(By.id("myCountry")).sendKeys("Eritrea");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/input")).click();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Autocomplete of countries response :"+ result.getText());
        //System.out.println("size of all elements ="+ elementLists.size());
        // driver.close();

    }
}

