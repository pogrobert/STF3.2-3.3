package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.BasePage;
import pages.StorePage;
import pages.HomePage;
import pages.SupportPage;
import constants.urls.Urls;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected StorePage storePage;
    protected SupportPage supportPage;

    @BeforeSuite
    @Parameters("browser")
    public void setUp(String browser) throws MalformedURLException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);

        driver = new RemoteWebDriver(new URL("http://localhost:4444/"), caps);

//        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(Urls.HOME_URL);

        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        storePage = new StorePage(driver);
        supportPage = new SupportPage(driver);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void afterTest(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try {
                Files.move(Paths.get(screenshot.getPath()), Paths.get("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
//            basePage.getHomeButton().click();
        }
    }
}
