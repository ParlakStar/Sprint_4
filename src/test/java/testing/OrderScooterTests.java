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
        actionWithOrder.sendNameInput("Александр");
        //Фамилия
        actionWithOrder.sendSurnameInput("Парлакян");
        //Адресс доставки
        actionWithOrder.sendAddressInput("Ленинградский проспект дом 2 кор.1");
        //Телефон для связи с курьером
        actionWithOrder.sendPhoneInput("+79211065265");
        //Выбираем станцию метро Белорусская
        actionWithOrder.choiceStationMetro("Белорусская");
        //Нажимаем кнопку далее
        actionWithOrder.orderButtonNextPage();
        //Заполняем дату доставки
        actionWithOrder.deliveryDateSelection("10.10.2025");
        //Выбираем чек-бокс с цветом самоката
        actionWithOrder.choiceColorRentScooter();
        //Заполняем комментарий
        actionWithOrder.sendCommentCourier("Надо срочно");
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
        actionWithOrder.sendNameInput("Александр");
        //Фамилия
        actionWithOrder.sendSurnameInput("Парлакян");
        //Адресс доставки
        actionWithOrder.sendAddressInput("Ленинградский проспект дом 2 кор.1");
        //Телефон для связи с курьером
        actionWithOrder.sendPhoneInput("+79211065265");
        //Выбираем станцию метро Белорусская
        actionWithOrder.choiceStationMetro("Белорусская");
        //Нажимаем кнопку далее
        actionWithOrder.orderButtonNextPage();
        //Заполняем дату доставки
        actionWithOrder.deliveryDateSelection("10.10.2025");
        //Выбираем чек-бокс с цветом самоката
        actionWithOrder.choiceColorRentScooter();
        //Заполняем комментарий
        actionWithOrder.sendCommentCourier("Надо срочно");
        //Нажимаем кнопку Заказать
        actionWithOrder.pressMakeAnOrder();
        //Нажимаем кнопку подтверждения заказа
        actionWithOrder.pressConfirmTheOrder();
        //Выполняем сверку окна подтверждения заказа по тексту
        actionWithOrder.pressOrderNumberWindow("Заказ оформлен");
    }
}