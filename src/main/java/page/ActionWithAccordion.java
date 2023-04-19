package page;

import base.BaseSetUp;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class ActionWithAccordion extends BaseSetUp {
    //Аккордеоны и методы их проверки
    private final By dropdownArrow1 = By.id("accordion__heading-0");
    private final By dropdownArrow2 = By.id("accordion__heading-1");
    private final By dropdownArrow3 = By.id("accordion__heading-2");
    private final By dropdownArrow4 = By.id("accordion__heading-3");
    private final By dropdownArrow5 = By.id("accordion__heading-4");
    private final By dropdownArrow6 = By.id("accordion__heading-5");
    private final By dropdownArrow7 = By.id("accordion__heading-6");
    private final By dropdownArrow8 = By.id("accordion__heading-7");
    private final By dropDownText1 = By.xpath("//*[contains(text(), 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.')]");
    private final By dropDownText2 = By.xpath("//p[contains(text(), 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.')]");
    private final By dropDownText3 = By.xpath("//*[contains(text(), 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.')]");
    private final By dropDownText4 = By.xpath("//p[contains(text(), 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.')]");
    private final By dropDownText5 = By.xpath("//p[contains(text(), 'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.')]");
    private final By dropDownText6 = By.xpath("//p[contains(text(), 'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.')]");
    private final By dropDownText7 = By.xpath("//p[contains(text(), 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.')]");
    private final By dropDownText8 = By.xpath("//p[contains(text(), 'Да, обязательно. Всем самокатов! И Москве, и Московской области.')]");
    public void verifyDropDownText1(String expectedDropDownContext1 ) {
            jsChrome.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            WebElement dropdownArrowElement = driver.findElement(dropdownArrow1);
            dropdownArrowElement.click();
            WebElement dropDownTextElement = driver.findElement(dropDownText1);
            String dropDownTextTest = dropDownTextElement.getText();
            Assert.assertTrue("Надпись 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.'" +
                    " отображается на странице", dropDownTextTest.contains(expectedDropDownContext1));
        }
    public void verifyDropDownText2(String expectedDropDownContext2) {
            WebElement dropdownArrowElement = driver.findElement(dropdownArrow2);
            dropdownArrowElement.click();
            WebElement dropDownTextElement = driver.findElement(dropDownText2);
            String dropDownTextTest = dropDownTextElement.getText();
            Assert.assertTrue("Надпись 'Пока что у нас так: один заказ — один самокат." +
                    " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.' " +
                    "отображается на странице", dropDownTextTest.contains(expectedDropDownContext2));
        }
    public void verifyDropDownText3(String expectedDropDownContext3) {
            WebElement dropdownArrowElement = driver.findElement(dropdownArrow3);
            dropdownArrowElement.click();
            WebElement dropDownTextElement = driver.findElement(dropDownText3);
            String dropDownTextTest = dropDownTextElement.getText();
            Assert.assertTrue("Надпись 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
                    " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                    "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.'" +
                    " отображается на странице", dropDownTextTest.contains(expectedDropDownContext3));
        }
    public void verifyDropDownText4(String expectedDropDownContext4) {
            WebElement dropdownArrowElement = driver.findElement(dropdownArrow4);
            dropdownArrowElement.click();
            WebElement dropDownTextElement = driver.findElement(dropDownText4);
            String dropDownTextTest = dropDownTextElement.getText();
            assertTrue("Надпись 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.' отображается на странице",
                    dropDownTextTest.contains(expectedDropDownContext4));
        }
    public void verifyDropDownText5(String expectedDropDownContext5) {
            WebElement dropdownArrowElement = driver.findElement(dropdownArrow5);
            dropdownArrowElement.click();
            WebElement dropDownTextElement = driver.findElement(dropDownText5);
            String dropDownTextTest = dropDownTextElement.getText();
            assertTrue("Надпись 'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.'" +
                    " отображается на странице", dropDownTextTest.contains(expectedDropDownContext5));
        }
    public void verifyDropDownText6(String expectedDropDownContext6) {
            WebElement dropdownArrowElement = driver.findElement(dropdownArrow6);
            dropdownArrowElement.click();
            WebElement dropDownTextElement = driver.findElement(dropDownText6);
            String dropDownTextTest = dropDownTextElement.getText();
            assertTrue("Надпись 'Самокат приезжает к вам с полной зарядкой." +
                    " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.'" +
                    " отображается на странице", dropDownTextTest.contains(expectedDropDownContext6));
        }
    public void verifyDropDownText7(String expectedDropDownContext7) {
            WebElement dropdownArrowElement = driver.findElement(dropdownArrow7);
            dropdownArrowElement.click();
            WebElement dropDownTextElement = driver.findElement(dropDownText7);
            String dropDownTextTest = dropDownTextElement.getText();
            assertTrue("Надпись 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим." +
                    " Все же свои.' отображается на странице", dropDownTextTest.contains(expectedDropDownContext7));
        }
    public void verifyDropDownText8(String expectedDropDownContext8) {
            WebElement dropdownArrowElement = driver.findElement(dropdownArrow8);
            dropdownArrowElement.click();
            WebElement dropDownTextElement = driver.findElement(dropDownText8);
            String dropDownTextTest = dropDownTextElement.getText();
            assertTrue("Надпись 'Да, обязательно. Всем самокатов! И Москве, и Московской области.' " +
                    "отображается на странице", dropDownTextTest.contains(expectedDropDownContext8));
        }
}
