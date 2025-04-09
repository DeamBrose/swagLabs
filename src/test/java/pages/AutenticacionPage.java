package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class AutenticacionPage extends Util {
    @FindBy( id = "email_create")
    protected WebElement txtEmail;

    @FindBy( id = "SubmitCreate")
    protected WebElement btnCrearCuenta;

    public AutenticacionPage() {
        PageFactory.initElements( driver, this );
    }

    public void ingresarCorreo( String email ){
        timerWait.until(ExpectedConditions.visibilityOf(txtEmail));
        txtEmail.sendKeys( email );
    }

    public void clickCrearCuenta(){
        btnCrearCuenta.click();
    }
}
