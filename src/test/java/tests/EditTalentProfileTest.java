package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EditTalentProfileTest extends BaseTest {

    @BeforeMethod
    public void login (){

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
    public void cleanUp () throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();
    }
    @Test
    public void  editTalentProfileTest () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        try{
            pR.talentPage.buttonEdit().click();
        }
        catch (Exception e){
            System.out.println("Element by CSS not found");
        }

        //pR.talentPage.buttonEdit().click();


    }
}
