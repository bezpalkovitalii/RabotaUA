package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    private final By loginField = By.xpath("//input[@type = 'email']");
    private final By passwordField = By.xpath("//input[@type = 'password']");
    private final By submitButton = By.xpath("//button[@type = 'submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage login(String email, String password) {

        driver.findElement(loginField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();

        return new MainPage(driver);
    }
}


