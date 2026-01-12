package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ebay.com/");
        // use ebay ebay.com and try out

        Actions a = new Actions(driver);

        // hover
        a.moveToElement(driver.findElement(By.cssSelector("a[href='https://export.ebay.com/en/']"))).build().perform();

        
        WebElement move = driver.findElement(By.cssSelector("input[title='Pesquisar']"));
        // type with SHIFT turned on
        a.moveToElement(driver.findElement(By.cssSelector("input[title='Pesquisar']"))).click().keyDown(Keys.SHIFT)
                .sendKeys("Helloo")
                .doubleClick()
                .build().perform();

        a.moveToElement(move).build().perform();

        // drag and drop

    }

}
