package testing;

import base.BaseSetUp;
import org.junit.Test;
import page.ActionWithAccordion;

public class QuestionsAboutImportantTests extends BaseSetUp {
    ActionWithAccordion actionWithAccordion = new ActionWithAccordion();
    //Проверка кликабельности аккордеонов и текста внутри
    @Test()
    public void testDropdownListHowMuch() { actionWithAccordion.verifyDropDownText1(
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }

    @Test
    public void testDropdownListSeveralScooters() {
        actionWithAccordion.verifyDropDownText2("Пока что у нас так: один заказ — один самокат." +
                " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }

    @Test
    public void testDropdownListTiming() {
        actionWithAccordion.verifyDropDownText3("Допустим, вы оформляете заказ на 8 мая." +
                " Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента," +
                " когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30," +
                " суточная аренда закончится 9 мая в 20:30.");
    }

    @Test
    public void testDropdownListNowTime() {
        actionWithAccordion.verifyDropDownText4("Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }

    @Test
    public void testDropdownListTurnInEarly() {
        actionWithAccordion.verifyDropDownText5("Пока что нет! Но если что-то срочное — " +
                "всегда можно позвонить в поддержку по красивому номеру 1010.");
    }

    @Test
    public void testDropdownListCharger() {
        actionWithAccordion.verifyDropDownText6("Самокат приезжает к вам с полной зарядкой." +
                " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
    }

    @Test
    public void testDropdownListDoneOrder() {
        actionWithAccordion.verifyDropDownText7("Да, пока самокат не привезли. Штрафа не будет, " +
                "объяснительной записки тоже не попросим. Все же свои.");
    }

    @Test
    public void testDropdownListMkad() {
        actionWithAccordion.verifyDropDownText8("Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }

}
