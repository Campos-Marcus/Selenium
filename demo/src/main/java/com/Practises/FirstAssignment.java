package com.Practises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
        driver.findElement(By.cssSelector("input[name='radio'][value='user']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#okayBtn")));

        okButton.click();

        WebElement entityDropdown = driver.findElement(By.cssSelector("select[class='form-control']"));

        Select dropdown = new Select(entityDropdown);

        dropdown.selectByIndex(0);

        driver.findElement(By.cssSelector("input[id='terms']")).click();

        driver.findElement(By.cssSelector("input[id='signInBtn']")).click();

        // explicit wait to wait until the other page is visible - otherwise other
        // elements won't be shown
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.col-lg-9")));
        clickAllADDs(driver);

        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        System.out.println("checkout button was supposedly clicked");

    }

    public static void clickAllADDs(WebDriver driver) {
        List<WebElement> products = driver.findElements(By.cssSelector("button.btn-info"));

        System.out.println(products.size());

        for (int i = 0; i < products.size(); i++) {
            driver.findElements(By.cssSelector("button.btn-info")).get(i).click();
            System.out.println("Button" + driver.findElements(By.cssSelector("button.btn-info")).get(i) + "Was clicked" );
        }

    }

}
