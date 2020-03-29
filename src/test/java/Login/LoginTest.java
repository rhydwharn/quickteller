package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;

    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebulksms.com/signup/");
        Thread.sleep(7000);
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.id("UserEmail")).sendKeys("ridwana@mailinator.com");
        driver.findElement(By.id("UserConfemail")).sendKeys("ridwana@mailinator.com");
        driver.findElement(By.id("UserUserpass")).sendKeys("Labibah2341241");
        driver.findElement(By.id("UserFirstname")).sendKeys("testinge");
        driver.findElement(By.id("UserLastname")).sendKeys("tester");
        driver.findElement(By.id("UserMobilenumber")).sendKeys("08123456789");
        driver.findElement(By.id("UserAcceptterms")).click();
        driver.findElement(By.className("submit")).click();
    }

    public static void main(String args[]) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setUp();
    }

}
