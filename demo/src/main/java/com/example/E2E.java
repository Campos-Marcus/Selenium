package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class E2E {

    public static void main(String[] args) throws InterruptedException {

        // Set the correct extension path
        String extensionPath = "C:\\Users\\Hope\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ljngjbnaijcbncmcnjfhigebomdlkcjo\\6.1.12_0";

        // Create ChromeOptions to load the extension
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions-except=" + extensionPath);
        options.addArguments("--load-extension=" + extensionPath);

        // Launch Chrome with the extension
        WebDriver driver = new ChromeDriver(options);

        // Open a website to check if CroPath is loaded
        driver.get("chrome://extensions/");

        driver.manage().window().maximize();
        // its a responsive site, it changes based in the window

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // round trip button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        Thread.sleep(1000);

        // From button
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();

        Thread.sleep(1000);

        // Select in the from
        driver.findElement(By.xpath("//a[contains(text(),'Ahmedabad (AMD)')]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
                .click();

        Thread.sleep(1000);

        // click in a calendar day
        // driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/a[1]")).click();
        // click on an empty space
        driver.findElement(By.tagName("body")).click();

        // click on return date
        driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();

        // select day 16
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/a[1]")).click();

        // Add number of passagers
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.cssSelector("#btnclosepaxoption")).click();

        Thread.sleep(2000);

        // select currency
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);

        dropdown.selectByValue("AED");

        // click search button

        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

        // test
        // test

    }

}
