package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowACtivities {
        public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Hope/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.navigate().to("https://rahulshettyacademi.com");
            
    }

}
