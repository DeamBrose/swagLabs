package support;

import definitions.Hooks;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

public class Util extends Hooks {
    public static WebDriverWait timerWait;
    public static JavascriptExecutor js;
    public static Alert dialog;

    public Util() {
        Duration duration = Duration.ofSeconds(30);
        timerWait = new WebDriverWait( driver, duration);
        js = ( JavascriptExecutor ) driver;
    }
    //Metodo Genericos:
    //Metodo para pasar a la ventana que se genere al hacer click
    public void irVentanaActiva(){
        Set<String> identificadores = driver.getWindowHandles();//Obtiene todos los identificadores de la ventanas abiertas
        for( String identificador: identificadores ){
            driver.switchTo().window( identificador );//Se posicione en la ultima ventana abierta
        }
    }

    //Metodo para regresar a la ventana inicial
    public void irVentanaInicial(){
        driver.close();
        driver.switchTo().window("");//Regresar a la ventana inicial.
    }

    //Metodo para hacer scroll en la página eje x 0 y 1000
    public void scrollVertical(){
        js.executeScript( "window.scrollBy(0, 1000)" );
    }

    //
    public void aceptarDialogo(){
        dialog = driver.switchTo().alert();
        dialog.accept();
    }

    public void getTextoDialogo( String mensaje ){
        dialog = driver.switchTo().alert();
        Assert.assertEquals( mensaje, dialog.getText() );
    }

    public void evidencias() throws IOException {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");
        String path = "C:\\Users\\emili\\Desktop\\Web-Services\\ecommerce\\target\\evidencias\\";
        String nombre = formato.format( fecha )+"_evidencia.jpg";

        File file = ((TakesScreenshot) driver).getScreenshotAs( OutputType.FILE );
        FileUtils.copyFile( file, new File( path+nombre ));
    }
}
