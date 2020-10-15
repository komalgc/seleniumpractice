import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alertexample {

    WebDriver driver;

    @Test

    public void sitchwindows () {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.cssSelector("input#name")).sendKeys("Komal");
        driver.switchTo().alert().accept();
        //to accept the alert
        driver.switchTo().alert().dismiss();
        //to cancel the alert
        driver.switchTo().alert().getText();
        //to get the text of the alert


    }

}




