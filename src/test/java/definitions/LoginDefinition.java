package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginDefinition {
    LoginPage loginPage;

    public LoginDefinition() {
        loginPage = new LoginPage();
    }

    @Given("estoy en la pagina de login de Sauce Demo")
    public void estoyEnLaPaginaDeLoginDeSauceDemo() {
        Hooks.driver.get("https://www.saucedemo.com/");
    }

    @When("inicio sesion como usuario estandar")
    public void inicioSesionComoUsuarioEstandar() {
        loginPage.ingresarUsuario("standard_user");
        loginPage.ingresarPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @When("inicio sesion como usuario no registrado")
    public void inicioSesionComoUsuarioNoRegistrado() {
        loginPage.ingresarUsuario("deambrose");
        loginPage.ingresarPassword("deambrose123456");
        loginPage.clickLogin();
    }

    @Then("deberia responderme con el mensaje de error {string}")
    public void deberiaRespondermeConElMensajeDeError(String messageError) {
        assertEquals(messageError, loginPage.getErrorMessage());
    }

    @When("inicio sesion como usuario bloqueado")
    public void inicioSesionComoUsuarioBloqueado() {
        loginPage.ingresarUsuario("locked_out_user");
        loginPage.ingresarPassword("secret_sauce");
        loginPage.clickLogin();
    }
}
