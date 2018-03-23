package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement loginEmail(){
        return driver.findElement(By.name("email"));
    }
    public WebElement loginPsw(){
        return driver.findElement(By.name("password"));
    }
    public WebElement loginButton(){
        return driver.findElement(By.id("login"));
    }
    /*By email = By.xpath("//div/input[@name='email']");
    By password = By.name("password");
    By forgotPassword = By.xpath("//div/a[@class='text-muted']");
    By loginButton = By.id("login");
    By registerNowButton = By.className("btn btn-block btn-default");
*/

}
