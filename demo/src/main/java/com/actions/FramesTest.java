package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {  
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");

        //driver.switchTo().frame(0); //also possible

        //number of iframes in the page:
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='/resources/demos/droppable/default.html']")));
        driver.findElement(By.id("draggable")).click();

        Actions a = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();

        driver.switchTo().defaultContent();

    }

}
