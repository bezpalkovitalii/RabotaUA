package tests.UI;

import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest {


    private LoginPage loginPage;

    @Before
    public void setUp() {

        loginPage = new LoginPage(driver);
    }

    @Test
    public void checkLogin() {

        loginPage.login(System.getProperty("username"), System.getProperty("password"));
    }


}
