package com.thetestingacademy.ex_18122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium01 {

    @Test
    public void testSelenium(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();

    }
}
