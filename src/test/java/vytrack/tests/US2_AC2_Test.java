package vytrack.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import vytrack.pages.AllCarsPOM;
import vytrack.pages.DriverHomePage;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class US2_AC2_Test {


    @FindBy(xpath = "//a[@title='Create Car']")
    public WebElement createCarButton;

    /**
     *      AC #2: drivers should not able to create a car
     *          Given driver is on the homePage
     *          When user select “Vehicles” under Fleet module
     *          Then “create car” button should not be visible
     */
    @Test
    public void driverShouldNotBeAbleToCreateACar() {

        VyTrackPOM vyTrackPOM = new VyTrackPOM();
        vyTrackPOM.goTo();

        List<String> drivers = new ArrayList<>(Arrays.asList("user22", "user23"));


        for (String eachDriver : drivers) {

            vyTrackPOM.login(eachDriver);
            BrowserUtil.waitFor(2);

            DriverHomePage driverHomePage = new DriverHomePage();
            driverHomePage.fleetModuleDriver.click();
            BrowserUtil.waitFor(2);

            driverHomePage.vehiclesOptionDriver.click();
            BrowserUtil.waitFor(2);

            Assertions.assertFalse(BrowserUtil.waitForElementLocated(new AllCarsPOM().createCarButton));
            BrowserUtil.waitFor(2);

            vyTrackPOM.logOut();


        }

    }
}


