package pages;

import org.openqa.selenium.By;

public class ProductosPage extends BasePage{
    public ProductosPage(){

        super(driver);
    }
    private String tituloProductos = "//span[@class='title']";
    private String btnAddToCard = "//button[@id='add-to-cart-sauce-labs-backpack']";

    private String btnCarrito = "//span[@class='shopping_cart_badge']";

    private String tituloCarrito = "//span[@class='title']";
    private String nombreProducto = "//div[normalize-space()='Sauce Labs Backpack']";
    private String nombreProductoEnCarro = "//div[normalize-space()='Sauce Labs Backpack']";
    private  String btnCheckOut = "//button[@id='checkout']";



    public String obtenerTituloProductos() {
        return driver.findElement(By.xpath(tituloProductos)).getText();
    }
    public String obtenerTituloCarrito() {
        return driver.findElement(By.xpath(tituloCarrito)).getText();
    }
    public String obtenerNombreDelProducto() {
        return driver.findElement(By.xpath(nombreProducto)).getText();
    }
    public String obtenerNombreDelProductoEnCarrito() {
        return driver.findElement(By.xpath(nombreProductoEnCarro)).getText();
    }
    public void clickBotonAddToCard(){
        clickElement(btnAddToCard);
    }
    public void clickBotonCarrito(){
        clickElement(btnCarrito);
    }
    public String obtenerTextoBotonCheckout() {
        return driver.findElement(By.xpath(btnCheckOut)).getText();
    }

}
