package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.PaginaPrincipal;
import pages.ProductosPage;

public class MenuBurguerSteps {
    ProductosPage menu = new ProductosPage();
    PaginaPrincipal homepage = new PaginaPrincipal();

    @Given("Navego")
    public void iNavigateToSauceDemo(){
        homepage.navigateToSauceDemo();
    }
    @When("login")
    public void realizoLoginCorrecto(){
        homepage.loginSauceDemo("standard_user","secret_sauce");
    }
    @And("hace click en menu hamburguesa")
    public void haceClickEnMenuBurger(){
        menu.clickEnMenuBurger();
    }
    @Then("visualiza el dropdown de opciones")
    public void visualizaDropDown(){
        Integer cantElementos = menu.cantidadDeItemsMenuBurger();
        Assert.assertEquals(cantElementos,3);// dejo en 3 para que falle

    }
}
