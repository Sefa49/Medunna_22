package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US013_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US013_StepDef {
    US013_Page us013Page = new US013_Page();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Then("US{int} kullanici randevulu hastalari goruntuler")
    public void usKullaniciRandevuluHastalariGoruntuler(int arg0) {
        us013Page.myPages.click();
        us013Page.myAppointments.click();


    }

    @And("US{int} kullanici test sonuclarini goruntuler")
    public void usKullaniciTestSonuclariniGoruntuler(int arg0) {
        js.executeScript("arguments[0].click();", us013Page.testResult);

    }

    @And("US{int} kullanici test sonucunu gorur")
    public void usKullaniciTestSonucunuGorur(int arg0) {
        us013Page.viewResult.click();
        List<WebElement> tests = Driver.getDriver().findElements(By.xpath("//tr/td[2]"));
        for (WebElement w: tests) {
            System.out.println(w.getText());
            w.isDisplayed();

        }

    }
    @And("US{int} kullanici hastaya yatis talep eder")
    public void usKullaniciHastayaYatisTalepEder(int arg0) {
        us013Page.inpatient.click();

    }

    @Given("US{int} kullanici {string} anasayfasina gider")
    public void usKullaniciAnasayfasinaGider(int arg0, String arg1) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("US{int} kullanici Sign in butonuna tiklar")
    public void usKullaniciSignInButonunaTiklar(int arg0) {
        us013Page.signIn.click();
        us013Page.login.click();
    }

    @And("US{int} kullanici Username ve Password girer")
    public void usKullaniciUsernameVePasswordGirer(int arg0) {
        us013Page.username.sendKeys(ConfigReader.getProperty("drUsername"));
        us013Page.password.sendKeys(ConfigReader.getProperty("drPassword"));
    }

    @And("US{int} kullanici doktor hesabi ile giris yapar")
    public void usKullaniciDoktorHesabiIleGirisYapar(int arg0) {
        us013Page.signInGiris.click();
    }

    @And("US{int} kullanici hasta duzenleye tiklar")
    public void usKullaniciHastaDuzenleyeTiklar(int arg0) {
        us013Page.edit.click();
    }

    @And("US{int} kullanici {int} saniye bekler")
    public void usKullaniciSaniyeBekler(int arg0, int arg1) {
        ReusableMethods.waitFor(2);
    }

    @And("US{int} kullanici sayfayi kapatir")
    public void usKullaniciSayfayiKapatir(int arg0) {
        Driver.closeDriver();
    }
}
