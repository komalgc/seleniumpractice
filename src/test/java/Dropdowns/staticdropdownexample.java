package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class staticdropdownexample {

    WebDriver driver;

    @Test
    public void staticdropdown() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //use only if u select tags for the dropdown

        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByValue("INR");
        s.selectByIndex(2);
        s.selectByVisibleText("USD");

        driver.quit();

    }
}
