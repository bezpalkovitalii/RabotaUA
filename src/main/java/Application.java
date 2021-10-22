import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Java\\RabotaUA\\src\\main\\resources\\drivers\\chrome\\95.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        try {

            driver.get("https://rabota.ua/ua");
            driver.findElement(By.xpath("//alliance-icon[@class = 'santa-text-white ng-star-inserted']")).click();
            driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("bezpalkovitalii@gmail.com");
            driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("268v7goE");
            driver.findElement(By.xpath("//button[@type = 'submit']")).click();

            System.out.println(driver.findElement(By.xpath("//santa-error-msg[@class = 'ng-star-inserted']/p")).getText());

        } finally {

            driver.quit();
        }


    }

}
