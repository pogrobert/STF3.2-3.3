package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import constants.locators.SupportConstants;
import org.openqa.selenium.WebElement;

public class SupportPage {
    private final WebDriver driver;

    private final By mainTitle = By.xpath(SupportConstants.MAIN_TITLE);
    private final By appleWorkoutsTitle = By.xpath(SupportConstants.APPLE_WATCH_WORKOUT);
    private final By faceTimeTitle = By.xpath(SupportConstants.FACE_TIME_CONNECTED);
    private final By virtualSessionsTitle = By.xpath(SupportConstants.VIRTUAL_SESSIONS);

    public SupportPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMainTitle() {
        return driver.findElement(mainTitle);
    }

    public WebElement getAppleWorkoutTitle() {
        return driver.findElement(appleWorkoutsTitle);
    }

    public WebElement getFaceTimeTitle() {
        return driver.findElement(faceTimeTitle);
    }

    public WebElement getVirtualSessionsTitle() {
        return driver.findElement(virtualSessionsTitle);
    }
}
