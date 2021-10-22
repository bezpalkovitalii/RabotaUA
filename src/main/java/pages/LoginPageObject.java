package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage{

    private final By enterButton = By.xpath("//alliance-icon[@class = 'santa-text-white ng-star-inserted']");
    private final By loginField = By.xpath("//input[@type = 'email']");
    private final By passwordField = By.xpath("//input[@type = 'password']");
    private final By submitButton = By.xpath("//button[@type = 'submit']");

    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        driver.findElement(enterButton).click();
        driver.findElement(loginField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
}


