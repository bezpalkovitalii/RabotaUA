package tests.UI;

import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

public class CreateCVTest extends BaseTest{

    private HomePage homePage;

    @Before
    public void setUp() {

        homePage = new HomePage(driver);
    }

    @Test
    public void checkCreateCV() {
        homePage.openLoginPage()
                .login(System.getProperty("username"), System.getProperty("password"))
                .openUserPage()
                .createCV()
                .inputMainInformation("Иван", "Иванов")
                .inputPhoneNumber("636385322");
    }

}
