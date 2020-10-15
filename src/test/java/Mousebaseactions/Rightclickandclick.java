package Mousebaseactions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Rightclickandclick {
    WebDriver driver;

    @Test
    public void takescreenshot() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/ContextClick.html");

        WebElement rightck = driver.findElement(By.id("div-context"));

        Actions act = new Actions(driver);

        act.contextClick(rightck)
                .click(driver.findElement(By.name("Item 4")))
                .perform();


        driver.quit();


    }
}



