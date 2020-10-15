import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Navigationclas {

    WebDriver driver;

    @BeforeMethod
    public  void beforemethod(){

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");

            driver = new ChromeDriver();




    }


    @Test
    public void navigatetoURL(){


        driver.get("http://demo-store.seleniumacademy.com/");
        Assert.assertEquals(driver.getTitle(), "Madison Island");
        WebElement searchbox = driver.findElement(By.name("q"));
        System.out.println("the font family of the search box is " + searchbox.getCssValue("font-family"));



    }

    //getlocation

    @Test
    public void getlocation(){
        driver.get("http://demo-store.seleniumacademy.com/");
        Assert.assertEquals(driver.getTitle(), "Madison Island");
        WebElement searchbox = driver.findElement(By.name("q"));
        System.out.println("get the location " + searchbox.getLocation());

    }



    @AfterMethod

    public void aftermethod(){


       driver.quit();

    }
}
