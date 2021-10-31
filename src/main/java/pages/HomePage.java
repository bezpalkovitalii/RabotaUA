package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By enterButton = By.xpath("//alliance-icon[@class = 'santa-text-white ng-star-inserted']");

    public LoginPage openLoginPage(){

        waitFor10.until(ExpectedConditions.visibilityOf(driver.findElement(enterButton)));
        driver.findElement(enterButton).click();

        return new LoginPage(driver);

    }


}
