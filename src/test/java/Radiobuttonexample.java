import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Radiobuttonexample {

    WebDriver driver;

    @Test
    public void Radiobuttonexample() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        //System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));


     if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){

         Assert.assertTrue(true);
     }

    }
}