import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class addtocartexample {

    WebDriver driver;

    @Test

    public void addtocartexample() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemsNeeded = {"Brocolli", "Cucumber", "Carrot"};  //1. These are the items that needs to be added to cart

        int j = 0;

        List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));  // 2. Get the product list from the site

        for (int i = 0; i < products.size(); i++) {  // 3. for every product in the site

            String[] name = products.get(0).getText().split("-"); // 4.  split the product  name based on - , here u get return type  as string
            String formattedName = name[0].trim();   //5. for the first index which is the product name  format it to get actual vegetable name


            List itemsNeededList = Arrays.asList(itemsNeeded);    //6. convert array into array list for easy search

            // 7. check whether name you extracted is present in arrayList or not-

            if (itemsNeededList.contains(formattedName)) {

                j++;

                // 8. Click add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                // 9. Stop if all the items in the cart are added

                if (j == itemsNeeded.length) {

                    break;
                }
            }
        }
    }
}
