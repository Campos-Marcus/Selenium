package com.example.SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dinamicDropdowns {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();

        //come back here and make those work, else ask question in class 55

       //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click(); 
                    //glsctl00_mainContent_ddl_originStation1_CTNR
                    ////a[@value='BLR']
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
         
        //Thread.sleep(2000);

        //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();


        //also a way
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2])"));

        
    }
}
