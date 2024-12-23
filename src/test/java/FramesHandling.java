import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesHandling {
    WebDriver driver;

    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(); //object creation for chromedriver
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();


        //find the xpath for frame 1

        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        //switch to frame1

        driver.switchTo().frame(frame1);

        //find the element for text field

        WebElement textfield1 = driver.findElement(By.xpath("//input[@type='text']"));

        textfield1.sendKeys("Himanshi");

        //come out of frame and be in the main page

        driver.switchTo().defaultContent();

        //find the xpath for frame2

        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

        //switch to frame2

        driver.switchTo().frame(frame2);

        //find the element for text field

        WebElement textfield2 = driver.findElement(By.xpath("//input[@type='text']"));
        textfield2.sendKeys("Hussain");

        driver.switchTo().defaultContent();

        //find the xpath for frame3

        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

        //switch to frame 3

        driver.switchTo().frame(frame3);

        //find the element for text field

        WebElement textfield3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
        textfield3.sendKeys("Pujan");

       driver.switchTo().frame(0);   //iframe

        WebElement check = driver.findElement(By.xpath( "//div[@class='AB7Lab Id5V1']"));
        check.click();

        driver.switchTo().defaultContent();

        //find the element for frame 4
        WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));

        //switch to frame 4
        driver.switchTo().frame(frame4);

        //find the element for text field in frame 4

        WebElement textfield4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
        textfield4.sendKeys("testing");

        driver.switchTo().defaultContent();

        //find the element got frame 5
        WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));

        //switch to frame 5
        driver.switchTo().frame(frame5);

        //find the element for text field in frame 5

        WebElement textfield5 = driver.findElement(By.xpath("//input[@name='mytext5']"));
        textfield5.sendKeys("automation");

    }
}
