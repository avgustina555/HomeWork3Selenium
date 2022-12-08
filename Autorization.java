package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Autorization  {

    private By inputEmail = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-email'] ");
    private By inputPassword = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-password'] ");
    private By btnButtons = By.xpath("//div[@class ='btn btn-main']//input[@type = 'submit'] ");


    @Test
    public void autorization () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Data getData = new Data();
        driver.get("https://velesmoda.ru/index.php?route=account/login");

        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnButtons).click();


        // driver.quit();

    }
}
