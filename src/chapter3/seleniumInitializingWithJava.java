package chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
this is me just checking out how to initialize the web-driver for testing.
it was kind of fun and challenging. selenium with java has a wide community of user and enough
 resources to aid you in getting started.
 it worked perfectly
 */
public class seleniumInitializingWithJava {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BAB AL SAFA\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.quit();
    }
}
