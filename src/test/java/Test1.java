import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.concurrent.TimeUnit;
public class Test1 {

    static WebDriver driver;

    @Test
    public void navigate(){
        driver.navigate().to("https://www.obss.tech");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

    }

    @Test
    public void cookie(){
        WebElement cookie = driver.findElement(By.xpath("//*[text()='Accept All Cookies']"));
        cookie.click();

    }
    @Test
    public void searchBox(){
        WebElement searchBtn = driver.findElement(By.xpath("//img[@id='search-icon']"));
        searchBtn.click();
        searchBtn.sendKeys("Automation");
        searchBtn.submit();
    }
    @Test
    public void testingAutomation(){
        WebElement testingAutomation = driver.findElement(By.xpath("//a[@href='https://obss.tech/en/yetkinlikler/yetenekler/yazilim-testi-otomasyonu/']"));
        testingAutomation.click();
    }
    @Ignore
    public void cookie_2(){
        WebElement cookie = driver.findElement(By.xpath("//*[text()='Accept All Cookies']"));
        cookie.click();
    }
    @Test
    public void scrollPage(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Test
    public void verifyOBSS(){
        WebElement imageVerify = driver.findElement(By.xpath("//img[@src='https://obss.tech/wp-content/themes/obss/assets/images/svg/colorful-logo.svg']"));
        String actual = imageVerify.getText();
        String expected = "https://obss.tech/wp-content/themes/obss/assets/images/svg/colorful-logo.svg";
        Assert.assertEquals(expected,actual);
    }





}
