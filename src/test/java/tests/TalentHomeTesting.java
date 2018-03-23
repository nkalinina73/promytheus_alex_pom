package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class TalentHomeTesting extends BaseTest {


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
        @Test// (enabled = true, priority = 1)
        public void verifyTalentsPage(){
            String title = driver.getTitle();
            System.out.println(title);
            Assert.assertTrue(title.contains("Sign In"), "The title of the home page did'not match.");
        }

        @Test (enabled = false)
        public void navigateToTalentHome () throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

            pR.talentPage.userIcon().click();
            pR.talentPage.myProfile().click();
            pR.talentPage.appLogo().click();
    }
        /*dependsOnMethods = "navigateToTalentHome" */






    }
