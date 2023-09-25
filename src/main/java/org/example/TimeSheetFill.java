package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TimeSheetFill {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://clockit.myzeus.io/#/login");
        WebElement element = driver.findElement(By.xpath("//button[@type='button']"));
        element.click();
        driver.manage().window().maximize();


    }
}
