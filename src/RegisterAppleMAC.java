import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterAppleMAC {

    protected static WebDriver driver;

    public static void main(String[]args) {

        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        driver = new ChromeDriver();

        //maximise the browser window screen
        driver.manage().window().fullscreen();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        // enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Pujan");

        //enter last name
        driver.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys("Acharya");

        //Enter Email
        driver.findElement(By.id("Email")).sendKeys("2acharyachiragben@gmail.com");

        //enter password
        driver.findElement(By.id("Password")).sendKeys("mnop456");

        //enter confirm password
        driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("mnop456");

        //click on register
        driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

        //click on nop commerce link
        driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).click();
        //click on apple macbook
        driver.findElement(By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']")).click();



        //click on email a friend
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        //enter friend email
        driver.findElement(By.id("FriendEmail")).sendKeys("poojan@yahoo.com");
        //enter my email
        //driver.findElement(By.name("YourEmailAddress")).sendKeys("acharyachiragben@gmail.com");
        //write massage
        driver.findElement(By.id("PersonalMessage")).sendKeys("Hi look this laptop");
        //click button
        driver.findElement(By.name("send-email")).click();

        //CLOSE the browser
        driver.quit();


    }
}




























