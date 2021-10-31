package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCVMainInformationPage extends BasePage {


    public CreateCVMainInformationPage(WebDriver driver) {
        super(driver);
    }

    private final By fieldFirstName = By.xpath("//input[@id = 'firstname_field']");
    private final By fieldLastName = By.xpath("//input[@id = 'lastname_field']");
    private final By fieldPhoneNumber = By.xpath("//input[@id = 'phone_field']");

    public CreateCVMainInformationPage inputMainInformation(String firstName, String lastName){
        driver.findElement(fieldFirstName).sendKeys(firstName);
        driver.findElement(fieldLastName).sendKeys(lastName);
        return this;
    }

    public CreateCVMainInformationPage inputPhoneNumber(String phoneNumber){
        driver.findElement(fieldPhoneNumber).sendKeys(phoneNumber);
        return this;
    }



}
