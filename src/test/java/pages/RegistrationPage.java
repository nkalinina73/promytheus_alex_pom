package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement buttonRegisterNow(){
        return driver.findElement(By.xpath("/html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/a"));
    }
    public WebElement firstName(){
        return driver.findElement(By.xpath("//*[@id=\"signUpFirstName\"]"));
    }
    public WebElement lastName(){
        return driver.findElement(By.name("lastName"));
    }
    public WebElement userEmail(){
        return driver.findElement(By.xpath("//*[@id=\"signUpRegisterEmail\"]"));
    }
    public WebElement userPhone(){
        return driver.findElement(By.xpath("//*[@id=\"signUpPhone\"]"));
    }
    public WebElement dropDownArrow(){
        return driver.findElement(By.xpath("//*[@id=\"signUpCountry\"]/span/i"));
    }
   public WebElement tfieldCoutry(){
        return driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[1]/div/div/input[1]"));
    }
     public WebElement tfieldCountry2(){
        return driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[1]/div/div/input[1]"));
    }
    public WebElement address(){
        return driver.findElement(By.xpath("//*[@id=\"signUpAddress\"]"));
    }
   /*  public WebElement firstName(){
        return driver.findElement(By.xpath("//*[@id=\"signUpFirstName\"]"));
    }
    public WebElement loginButton(){
        return driver.findElement(By.name("lastName"));
    }*/
   /*  public WebElement firstName(){
        return driver.findElement(By.xpath("//*[@id=\"signUpFirstName\"]"));
    }
    public WebElement loginButton(){
        return driver.findElement(By.name("lastName"));
    }*/
}
