package definitions;

import io.cucumber.java.en.And;
import pages.CheckoutPage;

public class CheckoutPageDefinition {

    CheckoutPage checkoutPage;

    public CheckoutPageDefinition(){
        checkoutPage = new CheckoutPage();
    }

    @And("agrego mi información personal en la pagina de Checkout: Your Information")
    public void agregoMiInformaciónPersonalEnLaPaginaDeCheckoutYourInformation() {
        checkoutPage.escribirNombre("Deambrose");
        checkoutPage.escribirApellido("Ambrose");
        checkoutPage.escribirZipCode("123456");
    }

    @And("continuo con el proceso de la compra con el boton continuar")
    public void continuoConElProcesoDeLaCompraConElBotonContinuar() {
        checkoutPage.clickContinue();
    }
}
