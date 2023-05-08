package core.elements;

import core.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageElements {
    public RegisterPageElements(){

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    //Register Page  Web Elements
    @FindBy(css = "a[href='/register?returnUrl=%2F']")
    public  WebElement registerButton;

    @FindBy(css = "button[name='register-button']")
    public WebElement registerButtonForm;

    @FindBy(css = "input[id='FirstName']")
    public  WebElement firstNameInput;

    @FindBy(css = "input[id='LastName']")
    public  WebElement lastNameInput;

    @FindBy(css = "input[id='Email']")
    public  WebElement emailInput;

    @FindBy(css = "input[id='Password']")
    public  WebElement password;

    @FindBy(css = "input[id='ConfirmPassword']")
    public  WebElement confirmPassword;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    public  WebElement verifyRegistration;

}
