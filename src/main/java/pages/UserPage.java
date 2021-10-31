package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserPage extends BasePage {
    public UserPage(WebDriver driver) {
        super(driver);
    }

    private final By logOutButton = By.xpath("//span[contains(text(), 'Вийти з акаунту')]");
    private final By createCVButton = By.xpath("//*[@id=\"cdk-overlay-1\"]/santa-vertical-modal/div/div/alliance-sidebar/aside/div[3]/a/santa-button/button/span");

    public RecommendationsPage logOut() {
        waitFor10.until(ExpectedConditions.visibilityOf(driver.findElement(logOutButton)));
        driver.findElement(logOutButton).click();
        return new RecommendationsPage(driver);
    }

    public CreateCVMainInformationPage createCV(){
        //waitFor10.until(ExpectedConditions.visibilityOf(driver.findElement(createCVButton)));
        driver.findElement(createCVButton).click();
        return new CreateCVMainInformationPage(driver);
    }

}
