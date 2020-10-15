package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dynamicdropdown {

    WebDriver driver;

    @Test
    public void staticdropdown() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();


        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();

        Thread.sleep(2000);


        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();

        driver.quit();
    }
}
