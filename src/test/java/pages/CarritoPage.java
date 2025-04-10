package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CarritoPage extends Util {

    @FindBy(css = ".cart_list [data-test='inventory-item']")
    protected List<WebElement> cartItems;

    @FindBy(id = "checkout")
    protected WebElement btnCheckout;

    public CarritoPage() {
        PageFactory.initElements(driver, this);
    }

     private  boolean validarListaDeCarrito() {
        return cartItems.size() > 1;
    }

    public void validacionDeProductosAgregadosEnElCarrito(){
        assertTrue("Se esperaba más de un producto", validarListaDeCarrito());
    }
    public void clickBtnCheckout() {
        btnCheckout.click();
    }

}
