package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestNavigation {
    public static void main(String[] args) {
        //ChromeMethod obj = new ChromeMethod();
        //obj.MyMethod();
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();

        // 1) Launch the URL https://mcstaging.olamspices.com/
        driver.get("https://mcstaging.olamspices.com/");

        // 2) Navigate back
        driver.navigate().back();

        // 3) Navigate forward
        driver.navigate().forward();

        // 4) Perform page refresh
        driver.navigate().refresh();

        // 5) Check whether FAQ option is displayed in the top header (right side)
        WebElement faqElement = driver.findElement(By.linkText("FAQ"));
        boolean isFAQDisplayed = faqElement.isDisplayed();
        System.out.println("FAQ Displayed: " + isFAQDisplayed);

        // 6) Perform vertical scroll and verify the same FAQ element is displayed or not.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        boolean isFAQDisplayedAfterScroll = faqElement.isDisplayed();
        System.out.println("FAQ Displayed after scroll: " + isFAQDisplayedAfterScroll);

        // 7) Click on Sign in link
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        // 8) In Customer login page, get URL, title of the page, and print it in the console
        String loginPageURL = driver.getCurrentUrl();
        String loginPageTitle = driver.getTitle();
        System.out.println("Login Page URL: " + loginPageURL);
        System.out.println("Login Page Title: " + loginPageTitle);

        // 9) Check show password checkbox is selected or not
        WebElement showPasswordCheckbox = driver.findElement(By.id("showPassword"));
        boolean isShowPasswordSelected = showPasswordCheckbox.isSelected();
        System.out.println("Show Password Selected: " + isShowPasswordSelected);

        // 10) Check Sign In button is enabled or not
        WebElement signInButton = driver.findElement(By.id("signInButton"));
        boolean isSignInButtonEnabled = signInButton.isEnabled();
        System.out.println("Sign In Button Enabled: " + isSignInButtonEnabled);

        // 11) Open a new tab using JavaScript executor and switch to that and launch URL: https://www.google.com/
        js.executeScript("window.open()");
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                driver.get("https://www.google.com/");
                break;
            }
        }

        // 12) Print the title of the new tab
        String newTabTitle = driver.getTitle();
        System.out.println("New Tab Title: " + newTabTitle);

        // 13) Close the newly opened tab
        driver.close();

        // 14) Switch back to the parent window and quit
        driver.switchTo().window(currentWindowHandle);
        driver.quit();
    }
}
