package page;

import base.BaseSetUpChrome;
import org.openqa.selenium.WebDriver;


public class BasePage {
        protected  WebDriver driver;

        public BasePage() {
                this.driver = BaseSetUpChrome.getDriver();
                }
}