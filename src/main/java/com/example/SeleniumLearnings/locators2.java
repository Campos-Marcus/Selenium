package com.example.SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://schedule.campify.io/login");
        driver.findElement(By.id("mat-input-0")).sendKeys("campos.marcusrodrigues@gmail.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("Ch@ng3m3");
        driver.findElement(By.cssSelector("span[class='mat-button-wrapper']")).click();
        Thread.sleep(5000);

        System.out.println("!!!!");
        System.out.println(driver.findElement(By.cssSelector("div[class='module-name-container']")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='module-name-container']")).getText(), "Home");
        




    }

}
