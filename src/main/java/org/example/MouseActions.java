package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://olamnuts.com/");
        Thread.sleep(6000);
        WebElement shopAll = driver.findElement(By.xpath("//span[text()='Shop All Products']"));
        WebElement almonds = driver.findElement(By.xpath("//span[text()='Almonds']"));
        WebElement organicAlmonds = driver.findElement(By.xpath("//span[text()='Organic Almonds']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(shopAll).moveToElement(almonds).moveToElement(organicAlmonds).click().build().perform();
    }
}
