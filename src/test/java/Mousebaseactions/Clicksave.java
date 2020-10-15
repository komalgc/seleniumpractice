package Mousebaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Clicksave {


    WebDriver driver;


    @Test

    public void clicksave (){

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/Window.html");

        WebElement save = driver.findElement(By.id("save"));

        Actions act = new Actions(driver);

       act.sendKeys(Keys.chord(Keys.CONTROL, "s"))
               .perform();








    }


}
