package Mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class movebyoffsetandclick {

    WebDriver driver;

    @Test

    public void movebyoffsetandclick() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/Selectable.html");

        WebElement three = driver.findElement(By.name("three"));

        Actions act = new Actions(driver);

        act.moveByOffset(three.getLocation().getX() + 1, three.getLocation().getY() + 1).click();
        driver.quit();

    }

}
