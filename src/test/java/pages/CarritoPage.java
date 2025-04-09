package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

import java.util.List;

public class CarritoPage extends Util {

    @FindBy(css = ".cart_list [data-test='inventory-item']")
    protected List<WebElement> cartItems;

    @FindBy(id = "checkout")
    protected WebElement btnCheckout;

    public CarritoPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean validarListaDeCarrito() {
        return cartItems.size() > 1;
    }

    public void clickBtnCheckout() {
        btnCheckout.click();
    }

}
