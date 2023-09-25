package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Radiobutton {
    public static void main(String[] args) {
        //launch the browser
        EdgeDriver driver=new EdgeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        //passing the URL https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");

        //click the impressive radio button
        //  (//div//div[@class='custom-control custom-radio custom-control-inline'])[2]//input[@type='radio']

//        WebElement element = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//        element.click();
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        //verify the radio button is clicked
        boolean selected = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
        System.out.println(selected);


    }
}
