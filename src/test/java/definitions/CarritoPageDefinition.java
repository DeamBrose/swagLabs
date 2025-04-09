package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarritoPage;

import static org.junit.Assert.assertTrue;

public class CarritoPageDefinition {

    CarritoPage carritoPage;

    public CarritoPageDefinition(){
        carritoPage = new CarritoPage();
    }


    @Then("verifico que en la pagina de carrito de compra se visualice los productos agregados")
    public void verificoQueEnLaPaginaDeCarritoDeCompraSeVisualiceLosProductosAgregados() {
        assertTrue("Se esperaba más de un producto", carritoPage.validarListaDeCarrito());
    }

    @When("continuo con el proceso de checkout")
    public void continuoConElProcesoDeCheckout() {
        carritoPage.clickBtnCheckout();
    }
}
