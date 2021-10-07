package vytrack.pages.US11HomePageAndVehicleModelPagePOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.Driver;

import java.util.List;

public class HomePageAndVehicleModelPagePOM {

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li")
    public List<WebElement> modelsNames;

    @FindBy(xpath = "//li/a[@data-toggle='dropdown']")
    public WebElement topRightUserName;

    @FindBy(xpath = "//li/a[@href='/user/logout']")
    public WebElement logOutBtn;

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li[2]")
    public WebElement moduleFleet;

    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    public WebElement VehiclesBtnUnderFleetModule;

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li[1]")
    public WebElement moduleFleetForDriverOnly;

    @FindBy(xpath = "//li[@class='dropdown-menu-single-item last']//a[@href='/entity/Extend_Entity_VehiclesModel']")
    public WebElement vehicleModelModule;


    //2 of those elements are from VehicleModelsPage
    @FindBy(xpath = "//td[@data-column-label='Model Name']\n")
    public List<WebElement> allModelNames;

    @FindBy(xpath = "//td[@data-column-label='Make']")
    public List<WebElement> allModelMakes;





    public HomePageAndVehicleModelPagePOM() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
