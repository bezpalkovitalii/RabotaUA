package tests.UI;

import org.junit.Before;
import org.junit.Test;
import pages.HomePage;


public class LoginTest extends BaseTest {


    private HomePage homePage;

    @Before
    public void setUp() {

        homePage = new HomePage(driver);
    }

    @Test
    public void checkLogin() {

        homePage.openLoginPage()
                .login(System.getProperty("username"), System.getProperty("password"));
    }

}
