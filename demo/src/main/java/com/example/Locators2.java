package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String name = "rahul";
        System.setProperty("webdriver.chrome.driver", "C:/Users/Hope/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //by id
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        //by name
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        //by classname
        driver.findElement(By.className("signInBtn")).click();

        

        Thread.sleep(1000);
        System.out.println("the value of .p is " +driver.findElement(By.tagName("p")).getText());
        //testng assertions
         Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

         //parent to child css
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        //identifying elements based on text
        //button[text()='Log Out']
        
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();

        driver.close();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException{
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        //parent child with css
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        String [] passwordArray  = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];


        return password;

    }

}
