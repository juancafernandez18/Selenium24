package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.PaginaPrincipal;
import pages.ProductosPage;

public class LoginSteps {

    PaginaPrincipal homepage = new PaginaPrincipal();
    ProductosPage productos = new ProductosPage();

    @Given("Navego a saucedemo.com")
    public void iNavigateToSauceDemo(){

        homepage.navigateToSauceDemo();
    }
    @When("Realizo un login correcto")
    public void realizaLogin(){

        homepage.loginSauceDemo("standard_user","secret_sauce");
    }
    @Then("Visualizo la pagina de productos")
    public void visualizoLosProductos(){

        String titulo = productos.obtenerTituloProductos();
        Assert.assertEquals(titulo,"Products","No coincide el titulo esperado");
    }

    @When("el usuario ingresa un dato incorrecto")
    public void elUsuarioIngresaDatosIncorrectos(){
        //homepage.navigateToSauceDemo();
        homepage.loginSauceDemo("juan","contraseña");
    }

    @Then("se muestra el mensaje de error")
    public void seMuestraElError(){
        String msjerror = homepage.obtenerMensajeDeError();
        Assert.assertEquals(msjerror,"Epic sadface: Username and password do not match any user in this service","No coincide el mensaje esperado");
    }


}
