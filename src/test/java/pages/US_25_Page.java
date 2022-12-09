package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_25_Page {
  public   US_25_Page(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(linkText = "CONTACT")
    public WebElement contact;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement subject;

    @FindBy(xpath = "//*[@placeholder='Message']")
    public WebElement message;

    @FindBy(id = "register-submit")
    public WebElement send;

//  @FindBy(xpath="//*[text()='Send']")
//  public
//  WebElement sendButton;



}
