import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class example {
    WebDriver driver;

@BeforeTest
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

    }
    @Test
    public void field(){
    driver.findElement(By.xpath("//label[contains(text(),'First Name')]")).clear();
   /* driver.findElement(By.xpath("//label[text()='Last Name']")).sendKeys("bisla");
    driver.findElement(By.xpath("//label[text()='Email']")).sendKeys("abc@gmail.com");
   driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("abc123");
    //driver.findElement(By.xpath("")).sendKeys(""); */
        driver.findElement(By.xpath("//a[text()='Sign in into account']")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.linkText("Clear")).click();
        driver.findElement(By.linkText("Reset")).click();
        driver.findElement(By.linkText("Refresh")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.linkText("Sign in into account ")).click();
        driver.findElement(By.linkText("Click")).click();

}
@AfterTest
    public void quit(){
        driver.close();
    }

}
