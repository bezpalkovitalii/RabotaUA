package tests.UI;

import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

public class LogOutTest extends BaseTest {
    private HomePage homePage;

    @Before
    public void setUp() {

        homePage = new HomePage(driver);
    }

    @Test
    public void checkLogOut() {
        homePage.openLoginPage()
                .login(System.getProperty("username"), System.getProperty("password"))
                .openUserPage()
                .logOut();
    }

}
