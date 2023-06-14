package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;


public class Hook  extends Config {


    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest() {
        if (Strings.isNullOrEmpty(envType)) {
            envType = "qa";
        }
        if (Strings.isNullOrEmpty(driverType)) {
            driverType = "Chrome";
        }


            //System.setProperty("webdriver.http.factory", "jdk-http-client");
            driver = setupBrowser(driverType);
            switch (envType) {
                case "qa":
                    url = "https://www.google.com/";

                    break;
            }

            driver.get(url);
        }

        @After
        public void afterEachTest (Scenario scenario){
            try {
                if (scenario.isFailed()) {
                    final byte[] screenshot = ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot, "image/png", scenario.getName()); //stick it in the report
                }

            } finally {
                //driver.quit();
            }
        }
    }



