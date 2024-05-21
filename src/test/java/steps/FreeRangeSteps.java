package steps;

import io.cucumber.java.en.*;
import pages.Login.LoginPage;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I navigate to MySysacad")
    public void iNavigateToFRT() {
        loginPage.navigateToSysacad();


    }
    @When("I take the button Acceder")
        public void clickEnBotonAcceder() {loginPage.validaBotonAcceder();//


    }


}