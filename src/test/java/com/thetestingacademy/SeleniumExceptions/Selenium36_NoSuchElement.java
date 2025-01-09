package com.thetestingacademy.SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium36_NoSuchElement {

    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Test
        public void test_actions() throws InterruptedException{
           driver.get("https://app.vwo.com/#/login");
           driver.manage().window().maximize();
        try {
            driver.findElement(By.id("sai"));
        } catch (NoSuchElementException e) {
           e.printStackTrace();
            System.out.println(e.getMessage());

        }

        driver.get("https://google.com");


    }


}
