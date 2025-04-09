package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.Util;

import java.util.List;

public class CheckoutOverviewPage extends Util {

    @FindBy( css = ".cart_list [data-test='inventory-item']")
    protected List<WebElement> listProductOverView;

    @FindBy( id = "finish")
    protected  WebElement btnFinish;

    public CheckoutOverviewPage(){
        PageFactory.initElements( driver, this );
    }

    public void validacionDeProductosOverView(){
        if( listProductOverView.size() > 1 ){
            System.out.println("Se visualizan los productos");
        }else{
            System.out.println("No se visualizan los productos");
        }
    }

    public void clickBtnFinish(){
        btnFinish.click();
    }
}
