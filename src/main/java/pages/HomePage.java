package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import constants.locators.HomePageConstants;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;

    private final By shopTitle = By.xpath(HomePageConstants.SHOP_TITLE);
    private final By servicesTitle = By.xpath(HomePageConstants.SERVICES_TITLE);
    private final By accountTitle = By.xpath(HomePageConstants.ACCOUNT_TITLE);

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getShopTitle() {
        return driver.findElement(shopTitle);
    }

    public WebElement getServicesTitle() {
        return driver.findElement(servicesTitle);
    }

    public WebElement getAccountTitle() {
        return driver.findElement(accountTitle);
    }

}
