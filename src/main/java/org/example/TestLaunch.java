package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/// udemy course
public class TestLaunch {
    public static void main(String[] args) {


        //to invoke with the webdriver, we need to call the property file
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\banumathi.b\\.cache\\selenium\\chromedriver");
        WebDriver driver = new ChromeDriver();
        // 1. webdriver is a interface,which have all methods for diff browser (chrome,firefox,safari,edge)
        // access all methods of class driver for diff browser
        //or
        //2. ChromeDriver driver = new ChromeDriver();
        // it only able to access the chromedriver class method.


    }
}
