package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.Util;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LoginPage extends Util {
    @FindBy( id = "user-name")
    protected WebElement txtUsername;

    @FindBy( id = "password")
    protected WebElement txtPassword;

    @FindBy( id = "login-button")
    protected WebElement btnLogin;

    @FindBy( css = "h3[data-test='error']" )
    protected WebElement txtMessageError;

    public LoginPage(){
        PageFactory.initElements( driver, this );
    }

    public void ingresarUsuario( String username ){
        txtUsername.sendKeys( username );
    }

    public void ingresarPassword( String password ){
        txtPassword.sendKeys( password );
    }

    public void clickLogin(){
        btnLogin.click();
    }

    private String getErrorMessage(){
        String message = txtMessageError.getText();
        if( !message.isEmpty() ){
            return message;
        } else {
            return "mensaje no encontrado";
        }
    }

    public void validacionDeMensajeDeErrorEsperado(String message){
        assertEquals(message, getErrorMessage());
    }
}
