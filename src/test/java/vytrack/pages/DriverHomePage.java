package vytrack.pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.Driver;

public class DriverHomePage {


        @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li[1]")
        public WebElement fleetModuleDriver;

        @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
        public WebElement vehiclesOptionDriver;

        public DriverHomePage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }



}
