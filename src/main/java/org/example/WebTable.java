package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import static java.lang.Thread.sleep;
public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        //launch the edge browser
        EdgeDriver driver = new EdgeDriver();
        //maximize the screen in browser
        driver.manage().window().maximize();
        //passing the URL in the browser
        driver.get("https://demoqa.com/webtables");
        Thread.sleep(2000);
        //click the ADD button
        driver.findElement(By.id("addNewRecordButton")).click();
        Thread.sleep(2000);
        //adding the new record to table
        driver.findElement(By.id("firstName")).sendKeys("Banu");
        driver.findElement(By.id("lastName")).sendKeys("mathi");
        driver.findElement(By.id("userEmail")).sendKeys("banu123@gmail.com");
        driver.findElement(By.id("age")).sendKeys("23");
        driver.findElement(By.id("salary")).sendKeys("5555555");
        driver.findElement(By.id("department")).sendKeys("CSE");
        Thread.sleep(2000);
        //click the submit button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        //find the search text box and passing values
        driver.findElement(By.id("searchBox")).sendKeys("Banu");
        //click the search icon button
        driver.findElement(By.id("basic-addon2")).click();
        Thread.sleep(2000);
        //printing the coumn name
        List<WebElement> elements1 = driver.findElements(By.xpath("//span[@title='Edit']"));
        int size = elements1.size();
        System.out.println(size);
//printing the column names
        List<WebElement> elements = driver.findElements(By.xpath("//div[@role='columnheader']"));

        for (WebElement element:elements){
            System.out.print(element.getText());
            System.out.print(" ");
        }

        System.out.println();

        List<WebElement> cellData = driver.findElements(By.xpath("//div[@role='gridcell']"));

        int num = 0;
        for (WebElement cell:cellData){

            if (cell.getText().equalsIgnoreCase("Banu")){
                num = num+1;
            }
            if(num!=0){
                System.out.print(cell.getText());
                System.out.print(" ");
            }else {
                break;
            }
        }
    }
}
