package Driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.IOException;


public class DriverManager {

    public static WebDriver getDriver() throws IOException {
        WebDriver res = null;
        String browser = "chrome";
        switch (browser){
            case "chrome":
                res = initChrome();
                break;
            case "safari":
                res = initFirefox();

        }
        return res;
    }

    public static WebDriver initChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\88lit\\IdeaProjects\\demo_mail_iua\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFirefox(){
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
