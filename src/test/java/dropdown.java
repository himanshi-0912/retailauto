import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdown {
    WebDriver driver;
    @BeforeTest
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu#google_vignette");
    }
    @Test
    public void testcase1() throws InterruptedException {

        Thread.sleep(5000);
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));

        /*
        *1 Select class
        * */

        Select select = new Select(dropdown);
        select.selectByVisibleText("Green");

    }
}
