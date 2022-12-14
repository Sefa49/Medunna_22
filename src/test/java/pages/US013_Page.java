package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US013_Page {
    public US013_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "((//*[@class='btn btn-primary btn-sm'])[1]")
    public WebElement edit;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement testResult;

    @FindBy(xpath = "//*[@class='d-none d-md-inline']")
    public WebElement viewResult;

    @FindBy(xpath = "//*[@class='btn btn-warning btn-sm']")
    public WebElement inpatient;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signIn;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement login;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInGiris;
}