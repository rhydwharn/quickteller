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
        driver.get("https://quickteller.com/");
        Thread.sleep(7000);
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.className("btn__login")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ridwan.abdulazeez1@gmail.com");
        driver.findElement(By.xpath("//input[@id='accountLoginFormPassword']")).sendKeys("Labibah1.");
        driver.findElement(By.xpath("//button[@id='accountLoginFormButton']")).click();
    }

    public static void main(String args[]) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setUp();
    }

}
