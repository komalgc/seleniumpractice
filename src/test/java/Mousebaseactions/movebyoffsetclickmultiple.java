package Mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class movebyoffsetclickmultiple {

    WebDriver driver;

    @Test

    public void movebyoffsetclickmultiple() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/Selectable.html");

        WebElement one = driver.findElement(By.name("one"));

        WebElement eleven = driver.findElement(By.name("eleven"));

        WebElement seven = driver.findElement(By.name("seven"));

        int border = 1;
        int tilewidth = 100;
        int tileheight = 80;

        Actions act = new Actions(driver);

        act.moveByOffset(one.getLocation().getX() + 1, one.getLocation().getY() + 1).click().perform();

        act.moveByOffset(2 * tilewidth + 4 * border, 2 * tileheight + 4 * border).click().perform();

        act.moveByOffset(-2 * tilewidth - 4 * border, -2 * tileheight - 4 * border).click().perform();


        driver.quit();


    }
}