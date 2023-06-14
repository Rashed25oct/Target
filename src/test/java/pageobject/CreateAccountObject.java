package pageobject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateAccountObject extends Config {
    public CreateAccountObject(WebDriver driver) {
        PageFactory.initElements(driver, this);//to init the web element
        Config.driver=driver;
    }

public void homepage(){

        String act = driver.getTitle();
        String exp ="Target : Expect More. Pay Less.";
    Assert.assertEquals(exp, act);
    System.out.println(act);





}



}
