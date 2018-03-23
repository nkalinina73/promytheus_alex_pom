package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class VerifyContactInformation extends BaseTest {

    @BeforeMethod
    public void loginTest () throws InterruptedException {

        driver.get(pR.data.baseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        if (driver.findElement(By.cssSelector(".load-spinner.line-scale-pulse-out")).isDisplayed()) {
            driver.navigate().refresh();
        }
        // Thread.sleep(1000);
        pR.loginPage.loginEmail().sendKeys(pR.data.email);
        pR.loginPage.loginPsw().sendKeys(pR.data.psw);
        pR.loginPage.loginButton().click();
    }
    @AfterMethod
    public void cleanUp () {
        //driver.close();
    }
    @Test
    public void verifyContactInformation () throws InterruptedException, AWTException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        pR.talentPage.buttonNew().click();
        Thread.sleep(2000);
        pR.talentPage.categoryArrowDown().click();
        pR.talentPage.categoryInput().sendKeys("Comedy");
        pR.talentPage.categoryComedy().click();
        Thread.sleep(2000);
        pR.talentPage.buttonNext().click();
        //driver.findElement(talentFirstName).sendKeys(new Faker().name().firstName());
        pR.talentPage.talentFirstName().sendKeys("Lusie");
        pR.talentPage.talentLastName().sendKeys("Johnson");

        Thread.sleep(2000);
        pR.talentPage.address().sendKeys("Street");
        pR.talentPage.city().sendKeys("SF");
        pR.talentPage.state().sendKeys("CA");
        pR.talentPage.postalCode().sendKeys("98745");
        //entering contact information
        pR.talentPage.enterEmail().sendKeys("nk@live.com");
        pR.talentPage.enterPhone().sendKeys("111-222-3333");
        Thread.sleep(2000);
        pR.talentPage.quickTests().click();
        Thread.sleep(2000);
        pR.talentPage.buttonFinish().click();
        Thread.sleep(2000);
        pR.talentPage.comeBackLater().click();
        Thread.sleep(3000);
        pR.talentPage.buttonOK();
        //verifying contact information
        String email = pR.talentPage.indexEmail().getText();
        System.out.println(email);
        Assert.assertTrue(email.contains("nk@live.com"),"The contact email is wrong");
        String phone = pR.talentPage.indexPhone().getText();
        System.out.println(phone);
        Assert.assertTrue(phone.contains("111-222-3333"), "The phone does not match");


    }
}
