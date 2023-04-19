package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseSetUp {
    protected static WebDriver driver;
    protected static JavascriptExecutor jsChrome;

    @Before
    public void setUpChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        jsChrome = (JavascriptExecutor) driver;
        WebElement kukiSpam = driver.findElement(By.xpath(".//button[@class='App_CookieButton__3cvqF']"));
        kukiSpam.click();

    }

    @After
    public void tearDown() {
        driver.quit();
    }


}

