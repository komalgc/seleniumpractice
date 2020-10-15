import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {


    public static void main (String[] args){

        List<String> lang = new ArrayList<>();
        lang.add("English");
        lang.add("");
        lang.add("Kannada");
        lang.add("Kashmiri");
        List<String> langawesome = Arrays.asList("English","French");
        Stream.of(lang);
        Long newlang = lang.stream()
                .filter(ab ->ab.startsWith("K"))
                .map(a ->a.replace("Kannada", "Marathi"))
                .sorted()
                .count();
        System.out.println(newlang);
                //.collect(Collectors.toList());

        //newlang.forEach(System.out::println);
 List<Product> prods = new ArrayList<>();
 prods.add(new Product("iphone", 20.00 ));
 prods.add(new Product("android", 10.00 ));
 prods.add(new Product("google", 50.00 ));

 Product prod2 = prods.stream().max(Comparator.comparing(Product::getPrice)).get();

        System.out.println(prod2.getName());



        /*System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());


        driver.get("https://yahoo.com");
        driver.navigate().back();
*/





    }
}
