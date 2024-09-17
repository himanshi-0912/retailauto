import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandling {
    @Test
    public void test() throws InterruptedException {
        /*
        * 1. Setup browser and launch the browser
        * 2. Navigate to URL
        * 3. click on the button
        * 4. String mainWIndow = driver.getWindowHandle()
        * 5. Set<String> allWindows = driver.getWindowhandles()
        * 6. for each window
        * 7. driver.switchTo.window(child)
        * 8. print title
        * */

        //1. Setup browser and launch the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Navigate to URL
        driver.get("https://demoqa.com/browser-windows");

        // 3. click on the button
        driver.findElement(By.xpath("//button[@id='windowButton']")).click();

        //4. String mainWIndow = driver.getWindowHandle()
        String parent  = driver.getWindowHandle();
        System.out.println(parent);

        //5. Set<String> allWindows = driver.getWindowhandles()
        Set<String> child = driver.getWindowHandles();
        System.out.println(child);

        //6. for each window
        for(String childWindow:child){

            Thread.sleep(2000);
            //if(parent should not equal to child)
            if(!parent.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
              WebElement Text= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                System.out.println(Text.getText());
            }

        }



    }
    @Test
    public void test2(){
        //1. Setup browser and launch the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Navigate to URL
        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        String parent = driver.getWindowHandle();
        Set<String> child= driver.getWindowHandles();

        for(String mywindow:child){
            if (!parent.equalsIgnoreCase(mywindow)){
                driver.switchTo().window(mywindow);
                WebElement ref = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                System.out.println(ref.getText());

            }

        }
        driver.quit();

    }
    @Test
    public void test3(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
        String parent = driver.getWindowHandle();
        Set<String> child=driver.getWindowHandles();

        for(String mywindow:child){
            if (!parent.equalsIgnoreCase(mywindow)){
                driver.switchTo().window(mywindow);
               // driver.manage().window().maximize();
                WebElement obj = driver.findElement(By.xpath("//body[contains(text(), 'Knowledge')]"));
                System.out.println(obj.getText());
            }
        }
    }
}
