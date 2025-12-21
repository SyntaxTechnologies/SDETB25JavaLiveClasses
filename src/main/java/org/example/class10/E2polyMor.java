package org.example.class10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class E2polyMor {
    public static void main(String[] args) {


        WebDriver [] browsers={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};

        for (WebDriver wd:browsers){
            wd.get("https://facebook.com");
            wd.get("https://ebay.com");
            wd.get("https://amazon.com");
            wd.navigate().back();
            wd.navigate().refresh();
            wd.quit();
        }





    }
}
