package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Registration extends Data {
   // private By btnRegister = By.xpath("//div[@class ='<a href=\"https://velesmoda.ru/index.php?route=account/register\'] ");
    private By inputLastName = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-lastname'] ");
    private By inputFirstName = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-firstname'] ");
    private By inputEmail = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-email'] ");
    private By inputTelephone = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-telephone'] ");
    private By inputPassword = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-password'] ");
    private By inputConfirm = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-confirm'] ");

   // private By CheckBox = By.xpath("//div[@class ='recaptcha-checkbox-borderAnimation']//input[@id = 'recaptcha-anchor'] ");

    private By btnButtons = By.xpath("//div[@class ='text-center']//input[@type = 'submit'] ");

   @Test
    public void registration() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.get("https://google.com");

        Data getData = new Data();
        driver.get(getData.getUrl);
       // driver.findElement(btnRegister).click();
        driver.findElement(inputLastName).sendKeys(getData.lastName);
        driver.findElement(inputFirstName).sendKeys(getData.firstName);
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputTelephone).sendKeys(getData.telephone);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(inputConfirm).sendKeys(getData.confirm);
        //driver.findElement(By.id(checkbox)).click();
        driver.findElement(btnButtons).click();


        // driver.quit();
    }
}



