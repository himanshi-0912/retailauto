import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertexample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

    }
}
