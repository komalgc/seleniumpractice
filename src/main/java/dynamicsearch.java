
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dynamicsearch {

    public static void main(String[] args){


        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();  


        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        driver.get("https://www.hawksearch.com/?gclid=CjwKCAjwn9v7BRBqEiwAbq1Ey-kraEbOYS38Ky_6590vHVvioOyoNT0WGaw41lcVyvB1MlJgzLyYJBoC1rQQAvD_BwE");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        driver.findElement(By.xpath("//*[@id='downshift-1-input']")).sendKeys("tools");

        List<WebElement> list = driver.findElements(By.xpath("//*[@id='downshift-1-menu']//li/descendant::div[@class = 'hawk-sqItemName']"));
        System.out.println("tool sugeesstions are :::==>" + list);







}
}

