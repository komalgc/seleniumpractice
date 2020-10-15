import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tableexample {

    WebDriver driver;

    @Test
    public void tablexample1() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");

        driver = new ChromeDriver();
        int sum = 0;

        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30439/rcb-vs-kkr-28th-match-indian-premier-league-2020");

        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

        for (int i = 0; i < count - 2; i++) {

          String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int valueInteger = Integer.parseInt(value) ;
            sum = sum+valueInteger;

        }
        System.out.println(sum);
           // get the second element from the column using first element in the coloum using following-sibling concept


       String extra= table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
       int extravalue = Integer.parseInt(extra);
       int Totalsum = sum+extravalue;



        String Actualtotal = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int actualTotalValue = Integer.parseInt(Actualtotal);

        Assert.assertEquals(Totalsum,actualTotalValue);


    }


}

