package com.git.qa.pages;

import com.git.qa.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //PageFactory
    @FindBy(name="name")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="commit")
    WebElement logIn;

    @FindBy(xpath = "//a[contains(text(), 'Create an account')]")
    WebElement signUp;


    //Initializing the page objects
    public LoginPage()
    {
        PageFactory.initElements(driver, this);

    }

    //Actions
    public String validateLoginPageTitle()
    {
        return driver.getTitle();
    }
    public HomePage logIn(String user,String pass)
    {
        username.sendKeys(user);
        password.sendKeys(pass);
        logIn.click();

        return new HomePage();
    }



}

