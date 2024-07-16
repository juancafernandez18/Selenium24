package pages;

import org.testng.Assert;

import java.util.Set;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='%s' and @href]";

    private String botonConfirmar = "//button[normalize-space()='CONTINUAR']";

    private String backendmessage = "//div[@class='backendmessage message-error']";

    private String botonAceptarNotif = "//button[normalize-space()='ACEPTAR']";

    private String mensajeModalNotificaciones = "//span[contains(text(),'Para poder realizar tus operaciones, activá las no')]";

    private String mensajeModalOlvideCredenciales = "//span[contains(text(),'Para recuperarlas, desde la App del BanCo, ingresá')]";

    private String botonOlvideMisCredenciales = "//p[@class='forgot-text margin-top']";


    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a www.freerangetesters.com


    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }
    public void navigateToBancoCtes() {
        navigateTo("https://bancaweb.bcoctes.com.ar/Corrientes/login");


    }
    public void validarMensajeBackend(){
        Assert.assertTrue(backendmessage.contains("Completa la información solicitada para ingresar"));

    }

    public void clickEnBotonContinuar(){
        clickElement(botonConfirmar);

    }
    public void clickAceptarNotificaciones(){
        clickElement(botonAceptarNotif);
    }

    public void verificarTextoModalNotif(){
        Assert.assertTrue(mensajeModalNotificaciones.contains("Para poder realizar tus operaciones, activá las notificaciones de tu navegador."));
    }
    public void verificarTextoModalOlvidoCred(){
        Assert.assertTrue(mensajeModalOlvideCredenciales.contains("Para recuperarlas, desde la App del BanCo"));
    }
    public void clickEnBotonOlvideCredenciales(){
        clickElement(botonOlvideMisCredenciales);
    }

}