package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

@CucumberOptions(
        features = {"src/main/java/features"},
        glue = {"StepDefinitions"}


)


public class runner extends AbstractTestNGCucumberTests {
        static WebDriver driver = DriverFactory.getDriver();

        public static WebDriver getDriver()
        {
                return driver;
        }
}
