package org.example.class10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E1polyMor {
    public static void main(String[] args) {

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://facebook.com");
        chromeDriver.get("https://ebay.com");
        chromeDriver.get("https://amazon.com");
        chromeDriver.navigate().back();
        chromeDriver.navigate().refresh();
        chromeDriver.quit();


        FirefoxDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.get("https://facebook.com");
        firefoxDriver.get("https://ebay.com");
        firefoxDriver.get("https://amazon.com");
        firefoxDriver.navigate().back();
        firefoxDriver.navigate().refresh();
        firefoxDriver.quit();

        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://facebook.com");
        edgeDriver.get("https://ebay.com");
        edgeDriver.get("https://amazon.com");
        edgeDriver.navigate().back();
        edgeDriver.navigate().refresh();
        edgeDriver.quit();

    }
}
