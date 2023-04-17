package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import page.BasePage;

public class BaseSetUpFirefox extends BasePage {
    protected static WebDriver driver;
    public JavascriptExecutor jsFirefox;

    @Before
    public void setUpFirefox() {
        FirefoxOptions options = new FirefoxOptions()
                .addPreference("browser.startup.page", 3)
                .addPreference("browser.startup.homepage", "https://qa-scooter.praktikum-services.ru");
        driver = new FirefoxDriver(options);
        jsFirefox = (JavascriptExecutor) driver;
        WebElement kukiSpam = driver.findElement(By.xpath(".//button[@class='App_CookieButton__3cvqF']"));
        kukiSpam.click();
    }
    @After
    public void tearDown () {
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }

}
