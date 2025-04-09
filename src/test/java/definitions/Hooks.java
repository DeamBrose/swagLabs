package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void setUp(){
        //Indicar donde esta el chromedriver.exe
        System.setProperty( "webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe" );

        //Instanciamos driver con ChromeDriver para abrir el navegador
        driver = new ChromeDriver();

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
}
