package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By userButton = By.xpath("//div[contains(text(),'Виталий Безпалко')]");

    public UserPage openUserPage() {
        waitFor10.until(ExpectedConditions.elementToBeClickable(driver.findElement(userButton)));
        driver.findElement(userButton).click();
        return new UserPage(driver);
    }

}
