package pages.Login;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.BasePage;

public class LoginPage extends BasePage {

    public  LoginPage() {
        super(driver);
    }

    String botonAcceder = "//input[@id='login_form_submit']";

    String inputContrasenia = "//input[@id='password']";

    String inputLegajo = "//input[@id='username']";

    String mensajedatosErroneos = "//strong[contains(text(),'Usuario o contraseña invalidos, Porfavor intentelo')]";


    public void navigateToSysacad() {
        navigateTo("https://sysacadweb.frre.utn.edu.ar/");


    }

    public void validaBotonAcceder() {
       // Assert.assertTrue(botonAcceder.contains("Acceder"));

        clickElement(botonAcceder);

    }
    public void ValidarMensajeDeDatosErroneos() {
        Assert.assertTrue(mensajedatosErroneos.contains("Usuario o contraseña invalidos"));



    }
    public void realizoLoguin() {
        write(inputLegajo,"19878");
        clickElement(inputLegajo);

        write(inputContrasenia,"Juanca1000");
        clickElement(inputContrasenia);




    }

    public void clickEnAcceder() {
        Assert.assertTrue(botonAcceder.contains("Acceder"));

        clickElement(botonAcceder);

    }






}
