package com.thetestingacademy.ex_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium04 {

    @Test
    public void testSelenium(){
        WebDriver driver = new EdgeDriver(); //- dynamic dispatch
        driver.get("https://app.vwo.com");
//        driver.quit();


    }
}
