package Mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draganddropby {


    WebDriver driver;

    @Test

    public void draganddropby() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/DragMe.html");

      //  WebElement draggble = driver.findElement(By.id("draggable"));
        WebElement dragMe = driver.findElement(By.id("draggable"));

        Actions act = new Actions(driver);

        act.dragAndDropBy(dragMe, 300 ,200).perform();
        driver.quit();





    }
}
