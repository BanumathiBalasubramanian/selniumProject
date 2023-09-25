package org.example;
//rough practice - zeus timesheet
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//own example practice
public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\banumathi.b\\chrome extension\\chrome-win64\\chrome.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.youtube.com/");
        //Thread.sleep(30,20);




//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("Selenium");
//
//        WebElement searchButton = driver.findElement(By.name("btnK"));
//        searchButton.click();


        //driver.quit();
    }
}
