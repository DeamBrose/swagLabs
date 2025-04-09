package definitions;

import io.cucumber.java.en.And;
import pages.CheckoutOverviewPage;

public class CheckoutOverviewDefinition {
    CheckoutOverviewPage checkoutOverviewPage;

    public CheckoutOverviewDefinition(){
        checkoutOverviewPage = new CheckoutOverviewPage();
    }

    @And("verifico que me muestre los productos y finalizo con mi pedido dandole click al boton finish en la pagina Checkout: Overview")
    public void verificoQueMeMuestreLosProductosYFinalizoConMiPedidoDandoleClickAlBotonFinishEnLaPaginaCheckoutOverview() {
        checkoutOverviewPage.validacionDeProductosOverView();
        checkoutOverviewPage.clickBtnFinish();
    }
}
