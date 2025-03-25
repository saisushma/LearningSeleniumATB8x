package com.thetestingacademy.ex_18122024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void testSelenium(){
//        WebDriver driver = new EdgeDriver(); - dynamic dispatch
//        driver.get("https://app.vwo.com");
//        driver.quit();

      //  SearchContext driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
       // ChromeDriver driver = new ChromeDriver();

        //Scenarios
        // 1. do u want to run on particuar browser.[ chrome/edge]
        // ChromeDriver driver = new ChromeDriver(); -1% usage

        //2. Do u want to run on chrome and then change to Edge?
        // WebDriver driver = new ChromeDriver();
              //driver = new EdgeDriver(); 97% usage

        //3 Do you want to run on multiple browsers/ multiple machines[aws]? 2%
        //RemoteWebDriver driver (with GRID) - advance(last 2 session)

    }
}
