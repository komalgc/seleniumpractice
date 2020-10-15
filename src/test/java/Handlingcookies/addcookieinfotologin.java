package Handlingcookies;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class addcookieinfotologin {

    WebDriver driver;


    @Test
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo-store.seleniumacademy.com");
    }

    public void loadCookies() {
        try {
            File dataFile = new File("./target/browser.data");
            FileReader fr = new FileReader(dataFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer str = new StringTokenizer(line, ";");
                while (str.hasMoreTokens()) {
                    String name = str.nextToken();
                    String value = str.nextToken();
                    String domain = str.nextToken();
                    String path = str.nextToken();
                    Date expiry = null;
                    String dt;
                    if (!(dt = str.nextToken()).equals("null")) {
                        SimpleDateFormat formatter =
                                new SimpleDateFormat("E MMM d HH:mm:ss z yyyy");
                        expiry = formatter.parse(dt);
                    }

                    boolean isSecure = new Boolean(str.nextToken()).
                            booleanValue();
                    Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
                    driver.manage().addCookie(ck);
                }
            }

            driver.get("http://demo-store.seleniumacademy.com/customer/account/index/");

            Assert.assertEquals("driver.findElement(By.cssSelector(\"div.page-title\")).getText()", "MY DASHBOARD");





        } catch (Exception ex) {
            ex.printStackTrace();
        }

        driver.quit();
    }
}


