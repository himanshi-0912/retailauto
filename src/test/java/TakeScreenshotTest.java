import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

public class TakeScreenshotTest {

    @Test
    public void test() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://crio-qkart-frontend-qa.vercel.app/");
        driver.manage().window().maximize();

        /*
        * 1. Take screenshot ----> screenshot
        * 2. scr file ----> outtypr ---> file
        * 3. dest file ----> path
        * 4. src ---> dest
        * */

        TakesScreenshot scrshot = ((TakesScreenshot) driver);

        File src = scrshot.getScreenshotAs(OutputType.FILE);

        File dest = new File("C:\\Users\\himan\\IdeaProjects\\RetailAutomation\\target\\file.png");

        FileUtils.copyFile(src,dest);
    }
}
