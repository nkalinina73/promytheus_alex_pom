package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class CreateNewTalent_New_Test extends BaseTest {

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
    @Test(enabled = true)
    public void createNewTalentProfile () throws InterruptedException, AWTException {
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
        pR.talentPage.talentFirstName().sendKeys(new Faker().name().firstName());
        pR.talentPage.talentLastName().sendKeys(new Faker().name().lastName());
        pR.talentPage.chooseFile().click();
        //creating object of the Robot class
        Robot robot = new Robot();
        robot.setAutoDelay(2000);

        StringSelection sSelection = new StringSelection("C:\\Users\\Natalia\\Pictures\\cat.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sSelection, null);
        robot.setAutoDelay(2000);
        //sending the path to image
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        //release the key
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.setAutoDelay(2000);
        //pressing Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        pR.talentPage.radioButton().click();
        pR.talentPage.address().sendKeys(new Faker().address().streetAddress());
        pR.talentPage.city().sendKeys(new Faker().address().city());
        pR.talentPage.state().sendKeys(new Faker().address().state());
        pR.talentPage.postalCode().sendKeys(new Faker().address().zipCode());
        Thread.sleep(2000);
        pR.talentPage.quickTests().click();
        Thread.sleep(2000);
        pR.talentPage.buttonFinish().click();
        Thread.sleep(2000);
        pR.talentPage.comeBackLater().click();
        Thread.sleep(3000);
        pR.talentPage.buttonOK();

    }

}
