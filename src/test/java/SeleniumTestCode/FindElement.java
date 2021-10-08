package SeleniumTestCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElement {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.merriam-webster.com/");
        List<WebElement> listofLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("list" + listofLinks.size());
        int LinkwithText = 0;
        int LinkwithoutText = 0;

        for (WebElement bebhade : listofLinks) {
            System.out.println(bebhade.getText());

            String testAmxiee = bebhade.getText();
            if (testAmxiee.isEmpty()) {
                LinkwithText++;
            } else {
                System.out.println(testAmxiee);
                LinkwithoutText++;
            }
        }

        System.out.println(LinkwithText);
        System.out.println(LinkwithoutText);
        System.out.println(listofLinks.size());

    }
}
