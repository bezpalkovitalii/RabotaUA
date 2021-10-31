package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserPage extends BasePage {
    public UserPage(WebDriver driver) {
        super(driver);
    }

    private final By logOutButton = By.xpath("//span[contains(text(), 'Вийти з акаунту')]");
    private final By createCVButton = By.xpath("//body/div[1]/div[3]/div[1]/santa-vertical-modal[1]/div[1]/div[1]/alliance-sidebar[1]/aside[1]/div[3]/a[1]/santa-button[1]/button[1]/span[1]");

    public RecommendationsPage logOut() {
        driver.findElement(logOutButton).click();
        return new RecommendationsPage(driver);
    }

    public CreateCVMainInformationPage createCV() {
        waitFor10.until(ExpectedConditions.elementToBeClickable(driver.findElement(createCVButton)));
        driver.findElement(createCVButton).click();
        return new CreateCVMainInformationPage(driver);
    }

}
