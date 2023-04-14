package testOrderScooter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.Assert.assertEquals;

public class OrderScooterTestsFirefox {
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
    public void testOrderScooterUpButton() {
        //Нажимаем кнопку Заказать
        WebElement orderButtonTop = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']"));
        orderButtonTop.click();
        //Заполняем поля заказа
        //Имя
        WebElement nameInput = driver.findElement(By.xpath(".//input[@placeholder='* Имя']"));
        nameInput.sendKeys("Александр");
        //Фамилия
        WebElement surnameInput = driver.findElement(By.xpath(".//input[@placeholder='* Фамилия']"));
        surnameInput.sendKeys("Парлакян");
        //Адресс доставки
        WebElement addressInput = driver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"));
        addressInput.sendKeys("Ленинградский проспект дом 2 кор.1");
        //Телефон для связи с курьером
        WebElement phoneInput = driver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"));
        phoneInput.sendKeys("+79211065265");
        //Выбираем станцию метро Белорусская
        WebElement stationMetro = driver.findElement(By.xpath(".//input[@placeholder='* Станция метро']"));
        stationMetro.click();
        stationMetro.sendKeys("Белорусская");
        WebElement stationMetroUser = driver.findElement(By.xpath(".//button[@value='29']"));
        stationMetroUser.click();
        //Нажимаем кнопку далее
        WebElement orderButtonNext = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
        orderButtonNext.click();
        //Заполняем дату доставки
        WebElement orderArrivalDate = driver.findElement(By.xpath(".//input[@placeholder='* Когда привезти самокат']"));
        orderArrivalDate.click();
        orderArrivalDate.sendKeys("10.10.2025");
        orderArrivalDate.sendKeys(Keys.ENTER);
        WebElement orderRentalPeriod = driver.findElement(By.className("Dropdown-control"));
        orderRentalPeriod.click();
        WebElement orderRentalPeriodDay = driver.findElement(By.className("Dropdown-option"));
        orderRentalPeriodDay.click();
        //Выбираем чек-бокс с цветом самоката
        WebElement colorRentScooter = driver.findElement(By.id("black"));
        colorRentScooter.click();
        //Заполняем комментарий
        WebElement commentCourier = driver.findElement(By.xpath(".//input[@placeholder='Комментарий для курьера']"));
        commentCourier.sendKeys("Надо срочно");
        //Нажимаем кнопку Заказать
        WebElement makeAnOrder = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
        makeAnOrder.click();
        //Нажимаем кнопку подтверждения заказа
        WebElement confirmTheOrder = driver.findElement(By.xpath(".//button[contains(@class, 'Button_Button__ra12g') and text()='Да']"));
        confirmTheOrder.click();
        //Выполняем сверку окна подтверждения заказа по тексту
        WebElement orderNumberWindow = driver.findElement(By.cssSelector("div.Order_ModalHeader__3FDaJ"));
        String orderNumberText = orderNumberWindow.getText();
        assertEquals("Надпись 'Заказ оформлен' отображается корректно", true, orderNumberText.contains("Заказ оформлен"));
    }
    @Test
    public void testOrderScooterDownButton() {
        //Нажимаем кнопку Заказать
        WebElement orderButtonTop = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
        orderButtonTop.click();
        //Заполняем поля заказа
        //Имя
        WebElement nameInput = driver.findElement(By.xpath(".//input[@placeholder='* Имя']"));
        nameInput.sendKeys("Александр");
        //Фамилия
        WebElement surnameInput = driver.findElement(By.xpath(".//input[@placeholder='* Фамилия']"));
        surnameInput.sendKeys("Парлакян");
        //Адресс доставки
        WebElement addressInput = driver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"));
        addressInput.sendKeys("Ленинградский проспект дом 2 кор.1");
        //Телефон для связи с курьером
        WebElement phoneInput = driver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"));
        phoneInput.sendKeys("+79211065265");
        //Выбираем станцию метро Белорусская
        WebElement stationMetro = driver.findElement(By.xpath(".//input[@placeholder='* Станция метро']"));
        stationMetro.click();
        stationMetro.sendKeys("Белорусская");
        WebElement stationMetroUser = driver.findElement(By.xpath(".//button[@value='29']"));
        stationMetroUser.click();
        //Нажимаем кнопку далее
        WebElement orderButtonNext = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
        orderButtonNext.click();
        //Заполняем дату доставки
        WebElement orderArrivalDate = driver.findElement(By.xpath(".//input[@placeholder='* Когда привезти самокат']"));
        orderArrivalDate.click();
        orderArrivalDate.sendKeys("10.10.2025");
        orderArrivalDate.sendKeys(Keys.ENTER);
        WebElement orderRentalPeriod = driver.findElement(By.className("Dropdown-control"));
        orderRentalPeriod.click();
        WebElement orderRentalPeriodDay = driver.findElement(By.className("Dropdown-option"));
        orderRentalPeriodDay.click();
        //Выбираем чек-бокс с цветом самоката
        WebElement colorRentScooter = driver.findElement(By.id("black"));
        colorRentScooter.click();
        //Заполняем комментарий
        WebElement commentCourier = driver.findElement(By.xpath(".//input[@placeholder='Комментарий для курьера']"));
        commentCourier.sendKeys("Надо срочно");
        //Нажимаем кнопку Заказать
        WebElement makeAnOrder = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
        makeAnOrder.click();
        //Нажимаем кнопку подтверждения заказа
        WebElement confirmTheOrder = driver.findElement(By.xpath(".//button[contains(@class, 'Button_Button__ra12g') and text()='Да']"));
        confirmTheOrder.click();
        //Выполняем сверку окна подтверждения заказа по тексту
        WebElement orderNumberWindow = driver.findElement(By.cssSelector("div.Order_ModalHeader__3FDaJ"));
        String orderNumberText = orderNumberWindow.getText();
        assertEquals("Надпись 'Заказ оформлен' отображается корректно", true, orderNumberText.contains("Заказ оформлен"));
    }


        @After
        public void tearDown () {
            driver.quit();
        }
    }