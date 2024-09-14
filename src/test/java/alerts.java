import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/himan/OneDrive/Desktop/alerts.html");

        //simple alert

      WebElement simple_alert =  driver.findElement(By.xpath("//div/button[contains(text(),'Show Alert')]"));
      simple_alert.click();
       Alert var = driver.switchTo().alert();
        System.out.println(var.getText());
       Thread.sleep(5000);
       var.accept();
        Thread.sleep(5000);

        //confirmation alert

        WebElement confirmation_alert =  driver.findElement(By.xpath("//div/button[contains(text(), 'Show Confirm')]"));
        confirmation_alert.click();
        Alert var1 = driver.switchTo().alert();
        System.out.println(var1.getText());
        Thread.sleep(5000);
        var1.dismiss();
        Thread.sleep(5000);

        //prompt alert

       /* WebElement prompt_alert =  driver.findElement(By.xpath("//div/button[contains(text(), 'Show Prompt')]"));
        prompt_alert.click();
        Alert var2 = driver.switchTo().alert();
        System.out.println(var2.getText());
        var2.sendKeys("himanshi");
        Thread.sleep(5000);
        var2.dismiss();
        Thread.sleep(5000);*/


        //chatGPT

        WebElement promptButton = driver.findElement(By.xpath("//button[text()='Show Prompt']"));
        promptButton.click();

        // Switch to the prompt alert
        Alert promptAlert = driver.switchTo().alert();

        Thread.sleep(5000);
        // Send text to the prompt
        promptAlert.sendKeys("Hello Selenium!");
        Thread.sleep(5000);
        // Accept the prompt
        promptAlert.accept();


    }
}
