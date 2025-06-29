package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.PaginaPrincipal;
import pages.ProductosPage;

public class ProductosSteps {

    PaginaPrincipal homepage = new PaginaPrincipal();
    ProductosPage productos = new ProductosPage();
    String nombreproducto;


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
    @When("agrega un producto al carrito de compras")
    public void agregaProductoAlCarrito(){
        nombreproducto = productos.obtenerNombreDelProducto();
        productos.clickBotonAddToCard();

    }
    @And("hace click en el carro de compras")
    public void verCarroDeCompras(){
        productos.clickBotonCarrito();
    }
    @Then("visualiza sus productos agregados")
    public void visualizaLosProdEnCarro(){
        String tituloCarro = productos.obtenerTituloCarrito();
        Assert.assertEquals(tituloCarro,"Your Cart","No coincide con el titulo esperado");
        String nombreProductoEnCarro = productos.obtenerNombreDelProductoEnCarrito();
        Assert.assertEquals(nombreproducto,nombreProductoEnCarro,"No coincide el nombre del producto elegido ");

    }

}
