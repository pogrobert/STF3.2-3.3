package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import constants.locators.StoreConstants;
import org.openqa.selenium.WebElement;

public class StorePage {
    private final WebDriver driver;

    private final By mainTitle = By.xpath(StoreConstants.MAIN_TITLE);
    private final By latestTitle = By.xpath(StoreConstants.THE_LATEST_TITLE);
    private final By helpTitle = By.xpath(StoreConstants.HELP_IS_HERE_TITLE);
    private final By differenceTitle = By.xpath(StoreConstants.THE_APPLE_DIFFERENCE);

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMainTitle() {
        return driver.findElement(mainTitle);
    }

    public WebElement getLatestTitle() {
        return driver.findElement(latestTitle);
    }

    public WebElement getHelpTitle() {
        return driver.findElement(helpTitle);
    }

    public WebElement getDifferenceNumber() {
        return driver.findElement(differenceTitle);
    }
}
