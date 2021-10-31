package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCVDesiredPositionPage extends BasePage{
    public CreateCVDesiredPositionPage(WebDriver driver) {
        super(driver);
    }

    private final By fieldWantedPosition = By.xpath("//input[@id='wanted_position_field']");
    private final By nextStepButton = By.xpath("//body/form[@id='aspnetForm']/div[@id='wizard_mount']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]");


    public WorkExperiencePage fillWantedPosition(String position){
        driver.findElement(fieldWantedPosition).sendKeys(position);
        driver.findElement(nextStepButton).click();
        return new WorkExperiencePage(driver);

    }

}
