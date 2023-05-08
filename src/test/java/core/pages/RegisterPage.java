package core.pages;


import core.elements.RegisterPageElements;
import core.globals.Globals;
import core.utilities.BaseInformation;
import core.utilities.BasePageObject;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    RegisterPageElements registerPageElements =  new RegisterPageElements();

    public RegisterPage(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void getUrl(String url){
        BaseInformation.getDriver().get(url);
    }
    public void clickRegisterButton(){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(registerPageElements.registerButton)
                .click();
    }

    public void setFirstName(String firstName){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(registerPageElements.firstNameInput)
                .sendKeys(firstName);
    }

    public void setLastName(String lastName){
        basePageObject
                .getWebElementUtils()
                .sendKeysToElementWithWait(registerPageElements.lastNameInput,lastName,2);
    }

    public void setEmail(String email){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(registerPageElements.emailInput)
                .sendKeys(email+Math.random()+"@gmail.com");
    }

    public void setPassword(){
        registerPageElements.password.sendKeys(Globals.password);

    }

    public void setConfirmPassword(){
        registerPageElements.confirmPassword.sendKeys(Globals.confirmPassword);
    }

    public void clickRegisterButtonForm(){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(registerPageElements.registerButtonForm)
                .click();
    }

    public boolean checkRegister(){
        return registerPageElements.verifyRegistration.isDisplayed();
    }
}
