package Handlewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class switchtowindows {
    WebDriver driver;

    @Test

    public void sitchwindows (){

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/Window.html");

        String firstwindow = driver.getWindowHandle();

        System.out.println("The first window handle is " + firstwindow);

        WebElement clickongoogle = driver.findElement(By.tagName("a"));

        clickongoogle.click();

        String secondwindow = driver.getWindowHandle();

        System.out.println("The second window handle " + secondwindow);

        System.out.println("The no of window handles handled so far " + driver.getWindowHandles().size());

        driver.switchTo().window(firstwindow);

        driver.quit();



    }

}
