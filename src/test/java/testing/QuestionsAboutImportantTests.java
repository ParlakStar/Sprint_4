package testing;

import base.BaseSetUp;
import org.junit.Test;
import page.ActionWithAccordion;

import static org.junit.Assert.assertEquals;

public class QuestionsAboutImportantTests extends BaseSetUp {
    ActionWithAccordion actionWithAccordion = new ActionWithAccordion();
    //Проверка кликабельности аккордеонов и текста внутри
    @Test
    public void testDropdownListHowMuch() {
        String expectedDropDownText1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actualDropDownText1 = actionWithAccordion.getDropDownText1();
        assertEquals(expectedDropDownText1, actualDropDownText1);
    }

    @Test
    public void testDropdownListSeveralScooters() {
        String expectedDropDownText2 = "Пока что у нас так: один заказ — один самокат." +
                " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actualDropDownText2 = actionWithAccordion.getDropDownText2();
        assertEquals(expectedDropDownText2, actualDropDownText2);
    }

    @Test
    public void testDropdownListTiming() {
        String expectedDropDownText3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
                " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30," +
                " суточная аренда закончится 9 мая в 20:30.";
        String actualDropDownText3 = actionWithAccordion.getDropDownText3();
        assertEquals(expectedDropDownText3, actualDropDownText3);
    }

    @Test
    public void testDropdownListNowTime() {
        String expectedDropDownText4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actualDropDownText4 = actionWithAccordion.getDropDownText4();
        assertEquals(expectedDropDownText4, actualDropDownText4);
    }

    @Test
    public void testDropdownListTurnInEarly() {
        String expectedDropDownText5 = "Пока что нет! Но если что-то срочное — " +
                "всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actualDropDownText5 = actionWithAccordion.getDropDownText5();
        assertEquals(expectedDropDownText5, actualDropDownText5);
    }

    @Test
    public void testDropdownListCharger() {
        String expectedDropDownText6 = "Самокат приезжает к вам с полной зарядкой." +
                " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actualDropDownText6 = actionWithAccordion.getDropDownText6();
        assertEquals(expectedDropDownText6, actualDropDownText6);
    }

    @Test
    public void testDropdownListDoneOrder() {
        String expectedDropDownText7 = "Да, пока самокат не привезли. Штрафа не будет, " +
                "объяснительной записки тоже не попросим. Все же свои.";
        String actualDropDownText7 = actionWithAccordion.getDropDownText7();
        assertEquals(expectedDropDownText7, actualDropDownText7);
    }

    @Test
    public void testDropdownListMkad() {
        String expectedDropDownText8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actualDropDownText8 = actionWithAccordion.getDropDownText8();
        assertEquals(expectedDropDownText8, actualDropDownText8);
    }

}
