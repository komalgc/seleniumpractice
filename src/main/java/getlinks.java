
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

 public class getlinks {

    public static void main (String[] args){



        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe" );

         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();

         driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

         driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

         List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("number of links on this page are " + links.size());

          //assertEquals(66, links.size());

          for(WebElement link : links)
          {
        System.out.println(link.getAttribute("href"));
             }


        driver.quit();



    }
}
