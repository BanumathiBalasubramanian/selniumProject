package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
//single select option
public class SelectTab {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        //find the old selectmenu tab and store it in webelement
        /*WebElement element = driver.findElement(By.id("oldSelectMenu"));
        //calling selenium class "select"
        Select sel = new Select(element);
        //get all the option in that select tab and store those in list web element
        List<WebElement> options = sel.getOptions();
        //get the total option size of the select tab
        int optionSize= options.size();
        System.out.println(optionSize);
        //printing all the option
        for (WebElement ele:options) {
            System.out.println(ele.getText());
        }
        //type 1 printing particular option using "select by value"
        sel.selectByValue("1");
        //type 2 printing particular option using "array index"
        sel.selectByIndex(6);
        //type 3 printing particular option using "visible text"
        sel.selectByVisibleText("Yellow"); //the value inside is case sensitive
        //type 4
        WebElement firstSelectedOption = sel.getFirstSelectedOption();
        System.out.println("selected option: "+firstSelectedOption.getText());
*/
//multi select option:--------------------------------------------------------
        System.out.println("multi select option======");

        WebElement cars = driver.findElement(By.id("cars"));
        Select sel1= new Select(cars);
        //type 1
        /*List<WebElement> options = sel1.getOptions();
        //selected all the options
        for (WebElement ele1:options) {
            ele1.click();
        }
        //printing all the option
        for (WebElement ele2:options) {
            System.out.println(ele2.getText());
        }*/
        //type 2
        //select a single option in the multi select option
        List<WebElement> options = sel1.getOptions();
        for (WebElement ele1:options) {
            if (ele1.getText().equals("Opel"))
            {
                ele1.click();
                break;
            }
        }
        List<WebElement> allSelectedOptions = sel1.getAllSelectedOptions();
        for (WebElement ele2:allSelectedOptions) {
            System.out.println(ele2.getText());
        }
    }
}
