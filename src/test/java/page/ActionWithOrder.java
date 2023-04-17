package page;


import base.BaseSetUpChrome;
import base.BaseSetUpFirefox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;


public class ActionWithOrder extends BaseSetUpChrome {
    //Кнопка заказать верхняя
    private static final By orderButtonTop = By.xpath(".//button[@class='Button_Button__ra12g']");
    //Кнопка заказать нижняя
    private static final By orderButtonDown = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Имя
    private static final By nameInput = By.xpath("//input[@placeholder='* Имя']");
    //Фамилия
    private static final By surnameInput = By.xpath("//input[@placeholder='* Фамилия']");
    //Адресс доставки
    private static final By addressInput = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //Телефон для связи с курьером
    private static final By phoneInput = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Выбираем станцию метро Белорусская
    private static final By stationMetro = By.xpath("//input[@placeholder='* Станция метро']");
    private static final By stationMetroUser = By.xpath("//button[@value='29']");
    //Нажимаем кнопку далее
    private static final By orderButtonNext = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Заполняем дату доставки
    private static final By orderArrivalDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private static final By orderRentalPeriod = By.className("Dropdown-control");
    private static final By orderRentalPeriodDay = By.className("Dropdown-option");
    //Выбираем чек-бокс с цветом самоката
    private static final By colorRentScooter = By.id("black");
    //Заполняем комментарий
    private static final By commentCourier = By.xpath("//input[@placeholder='Комментарий для курьера']");
    //Нажимаем кнопку Заказать
    private static final By makeAnOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Нажимаем кнопку подтверждения заказа
    private static final By confirmTheOrder = By.xpath("//button[contains(@class, 'Button_Button__ra12g') and text()='Да']");
    //Выполняем сверку окна подтверждения заказа по тексту
    private static final By orderNumberWindow = By.xpath("//div[contains(text(), 'Заказ оформлен')]");

    //Метод входа в заказ
    public static void clickButtonOrderUp() {
       driver.findElement(orderButtonTop).click();
    }
    public static void clickButtonOrderDown() {
        driver.findElement(orderButtonDown).click();
    }

    //Заполнение поля Имя
    public static void sendNameInput() {
        driver.findElement(nameInput).sendKeys("Александр");
    }

    public static void sendSurnameInput() {
        driver.findElement(surnameInput).sendKeys("Парлакян");
    }

    public static void sendAddressInput() {
        driver.findElement(addressInput).sendKeys("Ленинградский проспект дом 2 кор.1");
    }

    public static void sendPhoneInput() {
        driver.findElement(phoneInput).sendKeys("+79211065265");
    }

    public static void choiceStationMetro() {
        driver.findElement(stationMetro).click();
        driver.findElement(stationMetro).sendKeys("Белорусская");
        driver.findElement(stationMetroUser).click();
    }

    public static void orderButtonNextPage() {
        driver.findElement(orderButtonNext).click();
    }

    public static void deliveryDateSelection() {
        driver.findElement(orderArrivalDate).click();
        driver.findElement(orderArrivalDate).sendKeys("10.10.2025");
        driver.findElement(orderArrivalDate).sendKeys(Keys.ENTER);
        driver.findElement(orderRentalPeriod).click();
        driver.findElement(orderRentalPeriodDay).click();
    }

    public static void choiceColorRentScooter() {
        driver.findElement(colorRentScooter).click();
    }

    public static void sendCommentCourier() {
        driver.findElement(commentCourier).sendKeys("Надо срочно");
    }

    public static void pressMakeAnOrder() {
        driver.findElement(makeAnOrder).click();
    }

    public static void pressConfirmTheOrder() {
        driver.findElement(confirmTheOrder).click();
    }

    public static void pressOrderNumberWindow() {
        WebElement orderNumberElement = driver.findElement(orderNumberWindow);
        String orderNumberText = orderNumberElement.getText();
        assertEquals("Надпись 'Заказ оформлен' отображается корректно", true, orderNumberText.contains("Заказ оформлен"));
    }
}
