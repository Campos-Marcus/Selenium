package com.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/documentation/");

        driver.manage().window().maximize();

        System.out.println(driver.findElements(By.tagName("a")).size());

        System.out.println(driver.findElements(By.cssSelector("footer")).size());

        // to limite the escope size

        WebElement footdriver = driver.findElement(By.cssSelector("footer"));

        System.out.println(footdriver.findElements(By.tagName("a")).size());
    }

}
