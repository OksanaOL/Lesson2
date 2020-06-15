package org.example;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AppTest {
    @Test
    public void MyFirstTest() {
        System.setProperty("webdriver.chrome.driver", "d:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://booking.com");
        //WebElement followButton = browser.findElement(By.cssSelector(".sign_in_wrapper"));
        //followButton.click();
        WebElement followButton = browser.findElement(By.xpath("//div[@class='sign_in_wrapper']"));
        followButton.click();
    }
}