package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;

public class Hooks {

    @After
    public void afterScenario() throws Exception{
        TestRunner.getDriver().findElement((By.cssSelector("div[aria-label='Account']"))).click();
        TestRunner.getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
    }
}
