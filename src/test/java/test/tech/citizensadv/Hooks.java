package test.tech.citizensadv;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import test.tech.citizensadv.basepage.BasePage;
import test.tech.citizensadv.propertyreader.PropertyReader;
import test.tech.citizensadv.utility.Utility;

import java.io.IOException;

public class Hooks extends BasePage {

    @Before
    public void openBrowser() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));  //getting browser from property file
        Reporter.assignAuthor("Citizens Advice", "Sweta Jani");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        closeBrowser();
    }
}
