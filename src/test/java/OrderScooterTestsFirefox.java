import base.BaseSetUpChrome;
import base.BaseSetUpFirefox;
import org.junit.Test;
import page.ActionWithOrder;

public class OrderScooterTestsFirefox extends BaseSetUpFirefox {
    /*ActionWithOrder actionWithOrder = new ActionWithOrder(driver);*/
    @Test
    public void testOrderScooterUpButton() {

        //Нажимаем кнопку Заказать
        ActionWithOrder.clickButtonOrderUp();
        // Заполняем поля заказа   //Имя
        ActionWithOrder.sendNameInput();
        //Фамилия
        ActionWithOrder.sendSurnameInput();
        //Адресс доставки
        ActionWithOrder.sendAddressInput();
        //Телефон для связи с курьером
        ActionWithOrder.sendPhoneInput();
        //Выбираем станцию метро Белорусская
        ActionWithOrder.choiceStationMetro();
        //Нажимаем кнопку далее
        ActionWithOrder.orderButtonNextPage();
        //Заполняем дату доставки
        ActionWithOrder.deliveryDateSelection();
        //Выбираем чек-бокс с цветом самоката
        ActionWithOrder.choiceColorRentScooter();
        //Заполняем комментарий
        ActionWithOrder.sendCommentCourier();
        //Нажимаем кнопку Заказать
        ActionWithOrder.pressMakeAnOrder();
        //Нажимаем кнопку подтверждения заказа
        ActionWithOrder.pressConfirmTheOrder();
        //Выполняем сверку окна подтверждения заказа по тексту
        ActionWithOrder.pressOrderNumberWindow();}
    @Test
    public void testOrderScooterDownButton() {
        //Нажимаем кнопку Заказать
        ActionWithOrder.clickButtonOrderDown();
        // Заполняем поля заказаA        //Имя
        ActionWithOrder.sendNameInput();
        //Фамилия
        ActionWithOrder.sendSurnameInput();
        //Адресс доставки
        ActionWithOrder.sendAddressInput();
        //Телефон для связи с курьером
        ActionWithOrder.sendPhoneInput();
        //Выбираем станцию метро Белорусская
        ActionWithOrder.choiceStationMetro();
        //Нажимаем кнопку далее
        ActionWithOrder.orderButtonNextPage();
        //Заполняем дату доставкиdriver
        ActionWithOrder.deliveryDateSelection();
        //Выбираем чек-бокс с цветом самоката
        ActionWithOrder.choiceColorRentScooter();
        //Заполняем комментарий
        ActionWithOrder.sendCommentCourier();
        //Нажимаем кнопку Заказать
        ActionWithOrder.pressMakeAnOrder();
        //Нажимаем кнопку подтверждения заказа
        ActionWithOrder.pressConfirmTheOrder();
        //Выполняем сверку окна подтверждения заказа по тексту
        ActionWithOrder.pressOrderNumberWindow();
    }
}

