package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By enterButton = By.xpath("//alliance-icon[@class = 'santa-text-white ng-star-inserted']");
    private final By loginField = By.xpath("//input[@type = 'email']");
    private final By passwordField = By.xpath("//input[@type = 'password']");
    private final By submitButton = By.xpath("//button[@type = 'submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        waitFor10.until(ExpectedConditions.visibilityOf(driver.findElement(enterButton)));
        driver.findElement(enterButton).click();
        driver.findElement(loginField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
}


