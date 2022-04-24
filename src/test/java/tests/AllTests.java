package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import constants.messages.*;

import static org.testng.Assert.assertEquals;

public class AllTests extends BaseTest {
    @Test
    public void allPages() {
        WebElement homeShopText = homePage.getShopTitle();
        assertEquals(homeShopText.getText(), HomePageMessages.SHOP_MESSAGE);
        basePage.getStoreButton().click();

        WebElement storeMainTitle = storePage.getMainTitle();
        assertEquals(storeMainTitle.getText(), StoreMessages.MAIN_MESSAGE);
        basePage.getSupportButton().click();

        WebElement supportMainTitle = supportPage.getMainTitle();
        assertEquals(supportMainTitle.getText(), SupportMessages.MAIN_MESSAGE);
    }

    @Test
    public void homeAndSupport() {
        WebElement homeServices = homePage.getServicesTitle();
        assertEquals(homeServices.getText(), HomePageMessages.SERVICES_MESSAGE);
        basePage.getSupportButton().click();

        WebElement appleWorkout = supportPage.getAppleWorkoutTitle();
        assertEquals(appleWorkout.getText(), SupportMessages.APPLE_WATCH_MESSAGE);
    }

    @Test
    public void homeAndStore() {
        WebElement homeAccount = homePage.getAccountTitle();
        assertEquals(homeAccount.getText(), HomePageMessages.ACCOUNT_MESSAGE);
        basePage.getStoreButton().click();

        WebElement storeLatest = storePage.getLatestTitle();
        assertEquals(storeLatest.getText(), StoreMessages.THE_LATEST_MESSAGE);
    }

    @Test
    public void storeAndSupport() {
        basePage.getStoreButton().click();
        WebElement storeDifferences = storePage.getDifferenceNumber();
        WebElement storeHelp = storePage.getHelpTitle();
        assertEquals(storeDifferences.getText(), StoreMessages.THE_APPLE_DIFFERENCE_MESSAGE);
        assertEquals(storeHelp.getText(), StoreMessages.HELP_IS_HERE_MESSAGE);


        basePage.getSupportButton().click();
        WebElement supportSessions = supportPage.getVirtualSessionsTitle();
        WebElement supportFaceTime = supportPage.getFaceTimeTitle();
        assertEquals(supportSessions.getText(), SupportMessages.VIRTUAL_SESSIONS_MESSAGE);
        assertEquals(supportFaceTime.getText(), SupportMessages.FACE_TIME_MESSAGE);
    }
}
