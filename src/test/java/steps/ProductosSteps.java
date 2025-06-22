package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.PaginaPrincipal;
import pages.ProductosPage;

public class ProductosSteps {

    PaginaPrincipal homepage = new PaginaPrincipal();
    ProductosPage productos = new ProductosPage();

    @Given("Navego a saucedemo")
    public void iNavigateToSauceDemo(){
        homepage.navigateToSauceDemo();
    }
    @When("Realizo un login")
    public void realizoLoginCorrecto(){
        homepage.loginSauceDemo("standard_user","secret_sauce");
    }
    @Then("Visualizo los productos")
    public void visualizoProductos(){
        String titulo = productos.obtenerTituloProductos();
        Assert.assertEquals(titulo,"Products","No coincide el titulo esperado");
    }
}
