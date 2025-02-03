package com.example.SeleniumLearnings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntroduction {
    public static void main(String[] args) {
        //this is for chrome v 132
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Hope\\Documents\\Reps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.br");
        System.out.println(driver.getTitle());


        System.out.println(driver.getCurrentUrl());


        System.out.println(driver.getTitle());

        driver.close();
        driver.quit();
    }
}

