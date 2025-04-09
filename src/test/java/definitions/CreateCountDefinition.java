package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.AutenticacionPage;
import pages.CreateCountPage;
import pages.MenuPage;

public class CreateCountDefinition {
    AutenticacionPage autenticacionPage;
    CreateCountPage createCountPage;
    MenuPage menuPage;

    public CreateCountDefinition() {
        autenticacionPage = new AutenticacionPage();
        createCountPage = new CreateCountPage();
        menuPage = new MenuPage();
    }

    @Given("que la web esté disponible")
    public void queLaWebEsteDisponible() {
        Hooks.driver.get("http://automationpractice.com/index.php");
    }

    @And("ingresar al opción de creacion de cuenta")
    public void ingresarAlOpcionDeCreacionDeCuenta() {
        menuPage.clickSingIn();
    }

    @And("ingresar un correo {string}")
    public void ingresarUnCorreo(String email) {
        autenticacionPage.ingresarCorreo( email );
        autenticacionPage.clickCrearCuenta();
    }

    @And("seleccionar el genero {string}")
    public void seleccionarElGenero(String genero) {
        createCountPage.seleccionarGenero( genero );
    }


    @And("ingresar nombre {string}")
    public void ingresarNombre(String nombre) {
        createCountPage.escribirNombre( nombre );
    }

    @And("ingresar apellido {string}")
    public void ingresarApellido(String apellido) {
        createCountPage.escribirApellido( apellido );
    }

    @And("validar el correo {string}")
    public void validarElCorreo(String email) {
        createCountPage.validarEmail( email );
    }

    @And("ingresar password {string}")
    public void ingresarPassword(String password) {
        createCountPage.escribirContrasenia( password );
    }

    @And("ingresar fecha de nacimiento {string}")
    public void ingresarFechaDeNacimiento(String fecha) {
        createCountPage.selectDia( fecha );
        createCountPage.selectMes( fecha );
        createCountPage.selectAnio(fecha );
    }

    @And("{string} permitir envio de newsletter")
    public void permitirEnvioDeNewsletter(String newsLetter) {
        createCountPage.permitirNewsLetter( newsLetter );
    }

    @And("seleccionar ofertas {string}")
    public void seleccionarOfertas(String ofertas) {
        createCountPage.permitirRecivirOfertas( ofertas );
    }

    @And("escribir empresa {string}")
    public void escribirEmpresa(String empresaNombre) {
        createCountPage.escribirNombreCompany( empresaNombre );
    }

    @And("escribir primera direccion {string}")
    public void escribirPrimeraDireccion(String direccion1) {
        createCountPage.escribirDireccion1( direccion1 );
    }

    @And("escribir segunda direccion {string}")
    public void escribirSegundaDireccion(String direccion2) {
        createCountPage.escribirDireccion2( direccion2 );
    }

    @And("escribir ciudad {string}")
    public void escribirCiudad(String cuidad) {
        createCountPage.escribirCiudad( cuidad );
    }

    @And("seleccionar estado {string}")
    public void seleccionarEstado(String estado) {
        createCountPage.seleccionarEstado( estado );
    }

    @And("escribir codigo postal {string}")
    public void escribirCodigoPostal(String codePostal) {
        createCountPage.escribirCodePostal( codePostal );
    }

    @And("seleccionar pais {string}")
    public void seleccionarPais(String pais) {
        createCountPage.seleccionarPais( pais );
    }

    @And("escribir info {string}")
    public void escribirInfo(String info) {
        createCountPage.escribirInfoAdicional( info );
    }

    @And("escribir telefono {string}")
    public void escribirTelefono(String telefono) {
        createCountPage.escribirTelefono( telefono );
    }

    @And("escribir celular {string}")
    public void escribirCelular(String celular) {
        createCountPage.escribirCelular( celular );
    }

    @And("escribir alias {string}")
    public void escribirAlias(String alias) {
        createCountPage.escribirAlias( alias );
    }

    @And("registrar registro")
    public void registrarRegistro() {
        createCountPage.registrar();
    }
}
