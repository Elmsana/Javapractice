package SeleniumTestCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByLinkText {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        List<WebElement> listelement = driver.findElements(By.tagName("a"));
        System.out.println("Amaount ot links: " + listelement.size());

        WebElement link = driver.findElement(By.linkText("Autocomplete"));
        link.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement link2 = driver.findElement(By.partialLinkText("Drag"));
        Thread.sleep(3000);

        driver.close();

    }
}
