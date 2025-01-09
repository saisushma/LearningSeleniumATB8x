package com.thetestingacademy.SeleniumExceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium37_StaleElementReferenceException {

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
        try {
            WebElement searchInput = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();

            //HTML Page(DOM) is not refreshed
            //driver will think that element may or may not available now.
            //I have found the element earlier.

            //if you want to fix the stale element exp = you need to refind the element

           // WebElement searchInput = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            searchInput.sendKeys("thetestingacademy" + Keys.ENTER);
        }catch(StaleElementReferenceException e) {
            System.out.println(e.getMessage());

        }


    }


}
