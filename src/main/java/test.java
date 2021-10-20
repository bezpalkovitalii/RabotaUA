import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Java\\RabotaUA\\src\\main\\resources\\drivers\\chrome\\95.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://rabota.ua/ua");
        driver.findElement(By.xpath("//alliance-icon[@class = 'santa-text-white ng-star-inserted']")).click();

        driver.quit();

    }

}
