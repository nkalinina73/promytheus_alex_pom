package tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends BaseTest {

    @Test
    public void registrationPage () throws InterruptedException {

        driver.get(pR.data.baseURL);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        Thread.sleep(4000);
        pR.registrationPage.buttonRegisterNow().click();
        pR.registrationPage.firstName().sendKeys("Cindy");
        pR.registrationPage.lastName().sendKeys("G");
        pR.registrationPage.userEmail().sendKeys("pudo@emailure.net");
        pR.registrationPage.userPhone().sendKeys("658987123");
        pR.registrationPage.dropDownArrow().click();
        pR.registrationPage.tfieldCoutry().sendKeys("Australia");
        pR.registrationPage.tfieldCoutry().click();
        pR.registrationPage.address().sendKeys("oehg");
    }
}
