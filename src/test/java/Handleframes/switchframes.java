package Handleframes;

import org.apache.tools.ant.taskdefs.optional.ejb.WebsphereDeploymentTool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class switchframes {


    WebDriver driver;

    @Test

    public void sitchwindows () {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://guidebook.seleniumacademy.com/Frames.html");

        //firstframe

        driver.switchTo().frame(0);

        WebElement firstfield = driver.findElement(By.name("1"));

        firstfield.sendKeys("this is the firts field");

        driver.switchTo().defaultContent();

        //secondframe

        driver.switchTo().frame(1);

        WebElement secondfield = driver.findElement(By.name("2"));

        secondfield.sendKeys("this is the second field");

        driver.quit();

    }
    }
