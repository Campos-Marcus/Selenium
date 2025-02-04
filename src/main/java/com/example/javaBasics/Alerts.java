package com.example.javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

    public static void main(String[] args) {

                // Set the correct extension path
        String extensionPath = "C:\\Users\\Hope\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ljngjbnaijcbncmcnjfhigebomdlkcjo\\6.1.12_0";

        // Create ChromeOptions to load the extension
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions-except=" + extensionPath);
        options.addArguments("--load-extension=" + extensionPath);

        // Launch Chrome with the extension
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String text="tessst";

        driver.findElement(By.id("name")).sendKeys(text);

        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();

        System.out.println(driver.switchTo().alert().getText());



        driver.switchTo().alert().dismiss();


        
    }

}
