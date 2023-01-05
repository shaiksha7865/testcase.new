package com.selenium1.selenium_testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\workspace1\\chromedriver.exe");
        ChromeOptions ChromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(ChromeOptions);
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("email")).sendKeys("8431531992");
        driver.findElement(By.name("pass")).sendKeys("Shaiksha@123");
        driver.findElement(By.name("login")).click();

    }
}
