package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Hope/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //by id
        driver.findElement(By.id("inputUsername")).sendKeys("marcus");
        //by name
        driver.findElement(By.name("inputPassword")).sendKeys("hellowthere");
        //by classname
        driver.findElement(By.className("signInBtn")).click();
        //implicit wait 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //By css selector
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        //by link text
        driver.findElement(By.linkText("Forgot your password?")).click();

        //by xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        //custom css selector
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

        //element with index
        driver.findElement(By.xpath("//input[@type='text'] [2]")).clear();

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
        //same as previous but with index, just as example
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("agnes@test123.com");

        //child parent examples
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

        //
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        //parent child with css
       System.out.println( driver.findElement(By.cssSelector("form p")).getText());

        //parent-child customized - somehownotworking
       //driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();

       driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
       Thread.sleep(1000);

       driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

       //regular expression css
       driver.findElement(By.cssSelector(("input[type*='pass']"))).sendKeys("rahulshettyacademy");

       //selects checkbox
       driver.findElement(By.id("chkboxOne")).click();

       //regular expression using xpath
       driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();



    }

}
