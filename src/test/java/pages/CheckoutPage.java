package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.Util;

public class CheckoutPage extends Util {

    @FindBy( id = "first-name")
    protected WebElement txtName;

    @FindBy( id = "last-name")
    protected WebElement txtLastName;

    @FindBy( id = "postal-code")
    protected WebElement txtZipCode;

    @FindBy( id = "continue")
    protected WebElement btnContinue;


    public CheckoutPage(){
        PageFactory.initElements( driver, this );
    }

    public void escribirNombre( String name ){
        txtName.sendKeys( name );
    }

    public void escribirApellido( String lastName ){
        txtLastName.sendKeys( lastName );
    }

    public void escribirZipCode( String zipCode ){
        txtZipCode.sendKeys( zipCode );
    }

    public void clickContinue(){
        btnContinue.click();
    }
}
