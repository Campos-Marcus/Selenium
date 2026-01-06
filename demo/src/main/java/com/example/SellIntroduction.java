package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntroduction {
    public static void main(String[] args) {
        //if nothing is set, selenium manager will do it for me
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Hope/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    
        //SeleniumManager - becomes optional
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Hope/Downloads/geckodriver-v0.36.0-win-aarch64/geckodriver.exe");

        //^^seems to no longer being required
        //WebDriver driver = new ChromeDriver(); 

        WebDriver driver = new ChromeDriver(); 

        driver.get("https://rahulshettyacademy.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        driver.close();
        driver.quit();
    }
}
