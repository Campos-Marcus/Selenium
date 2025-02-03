package com.example.SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
public class updatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

/*         System.out.println(driver.findElement(By.id("input[id*='SeniorCitizenDiscount']")).isSelected());
        //regex
        driver.findElement(By.id("input[id*='SeniorCitizenDiscount']")).click();

        System.out.println(driver.findElement(By.id("input[id*='SeniorCitizenDiscount']")).isSelected());

            

        //driver.get("http://spicejet.com");

        driver.findElement(By.id("divpaxinfo")).click();
            Thread.sleep(2000L);
        
        for(int i = 0 ; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        WebDriver driver =new ChromeDriver();
 */

 //professorCode
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        




    }
}
