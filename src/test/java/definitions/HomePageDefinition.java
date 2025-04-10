package definitions;

import io.cucumber.java.en.And;
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
        homePages.validacionDeProductosEnElInventario();
    }

    @When("agregue productos al carrito de compra")
    public void agregueProductosAlCarritoDeCompra() {
        homePages.clickProductSauceLabsBackpack();
        homePages.clickProductSauceLabsBikeLight();
        homePages.btnCartClick();
    }

    @And("agregue tres productos al carrito de compra")
    public void agreguetresProductosAlCarritoDeCompra() {
        homePages.clickProductSauceLabsBackpack();
        homePages.clickProductSauceLabsBikeLight();
        homePages.clickProductSauceLabsBoltTShirt();
        homePages.btnCartClick();
    }
}
