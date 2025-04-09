package definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void setUp(){
        //Indicar donde esta el chromedriver.exe
        System.setProperty( "webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe" );
        ChromeOptions options = new ChromeOptions();

        //mapa para las preferencias experimentales
        Map<String, Object> prefs = new HashMap<String, Object>();

        // Deshabilitar la detección de fugas de contraseñas (Password Leak Detection)
        // Esta es la opción clave para evitar el mensaje de "contraseña violada"
        prefs.put("profile.password_manager_leak_detection", false);

        prefs.put("credentials_enable_service", false); // Deshabilita el servicio de credenciales
        prefs.put("profile.password_manager_enabled", false); // Deshabilita el gestor de contraseñas

        // Aplicar las preferencias a las opciones de Chrome
        options.setExperimentalOption("prefs", prefs);


        options.addArguments("--start-maximized"); // Iniciar maximizado
        options.addArguments("--disable-infobars"); // Deshabilitar la barra "Chrome está siendo controlado..."
        options.addArguments("--disable-extensions"); // Deshabilitar extensiones que puedan interferir
        options.addArguments("--disable-popup-blocking"); // Deshabilitar bloqueo de popups (si tu app los usa)
        
        driver = new ChromeDriver(options);

        //Para maximizar en navegador (Pantalla completa)
        driver.manage().window().maximize();
    }

    @After
    public static void tearDown(){
        if (driver != null) { //verificar si el driver se inicializó
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }

    @AfterAll
    public static void printReportUrl() {
        String baseUrl = "http://localhost:63342/swagLabs/ecommerce/";
        String relativeReportPath = "target/cucumber-report/index.html";
        try {
            String reportUrl = baseUrl + relativeReportPath;
            System.out.println("---------------------------------------------------------");
            System.out.println("Cucumber HTML Report URL (served):"); // Mensaje más claro
            System.out.println(reportUrl);
            System.out.println("---------------------------------------------------------");

        }catch (Exception e){
            System.err.println("Error al intentar generar la URL del reporte: " + e.getMessage());
        }
    }
}
