package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateCVMainInformationPage extends BasePage {


    public CreateCVMainInformationPage(WebDriver driver) {
        super(driver);
    }

    private final By fieldFirstName = By.xpath("//input[@id = 'firstname_field']");
    private final By fieldLastName = By.xpath("//input[@id = 'lastname_field']");
    private final By fieldPhoneNumber = By.xpath("//input[@id = 'phone_field']");
    private final By fieldCity = By.xpath("//label[@for = 'city_field_main']");
    private final By selectCity = By.xpath("//*[@id='ui-id-11825']");
    private final By fieldDay = By.xpath("//input[@id = 'birth_day_field']");
    private final By fieldMonth = By.xpath("//select[@id = 'birth_month_field']");
    private final By selectMonth = By.xpath("//*[@id='birth_month_field']/option[5]");
    private final By fieldYear = By.xpath("//label[@for = 'birth_year_field']");



    public CreateCVMainInformationPage inputMainInformation(String firstName, String lastName) {

        waitFor10.until(ExpectedConditions.visibilityOf(driver.findElement(fieldFirstName)));
        driver.findElement(fieldFirstName).sendKeys(firstName);
        driver.findElement(fieldLastName).sendKeys(lastName);
        return this;
    }

    public CreateCVMainInformationPage inputPhoneNumber(String phoneNumber) {
        driver.findElement(fieldPhoneNumber).sendKeys(phoneNumber);
        return this;
    }

    public CreateCVMainInformationPage citySelection (){
        driver.findElement(fieldCity).click();
        driver.findElement(selectCity).click();
        return this;
    }

    public CreateCVMainInformationPage inputDayOfBirth(String day, String year){
        driver.findElement(fieldDay).sendKeys(day);
        driver.findElement(fieldMonth).click();
        driver.findElement(selectMonth).click();
        driver.findElement(fieldYear).sendKeys(year);

        return this;

    }


}
