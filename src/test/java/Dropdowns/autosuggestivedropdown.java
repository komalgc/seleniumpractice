package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class autosuggestivedropdown {

    WebDriver driver;

    @Test
    public void staticdropdown() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        driver.findElement(By.id("autosuggest")).sendKeys("Ind");

        Thread.sleep(2000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        // css selector child element is accessed by giving a space


        for(WebElement option : options){

            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }

        driver.quit();

    }
}
