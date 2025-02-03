package com.example.SeleniumLearnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://schedule.campify.io/login");
        driver.findElement(By.id("mat-input-0")).sendKeys("campos.marcusrodrigues@gmail.com");
        //.name - name of the NAME attribute
        driver.findElement(By.id("mat-input-1")).sendKeys("Ch@ng3m3");
        //driver.findElement(By.className("mat-focus-indicator")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.findElement(By.cssSelector("span[class='mat-button-wrapper']")).getText());

        driver.findElement(By.linkText("Forgot Password?")).click();

        //System.out.println(driver.findElement(By.xpath("input[formcontrolname='username']")).getText());

        //driver.findElement(By.cssSelector("span[class='mat-button-wrapper']")).click();


    }
}
