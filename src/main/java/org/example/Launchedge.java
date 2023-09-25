package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
//first assignment-entering text field value
public class Launchedge {
    public static void main(String[] args) {
        //launch the edge browser
        EdgeDriver driver = new EdgeDriver();
        //maximize the screen in browser
        driver.manage().window().maximize();
        //passing the URL in the browser
        driver.get("https://demoqa.com/text-box");
        //find the userName text field by using id and passing username
        driver.findElement(By.id("userName")).sendKeys("Banumathi");
        //find the userEmail text field by using id and passing user emailid
        driver.findElement(By.id("userEmail")).sendKeys("banu123@gmail.com");
        //find the currentAddress text field by using id and passing current address
        driver.findElement(By.id("currentAddress")).sendKeys("door no.123, ABC street");
        //find the permanentAddress text field by using id and passing permanent address
        driver.findElement(By.id("permanentAddress")).sendKeys("door no.456, new ABC street");
        //find the Submit button field by using id and clicking that button
        driver.findElement(By.id("submit")).click();

    }
}
