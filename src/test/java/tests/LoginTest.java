package tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get(pR.data.baseURL);

        pR.loginPage.loginEmail().sendKeys(pR.data.email);
        pR.loginPage.loginPsw().sendKeys(pR.data.psw);
        pR.loginPage.loginButton().click();


    }
}
