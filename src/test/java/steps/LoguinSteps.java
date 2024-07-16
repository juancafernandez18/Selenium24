package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login.LoginPage;

public class LoguinSteps {

    LoginPage loginPage = new LoginPage();

    @When("I ingress my pass")
    public void IngresoCredenciales(){loginPage.realizoLoguin();
    }
    @Then("I click on button Acceder")
    public void clickEnBotonAcceder() {loginPage.clickEnAcceder();//
}


}
