package java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.Assert.assertTrue;

public class QuestionsAboutImportantTestsFirefox {
    private WebDriver driver;

    @Before
        public void setUpFirefox() {
         FirefoxOptions options = new FirefoxOptions()
                 .addPreference("browser.startup.page", 3)
                 .addPreference("browser.startup.homepage", "https://qa-scooter.praktikum-services.ru");
         driver = new FirefoxDriver(options);
        WebElement kukiSpam = driver.findElement(By.xpath(".//button[@class='App_CookieButton__3cvqF']"));
        kukiSpam.click();
    }

    @Test
    public void testDropdownListHowMuch() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Скролим вниз страницы
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        WebElement dropdownArrow = driver.findElement(By.id("accordion__heading-0"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        WebElement dropDownText = driver.findElement(By.xpath("//*[contains(text(), 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue("Надпись 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.' отображается на странице", dropDownTextTest.contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }
    @Test
    public void testDropdownListSeveralScooters() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Скролим вниз страницы
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        WebElement dropdownArrow = driver.findElement(By.id("accordion__heading-1"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        WebElement dropDownText = driver.findElement(By.xpath("//p[contains(text(), 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue("Надпись 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.' отображается на странице", dropDownTextTest.contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }
    @Test
    public void testDropdownListTiming() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Скролим вниз страницы
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        WebElement dropdownArrow = driver.findElement(By.id("accordion__heading-2"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        WebElement dropDownText = driver.findElement(By.xpath("//*[contains(text(), 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }
    @Test
    public void testDropdownListNowTime() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Скролим вниз страницы
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        WebElement dropdownArrow = driver.findElement(By.id("accordion__heading-3"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        WebElement dropDownText = driver.findElement(By.xpath("//p[contains(text(), 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }
    @Test
    public void testDropdownListTurnInEarly() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Скролим вниз страницы
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        WebElement dropdownArrow = driver.findElement(By.id("accordion__heading-4"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        WebElement dropDownText = driver.findElement(By.xpath("//p[contains(text(), 'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }
    @Test
    public void testDropdownListCharger() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Скролим вниз страницы
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        WebElement dropdownArrow = driver.findElement(By.id("accordion__heading-5"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        WebElement dropDownText = driver.findElement(By.xpath("//p[contains(text(), 'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }
    @Test
    public void testDropdownListDoneOrder() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Скролим вниз страницы
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        WebElement dropdownArrow = driver.findElement(By.id("accordion__heading-6"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        WebElement dropDownText = driver.findElement(By.xpath("//p[contains(text(), 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }
    @Test
    public void testDropdownListMkad() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Скролим вниз страницы
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        WebElement dropdownArrow = driver.findElement(By.id("accordion__heading-7"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        WebElement dropDownText = driver.findElement(By.xpath("//p[contains(text(), 'Да, обязательно. Всем самокатов! И Москве, и Московской области.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }


    @After
    public void tearDown () {
        driver.quit();
    }
}