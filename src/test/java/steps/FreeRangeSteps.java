package steps;

import io.cucumber.java.en.*;
import pages.Login.LoginPage;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I navigate to MySysacad")
    public void iNavigateToSysacad() {
        loginPage.navigateToSysacad();


    }
    @Then("I take the button Acceder")
        public void validoBotonAcceder() {loginPage.validaBotonAcceder();//



    }
    @Then("The message is Datos Invalidos")
    public void ControloDatosInvalidos(){loginPage.ValidarMensajeDeDatosErroneos();
    }





    }


