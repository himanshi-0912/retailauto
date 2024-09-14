import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class html {
    WebDriver driver;

    @BeforeTest
    public void launch() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/himan/OneDrive/Desktop/html.html");

    }
    @Test
    public void field() throws InterruptedException {

        //driver.findElement(By.id("username")).sendKeys("Himanshi");
        //driver.findElement(By.name("abc")).sendKeys("bisla");
        //driver.findElement(By.linkText("Google")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.partialLinkText("Log")).click();
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("end");
        Thread.sleep(5000);
    }
@AfterTest
        public void quit(){
            driver.close();
        }

}
