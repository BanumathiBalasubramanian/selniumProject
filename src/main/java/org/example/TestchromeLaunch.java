package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
public class TestchromeLaunch {
    public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver(); //open the webdriver
        driver.manage().window().maximize(); //maximize the screen
        driver.get("https://olamgroup.workplace.com/"); //passing URL to open in chrome browser
        String title = driver.getTitle();
        System.out.println("URL: " +title);
    }
}
