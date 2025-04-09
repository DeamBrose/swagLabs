package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

import java.util.List;

public class HomePages extends Util {
    @FindBy( css = "#inventory_container .inventory_item")
    protected List<WebElement> listProduct;

    @FindBy( id = "add-to-cart-sauce-labs-backpack")
    protected WebElement btnProductSauceLabsBackpack;

    @FindBy( id = "add-to-cart-sauce-labs-bike-light" )
    protected WebElement btnSauceLabsBikeLight;

    @FindBy( id = "add-to-cart-sauce-labs-bolt-t-shirt" )
    protected WebElement btnProductSauceLabsBoltTShirt;

    @FindBy( id = "add-to-cart-sauce-labs-onesie" )
    protected WebElement btnProductSauceLabsOnesie;

    @FindBy( css = "a[data-test='shopping-cart-link']" )
    protected WebElement btnCart;

    public HomePages(){
        PageFactory.initElements( driver, this );
    }

    public boolean validacionListaDeProductos(){
        return listProduct.size() > 1;
    }

    public void clickProductSauceLabsBackpack(){
        btnProductSauceLabsBackpack.click();
    }

    public void clickProductSauceLabsBikeLight(){
        btnSauceLabsBikeLight.click();
    }

    public void clickProductSauceLabsBoltTShirt(){
        btnProductSauceLabsBoltTShirt.click();
    }

    public void btnCartClick(){
        btnCart.click();
    }

}
