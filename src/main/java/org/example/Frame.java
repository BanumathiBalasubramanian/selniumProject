package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        driver.switchTo().defaultContent();
        //we can use default content or parent frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame2");
        System.out.println("completed!!");
    }
}
