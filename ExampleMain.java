package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExampleMain {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://google.com");

        WebElement webElement1 = driver.findElement(By.name("q"));
        WebElement webElement2 = driver.findElement(By.cssSelector("input.gLFyf"));

        try {
            WebElement webElementError = driver.findElement(By.name("error"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getSupportUrl());
        }
        List<WebElement> webElements = driver.findElements(By.name("error"));
        if (webElements.size() > 1) {
            //todo
        }


        webElement1.click();
        webElement2.sendKeys("Поиск");

        // driver.quit();
    }
}
