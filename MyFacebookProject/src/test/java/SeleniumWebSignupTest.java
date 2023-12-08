import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumWebSignupTest {
    //open the Chrome browser
    //import the selenium driver
    private WebDriver driver = new ChromeDriver();

    @Test
    public void start() throws InterruptedException {
        //locate where the webdriver is
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver_win32/chromedriver.exe");
        //Input your selenium demo page URL (https://selenium-blog.herokuapp.com/)
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(10000);
        //maximise browser
        driver.manage().window().maximize();
        //click on Sign up button
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        //input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("Adebola11");
        //Input your email in email field
        driver.findElement(By.id("user_email")).sendKeys("ajoke.oritu@yahoo.com");
        //input your password
        driver.findElement(By.id("user_password")).sendKeys("Adebola101");
        //click on  sign up button
        driver.findElement(By.id("submit")).click();
        //wait for success message
        Thread.sleep(10000);
        //click on the first item on the list
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]")).click();
        //click on the python thingy
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]")).click();
        //click on log out
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();

    }

@AfterTest
public void closeBrowser(){
            //quit browser
            driver.quit();
        }

    }

