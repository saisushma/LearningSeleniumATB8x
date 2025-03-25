package com.thetestingacademy.ex_18122024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium08 {
    @Test
    public  void testMethod01() throws Exception{

        //edgeoptions - it will help you to set the browser
        //options to browsers
        //window - size
        //headless mode - there is not UI -> advantage - fast execution
        //full UI mode - default - Ui browser
        //incognito mode - switch
        //start max
        //add extensions - browsers
        //localstorage, download

        ChromeOptions chromeOptions = new ChromeOptions();
        //edgeOptions.addArguments("--incognito");
        //edgeOptions.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://google.com");
        WebElement search = driver.findElement(By.xpath("//textarea[@title='Search']"));
               search.sendKeys("Chilukuri sai sushma");
               search.submit();

//        Actions a = new Actions(driver);
//        a.sendKeys(Keys.ENTER);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='yuRUbf']"));

        for(WebElement e : elements)
        {
            System.out.println(e);
        }

    }
}

