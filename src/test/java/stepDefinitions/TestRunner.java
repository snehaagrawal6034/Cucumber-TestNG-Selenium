package stepDefinitions;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import java.util.concurrent.TimeUnit;


@CucumberOptions(
        features = "src/test/resources/Features",
//        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary"},
        glue = {"stepDefinitions"},
//        tags = {"@test"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},
        plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner extends AbstractTestNGCucumberTests {

    private static WebDriver driver;
    @BeforeSuite
    public void setup() throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void close_the_browser() {
        driver.quit();
        driver = null;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}