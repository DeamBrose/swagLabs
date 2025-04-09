package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePages;

import static org.junit.Assert.assertTrue;

public class HomePageDefinition {
    HomePages homePages;

    public HomePageDefinition(){
        homePages = new HomePages();
    }

    @Then("deberia ver la pagina de inventario de productos")
    public void deberiaVerLaPaginaDeInventarioDeProductos() {
        assertTrue("Se esperaba más de un producto", homePages.validacionListaDeProductos());
    }

    @When("agregue productos al carrito de compra")
    public void agregueProductosAlCarritoDeCompra() {
        homePages.clickProductSauceLabsBackpack();
        homePages.clickProductSauceLabsBikeLight();
        homePages.btnCartClick();
    }
}
