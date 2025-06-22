package pages;

import org.openqa.selenium.By;

public class PaginaPrincipal extends BasePage {

    private String inputUser = "//input[@id='user-name']";
    private String inputPassword = "//input[@id='password']";
    private String loginButton = "//input[@id='login-button']";
    private String msgLoginError = "//h3[@data-test='error']";


    public PaginaPrincipal(){

        super(driver);
    }
    public void navigateToSauceDemo(){
        navigateTo("https://www.saucedemo.com/");
    }
    public  void clickLoginBoton(){
        clickElement(loginButton);
    }
    public void loginSauceDemo(String user,String password){
        write(inputUser,user);
        write(inputPassword,password);
        clickElement(loginButton);
    }
    public String obtenerMensajeDeError() {
        return driver.findElement(By.xpath(msgLoginError)).getText();
    }

}
