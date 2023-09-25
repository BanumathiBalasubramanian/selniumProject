package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class checkbox {
    public static void main(String[] args) {

        //Launch the browser
        EdgeDriver driver=new EdgeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        //passing the URL https://demoqa.com/checkbox
        driver.get("https://demoqa.com/checkbox");
        //expand Home
        driver.findElement(By.xpath("//button[@title='Toggle']")).click();
        //expand Document
        //search for visible element of that expand document arrow (//button[@title='Toggle'])[3]
        driver.findElement(By.xpath("(//button[@title='Toggle'])[3]")).click();
        // expand Workspace
        //search for visible element of that expand workspace arrow
        //  (//button[@title='Toggle'])[4]
        //   ((//span[@class='rct-text'])[5]/following::button[@title='Toggle'])[1]
        driver.findElement(By.xpath("(//button[@aria-label='Toggle'])[4]")).click();
        // check the React checkbox
        //  (((//button[@title='Toggle'])[3]/following::button)[1]/following::span)[7]
        WebElement element = driver.findElement(By.xpath("(((//button[@title='Toggle'])[3]/following::button)[1]/following::span)[7]"));
        element.click();

        //verify the React check box is clicked
        boolean selected = driver.findElement(By.xpath("(((//button[@title='Toggle'])[3]/following::button)[1]/following::span)[7]")).isSelected();
        System.out.println(selected);
    }
}
