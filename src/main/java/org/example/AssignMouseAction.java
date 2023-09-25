package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignMouseAction {
    public static void main(String[] args) throws InterruptedException {
        //1)Launch the URL https://www.esteelauder.in/
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.esteelauder.in/");
        Thread.sleep(6000);
        //2)Mouse hover on MAKEUP Menu
        WebElement makeUp = driver.findElement(By.xpath("//a[text()='Makeup']"));


        //3)Click on 'Foundation' link under Face Section
        //4)Now get the page title and verify string 'foundation' is available
        //5)Also verify the URL is having the string 'foundation'
    }
}
