package pages;

import constants.locators.BaseConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private final WebDriver driver;

    private final By homeButton = By.id(BaseConstants.HOME_BUTTON);
    private final By storeButton = By.xpath(BaseConstants.STORE_BUTTON);
    private final By supportButton = By.xpath(BaseConstants.SUPPORT_BUTTON);

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeButton() {
        return driver.findElement(homeButton);
    }

    public WebElement getStoreButton() {
        return driver.findElement(storeButton);
    }

    public WebElement getSupportButton() {
        return driver.findElement(supportButton);
    }
}
