
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class Register {

        protected static WebDriver driver;

        public static void main(String[]args){

            System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

            driver = new ChromeDriver();

            //maximise the browser window screen
            driver.manage().window().fullscreen();

            //set implicity wait for driver object
            driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);

            //open the website
            driver.get("https://demo.nopcommerce.com/");

            //click on register button
            driver.findElement(By.xpath("//a[@class='ico-register']")).click();

            // enter first name
            driver.findElement(By.id("FirstName")).sendKeys("Pujan");

            //enter last name
            driver.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys("Acharya");

            //Enter Email
            driver.findElement(By.id("Email")).sendKeys("acharyachiragben@gmail.com");

            //enter password
            driver.findElement(By.id("Password")).sendKeys("mnop456");

            //enter confirm password
            driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("mnop456");

            //click on register
            driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
            //close the browser
            driver.quit();


        }
    }












































