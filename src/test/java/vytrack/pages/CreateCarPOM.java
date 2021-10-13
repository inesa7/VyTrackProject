package vytrack.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.Driver;

public class CreateCarPOM {

    @FindBy(xpath = "//input[@name='custom_entity_type[LicensePlate]']")
    public WebElement licensePlateField;

    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_Driver')]")
    public WebElement driverField;

    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_ModelYear')]")
    public WebElement modelYearField;

    @FindBy(xpath = "//input[contains(@id, 'custom_entity_type_LastOdometer')]")
    public WebElement lastOdometerField;

    @FindBy(xpath = "//input[contains(@id, 'custom_entity_type_Color')]")
    public WebElement colorField;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndCloseButton;

    public CreateCarPOM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





}

