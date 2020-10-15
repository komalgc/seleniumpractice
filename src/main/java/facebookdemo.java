import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookdemo {


    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
      driver.findElement(By.id("email")).sendKeys("This is my first code");
      driver.quit();





    }
}
