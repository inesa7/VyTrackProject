package vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.Driver;

public class AllCarsPOM {

    @FindBy(xpath = "//a[@title='Create Car']")
    public WebElement createCarButton;

    public AllCarsPOM(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

