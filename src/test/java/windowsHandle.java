import org.openqa.selenium.WebDriver;

import java.util.HashSet;
import java.util.Set;

public class windowsHandle {

    public static void main(String[] args) {

        WebDriver driver = null;

        //array initialization
      Set<String> a = new HashSet<>();

      String parent =driver.getWindowHandle(); //main page address

        Set<String> child = driver.getWindowHandles();

        for(String window : child){
            System.out.println(window.toString());
        }

      a.add("himanshi");
      a.add("pujan");

        System.out.println(a);

        for(String b : a){
            if(b=="himanshi") {
                System.out.println(b);
            }
        }
    }
}
