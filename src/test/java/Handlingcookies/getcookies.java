package Handlingcookies;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class getcookies {


    WebDriver driver;

    @Test


    public void getcookies() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo-store.seleniumacademy.com/customer/account/login/");


        WebElement one = driver.findElement(By.name("one"));
        WebElement three = driver.findElement(By.name("three"));
        WebElement  five = driver.findElement(By.name("five"));

         //Add all the actions in action builder

        Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL)
                .click(one)
                .click(three)
                .click(five)
                .keyUp((Keys.CONTROL));

        //composite action

        Action compositeaction = act.build();

        //perform the composite action

        compositeaction.perform();




    }
}

