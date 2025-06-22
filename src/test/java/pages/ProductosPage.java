package pages;

import org.openqa.selenium.By;

public class ProductosPage extends BasePage{
    public ProductosPage(){

        super(driver);
    }
    private String tituloProductos = "//span[@class='title']";

    public String obtenerTituloProductos() {
        return driver.findElement(By.xpath(tituloProductos)).getText();
    }
}
