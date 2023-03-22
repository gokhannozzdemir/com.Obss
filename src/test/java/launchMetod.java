import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchMetod extends Test1{
    static WebDriver driver;

    @BeforeClass
    public static void setupBrowser(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Ignore //Pass now!!
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
