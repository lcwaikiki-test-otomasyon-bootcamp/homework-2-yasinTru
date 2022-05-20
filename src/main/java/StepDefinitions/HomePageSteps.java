package StepDefinitions;
import Pages.HomePage;
import util.DriverFactory;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    //driver setups
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

        //Cucumber setups

        @Given("Siteye girilir")
        public void siteyeGirilir () {

            homePage.getPage();
        }

        @When("Aksesuar kategorisine tiklanir")
        public void aksesuarKategorisineTiklanir () {
            homePage.getAccessory();
        }

        @Then("Aksesuar sayfasina yonlendirilir")
        public void aksesuarSayfasinaYonlendirilir () {
            homePage.checkAccessoryPage();
        }

        @When("Erkek butonuna tiklanir")
        public void erkekButonunaTiklanir () {
            homePage.goBoyPage();
        }

        @Then("Sayfanin acildigi gorulur")
        public void sayfaninAcildigiGorulur () {
            homePage.checkBoyPage();
        }

    }
