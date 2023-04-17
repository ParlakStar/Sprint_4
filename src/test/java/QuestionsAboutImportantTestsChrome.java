import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

/*
public class QuestionsAboutImportantTestsChrome extends BaseSetUpChrome {
    @Test
    public void testDropdownListHowMuch() {

        //Скролим вниз страницы
        jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        private final By dropdownArrow = By.id("accordion__heading-0"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        private final By dropDownText = By.xpath("//*[contains(text(), 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue("Надпись 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.' отображается на странице", dropDownTextTest.contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }
    @Test
    public void testDropdownListSeveralScooters() {
        //Скролим вниз страницы
        jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        private final By dropdownArrow = By.id("accordion__heading-1"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        private final By dropDownText = By.xpath("//p[contains(text(), 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue("Надпись 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.' отображается на странице", dropDownTextTest.contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }
    @Test
    public void testDropdownListTiming() {
        //Скролим вниз страницы
        jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        private final By dropdownArrow = By.id("accordion__heading-2"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        private final By dropDownText = By.xpath("//*[contains(text(), 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }
    @Test
    public void testDropdownListNowTime() {
        //Скролим вниз страницы
        jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        private final By dropdownArrow = By.id("accordion__heading-3"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        private final By dropDownText = By.xpath("//p[contains(text(), 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }
    @Test
    public void testDropdownListTurnInEarly() {
        //Скролим вниз страницы
        jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        private final By dropdownArrow = By.id("accordion__heading-4"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        private final By dropDownText = By.xpath("//p[contains(text(), 'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }
    @Test
    public void testDropdownListCharger() {
        //Скролим вниз страницы
        jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        private final By dropdownArrow = By.id("accordion__heading-5"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        private final By dropDownText = By.xpath("//p[contains(text(), 'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }
    @Test
    public void testDropdownListDoneOrder() {
        //Скролим вниз страницы
        jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        private final By dropdownArrow = By.id("accordion__heading-6"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        private final By dropDownText = By.xpath("//p[contains(text(), 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }
    @Test
    public void testDropdownListMkad() {
        //Скролим вниз страницы
        jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //Нажимаем на всплывающий список
        private final By dropdownArrow = By.id("accordion__heading-7"));
        dropdownArrow.click();
        //Получаем текст из списка и сверяем по шаблону
        private final By dropDownText = By.xpath("//p[contains(text(), 'Да, обязательно. Всем самокатов! И Москве, и Московской области.')]"));
        String dropDownTextTest = dropDownText.getText();
        assertTrue(dropDownTextTest.contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
}*/
