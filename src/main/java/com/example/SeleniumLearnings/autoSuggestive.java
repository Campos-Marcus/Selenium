package com.example.SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestive {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("br");

        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
        for(WebElement option : options){
            if(option.getText().equalsIgnoreCase("Brazil")){
                option.click();
                break;
            }
        }

/*         for(int i = 0; i< options.size(); i++){
            if(options.get(i).getText().equalsIgnoreCase("Brasil")){

            }
        } */
    }

}
