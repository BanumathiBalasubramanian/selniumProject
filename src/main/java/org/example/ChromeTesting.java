package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\banumathi.b\\chrome extension\\chrome-win64\\chrome.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
}
