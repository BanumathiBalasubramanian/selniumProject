package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NavigateExercise {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();

//        1)Launch the URL https://mcstaging.olamspices.com/
        driver.get("https://mcstaging.olamspices.com/");
        System.out.println(driver.getTitle());
//        2)Navigate back
        driver.navigate().back();
//        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
//        driver.navigate().back();
//        3)Navigate forward
        driver.navigate().forward();
//        4)Perform page refresh
        driver.navigate().refresh();
//        5)check whether FAQ option is displayed in the top header (right side)
        driver.findElement(By.xpath("//a[contains(text(),'FAQ')]")).click();
        System.out.println(driver.getTitle());
//        6)Perform vertical scroll now verify the same FAQ element is displayed or not.
//        7)Click on Sign in link
//        8)In Customer login page, get url, title of the page and print it in console
//        9)Check show password check box is selected or not
//        10)Check Sign In buttons is enabled or not
//        11)open a new tab using javascript executor and switch to that and launch URL : https://www.google.com/
//        12)print the tile of the new tab.
//        13)close the newly opened tab
//        14)switch back to parent window and quit.

    }
}
