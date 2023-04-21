package testing;

import base.BaseSetUp;
import org.junit.Test;
import page.ActionWithOrder;


public class OrderScooterTests extends BaseSetUp {
    ActionWithOrder actionWithOrder = new ActionWithOrder();

    @Test
    public void testOrderScooterUpButton() {
        //Нажимаем кнопку Заказать
        actionWithOrder.clickButtonOrderUp();
        // Заполняем поля заказа
        //Имя
        actionWithOrder.sendNameInput();
        //Фамилия
        actionWithOrder.sendSurnameInput();
        //Адресс доставки
        actionWithOrder.sendAddressInput();
        //Телефон для связи с курьером
        actionWithOrder.sendPhoneInput();
        //Выбираем станцию метро Белорусская
        actionWithOrder.choiceStationMetro();
        //Нажимаем кнопку далее
        actionWithOrder.orderButtonNextPage();
        //Заполняем дату доставки
        actionWithOrder.deliveryDateSelection();
        //Выбираем чек-бокс с цветом самоката
        actionWithOrder.choiceColorRentScooter();
        //Заполняем комментарий
        actionWithOrder.sendCommentCourier();
        //Нажимаем кнопку Заказать
        actionWithOrder.pressMakeAnOrder();
        //Нажимаем кнопку подтверждения заказа
        actionWithOrder.pressConfirmTheOrder();
        //Выполняем сверку окна подтверждения заказа по тексту
        actionWithOrder.pressOrderNumberWindow("Заказ оформлен");
    }

    @Test
    public void testOrderScooterDownButton() {
        //Нажимаем кнопку Заказать
        actionWithOrder.clickButtonOrderDown();
        // Заполняем поля заказа
        //Имя
        actionWithOrder.sendNameInput();
        //Фамилия
        actionWithOrder.sendSurnameInput();
        //Адресс доставки
        actionWithOrder.sendAddressInput();
        //Телефон для связи с курьером
        actionWithOrder.sendPhoneInput();
        //Выбираем станцию метро Белорусская
        actionWithOrder.choiceStationMetro();
        //Нажимаем кнопку далее
        actionWithOrder.orderButtonNextPage();
        //Заполняем дату доставки
        actionWithOrder.deliveryDateSelection();
        //Выбираем чек-бокс с цветом самоката
        actionWithOrder.choiceColorRentScooter();
        //Заполняем комментарий
        actionWithOrder.sendCommentCourier();
        //Нажимаем кнопку Заказать
        actionWithOrder.pressMakeAnOrder();
        //Нажимаем кнопку подтверждения заказа
        actionWithOrder.pressConfirmTheOrder();
        //Выполняем сверку окна подтверждения заказа по тексту
        actionWithOrder.pressOrderNumberWindow("Заказ оформлен");
    }
}