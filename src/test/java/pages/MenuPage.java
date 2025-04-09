package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class MenuPage extends Util {
    @FindBy( xpath = "//a[contains(text(), 'Sign in')]")
    protected WebElement lnkSignUp;

    public MenuPage() {
        PageFactory.initElements( driver, this );
    }

    public void clickSingIn(){
        timerWait.until(ExpectedConditions.elementToBeClickable( lnkSignUp ));
        lnkSignUp.click();
    }
}
