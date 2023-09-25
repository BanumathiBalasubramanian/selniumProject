package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //example 1:
        /*driver.get("https://demoqa.com/alerts");
        //driver.findElement(By.id("promtButton")).click();
        WebElement element = driver.findElement(By.id("promtButton"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        driver.executeScript("arguments[0].click();",element);
        org.openqa.selenium.Alert alert=driver.switchTo().alert();
        alert.sendKeys("banumathi");
        Thread.sleep(6000);
        alert.accept();
        System.out.println("completed!!!");
        */
        //--------------------------------------
        //example 2:
        driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");
        WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
        element.click();
        driver.switchTo().alert().sendKeys("Hi banu  ");
        driver.switchTo().alert().accept();
        System.out.println("success");
        //navigate to (back,forward,to url, refresh)
//        driver.navigate().back();
//        driver.close();
//        driver.quit();



    }

}
