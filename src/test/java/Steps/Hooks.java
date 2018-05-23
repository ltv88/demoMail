package Steps;

import Driver.DriverSingleton;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {

    private WebDriver driver;

    public Hooks() {
    }

    @Before
    public void before() throws IOException {
        driver = DriverSingleton.getWrapper();
        driver.get("www.i.ua");
    }
}
