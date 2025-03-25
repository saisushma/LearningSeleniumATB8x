package com.thetestingacademy.ex_18122024;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium07 {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        // it will run only on edge and this code cannot be used on other browsers.& cannot use other methods which are created
        // in another chromeDriver/ WebDriver and all
        driver.get("https://sdet.live");
        driver.quit();
    }
}
