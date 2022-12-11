package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US_25_Page;
import utilities.Driver;

public class US_25_SD {


    US_25_Page page = new US_25_Page();

    @Given("Hasta medunna url sine girer")
    public void hasta_medunna_url_sine_girer() {
        Driver.getDriver().get("https://www.medunna.com/");
    }
    @When("contact tiklar")
    public void contact_tiklar()  {

        page.contact.click();
    }
    @Then("Name bilgilerini  doldurur")
    public void name_bilgilerini_doldurur() {
        page.name.sendKeys("Ayhan Isik");
    }

    @Then("Email bilgilerini doldurur")
    public void email_bilgilerini_doldurur() {
        page.email.sendKeys("ayhanisik@gmail.com");
    }
    @Then("subject bolumu d doldurur")
    public void subject_bolumu_d_doldurur() {
        page.subject.sendKeys("randevu");
    }
    @Then("message bolumu doldurulabilir")
    public void message_bolumu_doldurulabilir() {

        page.message.sendKeys("lütfen randevumu onaylarmisiniz.");
    }

    @And("send buttonuna tiklar.")
    public void sendButtonunaTiklar()  {
        page.send.submit();

    }
}