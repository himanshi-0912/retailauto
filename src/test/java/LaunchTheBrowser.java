import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchTheBrowser {

    WebDriver driver;

    @BeforeTest
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void locator() {

        //driver.findElement(By.id("APjFqb")).sendKeys("Himanshi");

       // driver.findElement(By.name("q")).sendKeys("Himanshi");

        //driver.findElement(By.tagName("textarea")).sendKeys("test engineer");

       // driver.findElement(By.className("gLFyf")).sendKeys("bisla");

      //  driver.findElement(By.linkText("Gmail")).click();

       // driver.findElement(By.partialLinkText("Gma")).click();

      //  driver.findElement(By.cssSelector("//textarea[id='APjFqb']")).sendKeys("HImanshi");

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("This is the last locaotr");


    }


    public void quit(){
        driver.close();
    }
}
