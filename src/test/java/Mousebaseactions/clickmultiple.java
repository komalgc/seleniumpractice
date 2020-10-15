package Mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class clickmultiple {


    WebDriver driver;

    @Test

    public void clickmultiple() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/Selectable.html");


        WebElement one = driver.findElement(By.name("one"));

        WebElement Eleven = driver.findElement(By.name("eleven"));

        WebElement seven = driver.findElement(By.name("seven"));


        Actions act = new Actions(driver);

       act.click(one)
           .click(Eleven)
           .click(seven)
           .build()
           .perform();

       driver.quit();


    }
}

