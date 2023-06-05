import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Youtube {
    @Test
    public void findVideo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://youtube.com");
        WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"search\"]"));
        searchBox.click();
        searchBox.sendKeys("xiaomi s10t robot süpürge"+ Keys.ENTER);
        driver.findElement(By.xpath("//a[@title=\"Xiaomi Robot Vacuum S10T | En güçlü Robot Süpürge 8000 PA | Most Powerful Robot Vacuum of 2023\"]")).click();

    }
    @Test
    public void findVideo2() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://youtube.com");
        WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"search\"]"));
        searchBox.click();
        searchBox.sendKeys("xiaomi s10t robot süpürge"+ Keys.ENTER);
        driver.findElement(By.xpath("//a[@title=\"Xiaomi Robot Vacuum S10T | En güçlü Robot Süpürge 8000 PA | Most Powerful Robot Vacuum of 2023\"]")).click();

    }

    @Test
    public void findVideo3() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://youtube.com");
        WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"search\"]"));
        searchBox.click();
        searchBox.sendKeys("xiaomi s10t robot süpürge"+ Keys.ENTER);
        driver.findElement(By.xpath("//a[@title=\"Xiaomi Robot Vacuum S10T | En güçlü Robot Süpürge 8000 PA | Most Powerful Robot Vacuum of 2023\"]")).click();

    }

}
