package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;
import pages.PaginaPrincipal;

public class Hooks extends BasePage {
    public Hooks(){
        super(driver);
    }

    @Before
    public void hacerLoginAutomatico(Scenario scenario) {
        // Solo NO hacemos login si el tag del escenario es @login
        if (scenario.getSourceTagNames().contains("@login")) {
            return;
        }

        PaginaPrincipal home = new PaginaPrincipal();
        home.navigateToSauceDemo();
        home.loginSauceDemo("standard_user","secret_sauce");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log("El escenario fallo, captura para reporte");
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot del error");
        }
    }
}
