package com.example.SeleniumLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsActivities {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //this waits until everything is loaded
        driver.get("https://www.google.com");

        //this doesnt
        driver.navigate().to("https://");

        driver.navigate().back();
        driver.navigate().forward();

    }
}
