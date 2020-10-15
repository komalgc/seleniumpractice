import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;

public class firefox {


    public static void main (String[] args){

        System.setProperty("webdriver.firefox.driver","C:\\tools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());









    }
}
