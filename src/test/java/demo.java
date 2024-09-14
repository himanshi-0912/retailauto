import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {

    @BeforeTest
    public void test0(){
        System.out.println("Execute me before the test method");
    }

   @Test
    public static void test() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //browser launch
        driver.manage().window().maximize(); //maximize the window
        Thread.sleep(2000); //wait
        driver.get("https://github.com/hussain-si"); //navigate to the url
      //  Thread.sleep(2000);
        driver.navigate().back(); //backward
       // Thread.sleep(5000);
        driver.navigate().forward(); //forward
       // Thread.sleep(5000);

        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());
        driver.close();
       /* WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();*/
    }
    @AfterTest
    public void test1(){
        System.out.println("Execute me after the test method");
    }
}
