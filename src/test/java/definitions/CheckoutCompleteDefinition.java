package definitions;

import io.cucumber.java.en.Then;
import pages.CheckoutCompletePage;

public class CheckoutCompleteDefinition {
    CheckoutCompletePage checkoutCompletePage;

    public CheckoutCompleteDefinition(){
        checkoutCompletePage = new CheckoutCompletePage();
    }

    @Then("valido que me muestre un mensaje {string}")
    public void validoQueMeMuestreUnMensaje(String message) {
        checkoutCompletePage.validarMensajeDeFinishOrder(message);
    }
}
