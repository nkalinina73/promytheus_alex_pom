package resources;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.TalentHomePage;

public class PageResources {
    public LoginPage loginPage;
    public Data data;
    public RegistrationPage registrationPage;
    public TalentHomePage talentPage;



    public PageResources (WebDriver driver){
        loginPage = new LoginPage(driver);
        data = new Data(driver);
        registrationPage = new RegistrationPage(driver);
        talentPage = new TalentHomePage(driver);
    }
}
