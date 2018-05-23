package Driver;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class DriverSingleton {

    private static WebDriver driver;
    private static Wrapper wrapper;

    private DriverSingleton(){}

    public static synchronized WebDriver getWrapper() throws IOException {
        if(driver == null){
            driver =  DriverManager.getDriver();
            wrapper = new Wrapper(driver);
        }
        return wrapper;
    }

}
