package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.Util;

public class CheckoutCompletePage extends Util {

    @FindBy( css = ".complete-header" )
    protected WebElement txtCheckoutComplete;

    public CheckoutCompletePage(){
        PageFactory.initElements( driver, this );
    }

    public void validarMensajeDeFinishOrder( String message ){
        Assert.assertEquals(message, txtCheckoutComplete.getText());
    }
}
