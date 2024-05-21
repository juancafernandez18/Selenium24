package pages.Login;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.BasePage;

public class LoginPage extends BasePage {

    public  LoginPage() {
        super(driver);
    }

    String botonAcceder = "//input[@id='login_form_submit']";
    String inputContrasenia = "//input[@placeholder='Contrase\u00F1a']";


    public void navigateToSysacad() {
        navigateTo("https://sysacadweb.frre.utn.edu.ar/");


    }

    public void validaBotonAcceder() {
        //Assert.assertTrue("Acceder".contains(botonAcceder));
        clickElement(botonAcceder);

    }





}
