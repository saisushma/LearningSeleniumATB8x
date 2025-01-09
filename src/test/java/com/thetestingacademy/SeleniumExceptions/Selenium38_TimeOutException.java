package com.thetestingacademy.SeleniumExceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium38_TimeOutException {

    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Test
        public void test_actions() throws InterruptedException{
        driver.get("https://google.com");
        driver.manage().window().maximize();
        WebDriver wait = (WebDriver) new WebDriverWait(driver, Duration.ofSeconds(10));

       // wait.until(ExpectedCondition.elementToBeClickable(By.xpath("//textarea[@id='abc']")));

        //here changed the xpath and waited till now, it throws timeOut exception


        WebElement searchInput = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            //HTML Page(DOM) is not refreshed


           // WebElement searchInput = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            searchInput.sendKeys("thetestingacademy" + Keys.ENTER);



    }


}
