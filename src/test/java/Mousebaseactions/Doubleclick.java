package Mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

 public class Doubleclick {

    WebDriver driver;

    @Test

    public void doubleclick() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/DoubleClick.html");

        WebElement dblClick = driver.findElement(By.name("dblClick"));
        Actions actions = new Actions(driver);
        actions.doubleClick(dblClick).perform();

    }

}

