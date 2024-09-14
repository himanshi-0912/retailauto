import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumPractice {

    WebDriver driver;
    @BeforeTest
    public void launch(){
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/himan/OneDrive/Desktop/seleniumPractice.html");
    }
    @Test
    public void test() throws InterruptedException {
        WebElement textfield1 =driver.findElement(By.xpath("//input[@id='textInput']"));
        textfield1.clear();
        textfield1.sendKeys("Test Engineer");
    WebElement textfield2 =driver.findElement(By.xpath("//input[@id='passwordInput']"));
      textfield2.clear();
      //textfield2.sendKeys("password123");
WebElement teable1 = driver.findElement((By.xpath("//tr/td/following-sibling::td/following-sibling::td[1]")));

       String r=teable1.getText();
        System.out.println(r);
        /*

    .clear();
        .sendKeys("Test Engineer");*/
        WebElement textfield3 = driver.findElement((By.xpath("//input[@id='emailInput']")) );
        textfield3.clear();
        textfield3.sendKeys("abc@gmail.com");

        driver.findElement(By.xpath("//button[@id='submitButton']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='cancelButton']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='exampleLink']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("////a[@id='anotherExampleLink']")).click();
        Thread.sleep(5000);

        WebElement textfield4 = driver.findElement(By.xpath("//textarea[@name='textarea']"));
        textfield4.clear();
        textfield4.sendKeys("hi i am himanshi bisla and i am learning automation testing");



    }
}
