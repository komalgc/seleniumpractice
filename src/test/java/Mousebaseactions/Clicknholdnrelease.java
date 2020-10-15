package Mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Clicknholdnrelease {


    WebDriver driver;

    @Test

    public void clicknholdnrelease() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/Sortable.html");


        WebElement three = driver.findElement(By.name("three"));

        WebElement two = driver.findElement(By.name("two"));


        Actions act = new Actions(driver);

        act.clickAndHold(three)
                .release(two)
                .perform();


    }
}
