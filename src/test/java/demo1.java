import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class demo1 extends LaunchTheBrowser{

    @Test
    public void test1(){
        System.out.println("some one is going to execute before and after me");
    }
    @Test
    public void locator() {

        driver.findElement(By.id("APjFqb")).sendKeys("Himanshi");

    }
}
