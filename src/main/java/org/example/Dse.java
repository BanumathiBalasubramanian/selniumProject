package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Dse {
    public static void main(String[] args) {
        //ChromeDriver driver = new ChromeDriver();
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new EdgeDriver(options);

        WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://digitalauthdev.olamnet.com/auth/realms/ofis-dse-manna-sit/protocol/openid-connect/auth?client_id=ofi-dse-portal-sit&redirect_uri=https%3A%2F%2Fdse-sit.ofi.com%2F%23%2Fdashboard&state=a6967637-7e0f-40b6-835c-d8fb0f7bc9ce&response_mode=fragment&response_type=code&scope=openid&nonce=c1b81308-6ac7-4742-a64e-592570aab03c");
        driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("custom@ofisupport.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Olam@123");
        WebElement element = driver.findElement(By.xpath("//span[@class='checkmark']"));
        element.click();
        driver.findElement(By.id("submit_button")).click();
        wait1.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler"))).click();
        //driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        ////span[text()='Transactions']
       WebElement element1 = driver.findElement(By.xpath("//a[@href='#/transactions']"));
       element1.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#/transactions']"))).click();

        //driver.findElement(By.partialLinkText("Transactions")).click();
//        Actions actions1=new Actions(driver);
//        actions1.moveToElement(element1).click().build().perform();
        System.out.println("Transaction clicked");


    }
}
