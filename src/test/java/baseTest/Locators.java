package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class Locators {
        public static WebDriver driver;


        //Нажимаем кнопку Заказать
        /*public static final WebElement orderButtonTop = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));*/

        public static final WebElement orderButtonTop = driver.findElement(By.xpath("//button[.='Заказать']"));
        //Заполняем поля заказа
        //Имя
        public static final WebElement nameInput = driver.findElement(By.xpath(".//input[@placeholder='* Имя']"));
        //Фамилия
        WebElement surnameInput = driver.findElement(By.xpath(".//input[@placeholder='* Фамилия']"));
        //Адресс доставки
        WebElement addressInput = driver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"));
        //Телефон для связи с курьером
        WebElement phoneInput = driver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"));
        //Выбираем станцию метро Белорусская
        WebElement stationMetro = driver.findElement(By.xpath(".//input[@placeholder='* Станция метро']"));
        WebElement stationMetroUser = driver.findElement(By.xpath(".//button[@value='29']"));
        //Нажимаем кнопку далее
        WebElement orderButtonNext = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
        //Заполняем дату доставки
        WebElement orderArrivalDate = driver.findElement(By.xpath(".//input[@placeholder='* Когда привезти самокат']"));
        WebElement orderRentalPeriod = driver.findElement(By.className("Dropdown-control"));
        WebElement orderRentalPeriodDay = driver.findElement(By.className("Dropdown-option"));
        //Выбираем чек-бокс с цветом самоката
        WebElement colorRentScooter = driver.findElement(By.id("black"));
        //Заполняем комментарий
        WebElement commentCourier = driver.findElement(By.xpath(".//input[@placeholder='Комментарий для курьера']"));
        //Нажимаем кнопку Заказать
        WebElement makeAnOrder = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
        //Нажимаем кнопку подтверждения заказа
        WebElement confirmTheOrder = driver.findElement(By.xpath(".//button[contains(@class, 'Button_Button__ra12g') and text()='Да']"));
        //Выполняем сверку окна подтверждения заказа по тексту
        WebElement orderNumberWindow = driver.findElement(By.cssSelector("div.Order_ModalHeader__3FDaJ"));
        String orderNumberText = orderNumberWindow.getText();

}