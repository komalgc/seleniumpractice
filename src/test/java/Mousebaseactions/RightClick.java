package Mousebaseactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class RightClick {

    WebDriver driver;

    @Test
    public void takescreenshot() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://demo-store.seleniumacademy.com/");

    }
}
