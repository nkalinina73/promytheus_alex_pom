package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends BaseTest {

    @Test
    public void registrationPage () throws InterruptedException {

        driver.get(pR.data.baseURL);

        /*if (driver.findElement(By.cssSelector(".load-spinner.line-scale-pulse-out")).isDisplayed()) {
            driver.navigate().refresh();
        }*/

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        if (driver.findElement(By.xpath("/html/body/app/splash-screen/div/div/div")).isDisplayed()){
            driver.navigate().refresh();
        }
        Thread.sleep(2000);
        pR.registrationPage.buttonRegisterNow().click();
        pR.registrationPage.firstName().sendKeys("Cindy");
        pR.registrationPage.lastName().sendKeys("G");
        pR.registrationPage.userEmail().sendKeys("promy7@mailinator.com");
        pR.registrationPage.userPhone().sendKeys("6581987123");
        pR.registrationPage.dropDownArrow().click();
        pR.registrationPage.tfieldCoutry().sendKeys("Australia");
        pR.registrationPage.tfieldCoutry().click();
        pR.registrationPage.address().sendKeys("Street");
        pR.registrationPage.city().sendKeys("MV");
        pR.registrationPage.state().sendKeys("CA");
        pR.registrationPage.postalCode().sendKeys("78945");
        pR.registrationPage.newPsw().sendKeys("qwe123");
        pR.registrationPage.retypePsw().sendKeys("qwe123");
        pR.registrationPage.checkBox().click();
        pR.registrationPage.buttonCreate().click();
        Thread.sleep(2000);
        pR.registrationPage.OK().click();

        driver.get(pR.data.emailURL);
        pR.registrationPage.clickOnEmail().click();
        driver.switchTo().frame("msg_body");
        Thread.sleep(2000);
        pR.registrationPage.linkToActivate().click();

        driver.get(pR.data.baseURL);

        pR.loginPage.loginEmail().sendKeys(pR.data.email2);
        pR.loginPage.loginPsw().sendKeys(pR.data.psw);
        pR.loginPage.loginButton().click();


    }
}
