package com.artema;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Set the Chrome web driver location
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
