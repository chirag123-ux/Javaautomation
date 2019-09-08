import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRM {

    protected static WebDriver driver;

    public static void main(String [] args){

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

        driver = new ChromeDriver();

        //maximise the browser window screen
        driver.manage().window().fullscreen();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);

        //open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //enter username
        driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");

        //enter password
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        //click on login
        driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();

        //click on welcomeADMIN
        driver.findElement(By.id("welcome")).click();

        //select log out
        driver.findElement(By.linkText("Logout")).click();

        //close browser
         driver.close();











    }




}
