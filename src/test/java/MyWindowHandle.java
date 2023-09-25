import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class MyWindowHandle {

    //public static void main(String[] args) {
    @Test
public void switchWindow(){

        //launch the browser
        ChromeDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //launch url
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

        //creating window handles for parent window
        String parentWindow = driver.getWindowHandle();


        //pre-condition to identify the iframe -------------
        driver.switchTo().frame("iframeResult");
        //click on the link in the page
        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']")).click();
        //switch to newly opened window
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> str1 = new ArrayList<String>(windowHandles);
        for (String s1 : str1) {
            System.out.println(s1);
        }
        driver.switchTo().window(str1.get(1));
        System.out.println(driver.getTitle());

        //coming back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
    }
}
