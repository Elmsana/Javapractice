package SeleniumTestCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Alert {
    /*
    TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cybertekschool.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfuly clicked an alert” text is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();//1
        // driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();//2
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();//3


//driver.switchTo().alert().accept();//1
//driver.switchTo().alert().dismiss();//2

        driver.switchTo().alert().sendKeys("cyberteck");//3
        Thread.sleep(3000);
        driver.switchTo().alert().accept();


        WebElement result = driver.findElement(By.id("result"));
        System.out.println("The result is = " + result.getText());
    }
}
