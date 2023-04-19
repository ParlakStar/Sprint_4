import base.BaseSetUpChrome;
import base.BaseSetUpFirefox;
import org.junit.Test;
import page.ActionWithOrder;

public class OrderScooterTestsFirefox extends BaseSetUpFirefox {
    /*ActionWithOrder actionWithOrder = new ActionWithOrder(driver);*/
    @Test
    public void testOrderScooterUpButton() {

        //Нажимаем кнопку Заказать
        ActionWithOrder.clickButtonOrderUp(driver);
        // Заполняем поля заказа
        //Имя
        actionWithOrder.sendNameInput(driver);
        //Фамилия
        actionWithOrder.sendSurnameInput(driver);
        //Адресс доставки
        actionWithOrder.sendAddressInput(driver);
        //Телефон для связи с курьером
        actionWithOrder.sendPhoneInput(driver);
        //Выбираем станцию метро Белорусская
        actionWithOrder.choiceStationMetro(driver);
        //Нажимаем кнопку далее
        actionWithOrder.orderButtonNextPage(driver);
        //Заполняем дату доставки
        actionWithOrder.deliveryDateSelection(driver);
        //Выбираем чек-бокс с цветом самоката
        actionWithOrder.choiceColorRentScooter(driver);
        //Заполняем комментарий
        actionWithOrder.sendCommentCourier(driver);
        //Нажимаем кнопку Заказать
        actionWithOrder.pressMakeAnOrder(driver);
        //Нажимаем кнопку подтверждения заказа
        actionWithOrder.pressConfirmTheOrder(driver);
        //Выполняем сверку окна подтверждения заказа по тексту
        actionWithOrder.pressOrderNumberWindow(driver);}
    @Test
    public void testOrderScooterDownButton() {
        //Нажимаем кнопку Заказать
        actionWithOrder.clickButtonOrderDown(driver);
        // Заполняем поля заказа
        //Имя
        actionWithOrder.sendNameInput(driver);
        //Фамилия
        actionWithOrder.sendSurnameInput(driver);
        //Адресс доставки
        actionWithOrder.sendAddressInput(driver);
        //Телефон для связи с курьером
        actionWithOrder.sendPhoneInput(driver);
        //Выбираем станцию метро Белорусская
        actionWithOrder.choiceStationMetro(driver);
        //Нажимаем кнопку далее
        actionWithOrder.orderButtonNextPage(driver);
        //Заполняем дату доставкиdriver
        actionWithOrder.deliveryDateSelection(driver);
        //Выбираем чек-бокс с цветом самоката
        actionWithOrder.choiceColorRentScooter(driver);
        //Заполняем комментарий
        actionWithOrder.sendCommentCourier(driver);
        //Нажимаем кнопку Заказать
        actionWithOrder.pressMakeAnOrder(driver);
        //Нажимаем кнопку подтверждения заказа
        actionWithOrder.pressConfirmTheOrder(driver);
        //Выполняем сверку окна подтверждения заказа по тексту
        actionWithOrder.pressOrderNumberWindow(driver);
    }
}

