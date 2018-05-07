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
    public WebElement city(){
        return driver.findElement(By.xpath("//*[@id=\"signUpCity\"]"));
    }
    public WebElement state(){
        return driver.findElement(By.xpath("//*[@id=\"signUpState\"]"));
    }
    public WebElement postalCode(){
        return driver.findElement(By.xpath("//*[@id=\"signUpZip\"]"));
    }
    public WebElement newPsw(){
        return driver.findElement(By.xpath("//*[@id=\"signUpRegisterPassword\"]"));
    }

     public WebElement retypePsw(){
        return driver.findElement(By.xpath("//*[@id=\"signUpRegisterRePassword\"]"));
    }

    public WebElement checkBox(){
        ////*[@id="registerForm"]/div[3]/label/span
        return driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[3]/label"));
}
     public WebElement buttonCreate(){
        return driver.findElement(By.xpath("//*[@id=\"createAccount\"]"));
    }
      public WebElement OK(){
        //html/body/div[2]/div[7]/div/button
        return driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/button"));
    }

    public WebElement clickOnEmail(){
        //*[@id="row_1522786457-200010832389-promy3"]/div/div[4]
        return driver.findElement(By.cssSelector(".all_message-min_text"));
    }
    public WebElement linkToActivate(){
        return driver.findElement(By.linkText("Please click here"));
    }
   /*  public WebElement firstName(){
        return driver.findElement(By.xpath(""));
    }*/
     /*  public WebElement firstName(){
        return driver.findElement(By.xpath(""));
    }*/
   /*  public WebElement firstName(){
        return driver.findElement(By.xpath(""));
    }*/
   /*  public WebElement firstName(){
        return driver.findElement(By.xpath(""));
    }*/
     /*  public WebElement firstName(){
        return driver.findElement(By.xpath(""));
    }*/
   /*  public WebElement firstName(){
        return driver.findElement(By.xpath(""));
    }*/
   /*  public WebElement firstName(){
        return driver.findElement(By.xpath(""));
    }*/

   /*  public WebElement firstName(){
        return driver.findElement(By.xpath("//*[@id=\"signUpFirstName\"]"));
    }
    public WebElement loginButton(){
        return driver.findElement(By.name("lastName"));
    }*/
}
