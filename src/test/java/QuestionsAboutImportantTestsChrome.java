import base.BaseSetUpChrome;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.ActionWithAccordion;

import static org.junit.Assert.assertTrue;

public class QuestionsAboutImportantTestsChrome extends BaseSetUpChrome {
    //Проверка кликабельности аккордеонов и текста внутри
    @Test
    public void testDropdownListHowMuch() {
        ActionWithAccordion.verifyDropDownText1();
    }
    @Test
    public void testDropdownListSeveralScooters() {
        ActionWithAccordion.verifyDropDownText2();
    }
    @Test
    public void testDropdownListTiming() {
        ActionWithAccordion.verifyDropDownText3();
    }
    @Test
    public void testDropdownListNowTime() {
        ActionWithAccordion.verifyDropDownText4();
    }
    @Test
    public void testDropdownListTurnInEarly() {
        ActionWithAccordion.verifyDropDownText5();
    }
    @Test
    public void testDropdownListCharger() {
        ActionWithAccordion.verifyDropDownText6();
    }
    @Test
    public void testDropdownListDoneOrder() {
        ActionWithAccordion.verifyDropDownText7();
    }
    @Test
    public void testDropdownListMkad() {
        ActionWithAccordion.verifyDropDownText7();
    }
}
