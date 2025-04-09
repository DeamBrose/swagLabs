package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.Util;

public class CreateCountPage extends Util {
    @FindBy( id = "id_gender1")
    protected WebElement rbMr;

    @FindBy( id = "id_gender2")
    protected WebElement rbMrs;

    @FindBy( id = "customer_firstname")
    protected WebElement txtNombre;

    @FindBy( id = "customer_lastname" )
    protected WebElement txtApellido;

    @FindBy( id = "email")
    protected WebElement txtEmail;

    @FindBy( id = "passwd" )
    protected WebElement txtPassword;

    @FindBy( id = "days" )
    protected WebElement combxDia;

    @FindBy( id = "months" )
    protected WebElement combxMes;

    @FindBy( id = "years" )
    protected WebElement combxAnio;

    @FindBy( id = "newsletter" )
    protected WebElement cbxSignUpNoticias;

    @FindBy( id = "optin" )
    protected WebElement cbxOfertas;

    //@FindBy( id = "firstname" )
    //protected WebElement txtDireccionNombre;

    //@FindBy( id = "lastname" )
    //protected WebElement txtDireccionApellido;

    @FindBy( id = "company" )
    protected WebElement txtDireccionNombreCompany;

    @FindBy( id = "address1" )
    protected WebElement txtDireccion1;

    @FindBy( id = "address2")
    protected WebElement txtDireccion2;

    @FindBy( id = "city")
    protected WebElement txtDireccionCiudad;

    @FindBy( id = "id_state")
    protected WebElement combxEstado;

    @FindBy( id = "postcode")
    protected WebElement txtCodigoPostal;

    @FindBy( id = "id_country")
    protected WebElement combxPais;

    @FindBy( id = "other")
    protected WebElement txtAreaInfoAdicional;

    @FindBy( id = "phone")
    protected WebElement txtTelefono;

    @FindBy( id = "phone_mobile")
    protected WebElement txtTelefonoMobile;

    @FindBy( id = "alias")
    protected WebElement txtDireccionAlias;

    @FindBy( id = "submitAccount")
    protected WebElement btnRegistrar;

    public CreateCountPage() {
        PageFactory.initElements( driver, this );
    }

    public void seleccionarGenero( String genero ){
        timerWait.until(ExpectedConditions.visibilityOf( rbMr ));

        if( genero.equalsIgnoreCase("señor") ){
            rbMr.click();
        }else if ( genero.equalsIgnoreCase("señora") ){
            rbMrs.click();
        }else{
            System.out.println("Valor enviado es invalido, seleccionar señor o señora");
        }
    }

    public void escribirNombre( String nombre ){
        txtNombre.sendKeys( nombre );
    }

    public void escribirApellido( String apellido ){
        txtApellido.sendKeys( apellido );
    }

    public void validarEmail( String email ){
        String valor = txtEmail.getAttribute( "value" );
        Assert.assertEquals( email, valor );
    }

    public void escribirContrasenia( String password ){
        txtPassword.sendKeys( password );
    }

    public void selectDia( String dia ){
        //2/10/1998
        String[] fecha = dia.split("/");
        new Select( combxDia ).selectByValue( fecha[0] );
    }

    public void selectMes( String mes ){
        //2/10/1998
        String[] fecha = mes.split("/");
        new Select( combxMes ).selectByValue( fecha[1] );
    }

    public void selectAnio( String anio ){
        //2/10/1998
        String[] fecha = anio.split("/");
        new Select( combxAnio ).selectByValue( fecha[2] );
    }

    public void permitirNewsLetter( String estado ){

        if( estado.equalsIgnoreCase("si") ){
            cbxSignUpNoticias.click();
            Assert.assertTrue( cbxSignUpNoticias.isSelected() );

        }else if ( estado.equalsIgnoreCase("no") ){
            Assert.assertFalse( cbxSignUpNoticias.isSelected() );

        }
    }

    public void permitirRecivirOfertas( String estado ){

        if( estado.equalsIgnoreCase("si") ){
            cbxOfertas.click();
            Assert.assertTrue( cbxOfertas.isSelected() );

        }else if ( estado.equalsIgnoreCase("no") ){
            Assert.assertFalse( cbxOfertas.isSelected() );

        }
    }

    public void escribirNombreCompany( String companyName ){
        txtDireccionNombreCompany.sendKeys( companyName );
    }

    public void escribirDireccion1( String direccion1 ){
        txtDireccion1.sendKeys( direccion1 );
    }

    public void escribirDireccion2( String direccion2 ){
        txtDireccion2.sendKeys( direccion2 );
    }

    public void escribirCiudad( String ciudad ){
        txtDireccionCiudad.sendKeys( ciudad );
    }

    public void seleccionarEstado( String estado ){
        new Select( combxEstado ).selectByVisibleText( estado );
    }

    public void escribirCodePostal( String codePostal ){
        txtCodigoPostal.sendKeys( codePostal );
    }

    public void seleccionarPais( String pais ){
        new Select( combxPais ).selectByVisibleText( pais );
    }

    public void escribirInfoAdicional( String info ){
        txtAreaInfoAdicional.sendKeys( info );
    }

    public void escribirTelefono( String telefono ){
        txtTelefono.sendKeys( telefono );
    }

    public void escribirCelular( String celular ){
        txtTelefonoMobile.sendKeys( celular );
    }

    public void escribirAlias( String alias ){
        txtDireccionAlias.sendKeys( alias );
    }

    public void registrar(){
        btnRegistrar.click();
    }
}
