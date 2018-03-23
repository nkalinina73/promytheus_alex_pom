package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TalentHomePage extends BasePage {
    public TalentHomePage (WebDriver driver){
        this.driver = driver;
    }

    public WebElement appLogo(){
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[1]/a/div[1]/img"));
    }
    public WebElement myProfile(){
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/ul/li/div/a[1]/div/div[2]/p"));
    }
    public WebElement userIcon(){
        //html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/a/em
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/a/em"));
    }
    public WebElement buttonNew (){
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[1]/div/div/div/a"));
    }
  public WebElement categoryArrowDown(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[1]/div[1]/div/div[1]/div[1]/span/i"));
    }
      public WebElement categoryInput(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[1]/div[1]/div/div[1]/input[1]"));
    }
 public WebElement categoryComedy(){
        //return driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-1-5\"]/span"));
     return driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-0-0\"]/span"));
     //*[@id="ui-select-choices-row-0-0"]/span
    }
     public WebElement buttonNext(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[2]/button[2]"));
    }
      public WebElement talentFirstName(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[1]/div[1]/input"));
    }
      public WebElement talentLastName(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[1]/div[3]/input"));
    }
    public WebElement chooseFile(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[2]/div[1]/div[1]/div/span/button/span[2]"));
    }
    public WebElement radioButton(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[3]/div/label[3]/span"));
    }
    public WebElement address(){
        return driver.findElement(By.xpath("//*[@id=\"address\"]"));
    }
     public WebElement city(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[7]/div/input"));
    }
    public WebElement state(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[8]/div/input"));
    }
   public WebElement postalCode(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[9]/div/input"));
    }
   public WebElement quickTests(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/ol/li[9]/span"));
    }
       public WebElement buttonFinish(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[2]/button[2]"));
    }
    public WebElement comeBackLater(){
        return driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/button"));
    }
    public WebElement buttonOK(){
        return driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/button"));
    }
     public WebElement enterEmail(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[12]/div[1]/input"));
    }
    public WebElement enterPhone(){
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[12]/div[2]/input"));
    }
    public WebElement indexEmail(){
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[2]/table/tbody/tr[1]/td[6]"));
    }
     public WebElement indexPhone(){
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[2]/table/tbody/tr[1]/td[5]"));
    }
  /*  public WebElement adress(){
        return driver.findElement(By.xpath(""));
    }
    public WebElement addrss(){
        return driver.findElement(By.xpath(""));
    }*/
    /* public WebElement addres(){
        return driver.findElement(By.xpath(""));
    }
    public WebElement adress(){
        return driver.findElement(By.xpath(""));
    }
    public WebElement addrss(){
        return driver.findElement(By.xpath(""));
    }*/
   /* public WebElement appogo(){
        return driver.findElement(By.className("img-responsive"));
    }
    public WebElement appgo(){
        return driver.findElement(By.className("img-responsive"));
    }*/
    /*  public WebElement appLgo(){
        return driver.findElement(By.className("img-responsive"));
    }
    public WebElement appogo(){
        return driver.findElement(By.className("img-responsive"));
    }
    public WebElement appgo(){
        return driver.findElement(By.className("img-responsive"));
    }*/
}
