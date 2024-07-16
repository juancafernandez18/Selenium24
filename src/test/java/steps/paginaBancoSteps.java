package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Login.LoginPage;
import pages.PaginaPrincipal;

import java.time.Duration;
import java.util.Set;

import static java.lang.Thread.sleep;

public class paginaBancoSteps {
    PaginaPrincipal homepage = new PaginaPrincipal();

    @Given("el usuario navega a la pagina")
    public void iNavigateToBancoCtes() {
        homepage.navigateToBancoCtes();
        //homepage.clickAceptarNotificaciones();

    }
    @When("hace click en el boton continuar")
    public void clickEnBancaWeb() {
        homepage.clickAceptarNotificaciones();

        homepage.clickEnBotonContinuar();

    }
    @When("hace click en el boton he olvidado mis credenciales")
    public void clickEnOlvideMisCredenciales() {


        homepage.clickEnBotonOlvideCredenciales();

    }
    @Then("se muestra el mensaje de completar informacion")
    public void validarMensaje(){
        homepage.validarMensajeBackend();

    }
    @Then("se muestra la ventana modal")
    public void validarVentanaModal(){
        homepage.verificarTextoModalOlvidoCred();

    }





}
