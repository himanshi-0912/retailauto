import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/tool-tips");

        WebElement hover= driver.findElement(By.xpath("//button[@id='toolTipButton']"));
        /*
        1. action class ---> object
        2. perform the mouse hover action on the target element
        * */

        Actions action = new Actions(driver);

        action.moveToElement(hover).perform();
    }
}
