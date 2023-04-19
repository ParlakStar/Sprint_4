package page;

import base.BaseSetUp;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class ActionWithOrder extends BaseSetUp {

    //Кнопка заказать верхняя
    private final By orderButtonTop = By.xpath(".//button[@class='Button_Button__ra12g']");
    //Кнопка заказать нижняя
    private final By orderButtonDown = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Имя
    private final By nameInput = By.xpath("//input[@placeholder='* Имя']");
    //Фамилия
    private final By surnameInput = By.xpath("//input[@placeholder='* Фамилия']");
    //Адресс доставки
    private final By addressInput = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //Телефон для связи с курьером
    private final By phoneInput = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Выбираем станцию метро Белорусская
    private final By stationMetro = By.xpath("//input[@placeholder='* Станция метро']");
    private final By stationMetroUser = By.xpath("//button[@value='29']");
    //Нажимаем кнопку далее
    private final By orderButtonNext = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Заполняем дату доставки
    private final By orderArrivalDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private final By orderRentalPeriod = By.className("Dropdown-control");
    private final By orderRentalPeriodDay = By.className("Dropdown-option");
    //Выбираем чек-бокс с цветом самоката
    private final By colorRentScooter = By.id("black");
    //Заполняем комментарий
    private final By commentCourier = By.xpath("//input[@placeholder='Комментарий для курьера']");
    //Нажимаем кнопку Заказать
    private final By makeAnOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Нажимаем кнопку подтверждения заказа
    private final By confirmTheOrder = By.xpath("//button[contains(@class, 'Button_Button__ra12g') and text()='Да']");
    //Выполняем сверку окна подтверждения заказа по тексту
    private final By orderNumberWindow = By.xpath("//div[contains(text(), 'Заказ оформлен')]");

    //Метод входа в заказ

    public void clickButtonOrderUp() {
        driver.findElement(orderButtonTop).click();
    }

    public void clickButtonOrderDown() {
        driver.findElement(orderButtonDown).click();
    }

    //Заполнение поля Имя
    public void sendNameInput() {
        driver.findElement(nameInput).sendKeys("Александр");
    }

    public void sendSurnameInput() {
        driver.findElement(surnameInput).sendKeys("Парлакян");
    }

    public void sendAddressInput() {
        driver.findElement(addressInput).sendKeys("Ленинградский проспект дом 2 кор.1");
    }

    public void sendPhoneInput() {
        driver.findElement(phoneInput).sendKeys("+79211065265");
    }

    public void choiceStationMetro() {
        driver.findElement(stationMetro).click();
        driver.findElement(stationMetro).sendKeys("Белорусская");
        driver.findElement(stationMetroUser).click();
    }

    public void orderButtonNextPage() {
        driver.findElement(orderButtonNext).click();
    }

    public void deliveryDateSelection() {
        driver.findElement(orderArrivalDate).click();
        driver.findElement(orderArrivalDate).sendKeys("10.10.2025");
        driver.findElement(orderArrivalDate).sendKeys(Keys.ENTER);
        driver.findElement(orderRentalPeriod).click();
        driver.findElement(orderRentalPeriodDay).click();
    }

    public void choiceColorRentScooter() {
        driver.findElement(colorRentScooter).click();
    }

    public void sendCommentCourier() {
        driver.findElement(commentCourier).sendKeys("Надо срочно");
    }

    public void pressMakeAnOrder() {
        driver.findElement(makeAnOrder).click();
    }

    public void pressConfirmTheOrder() {
        driver.findElement(confirmTheOrder).click();
    }

    public void pressOrderNumberWindow(String text) {
        WebElement orderNumberElement = driver.findElement(orderNumberWindow);
        String orderNumberText = orderNumberElement.getText();
       Assert.assertTrue("Надпись 'Заказ оформлен' отображается некорректно",orderNumberText.contains(text));
    }
}
