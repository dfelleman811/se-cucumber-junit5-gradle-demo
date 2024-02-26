package com.revature.runners;

import com.revature.pages.GoogleHomePage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/com/revature/features", glue = "com.revature.steps")
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // using the src/test/resources/features
public class GoogleRunner {

    public static WebDriver driver;
    public static GoogleHomePage googleHomePage;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        googleHomePage = new GoogleHomePage(driver);
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
