package vytrack.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.ConfigReader;
import vytrack.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class POM_UserStory6 {

    @FindBy(id = "user-menu")
    private WebElement userMenuDropDown;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[@class='first']")
    private WebElement myUserOption;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[@class='mobile-hide']")
    private WebElement myConfigurationOption;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a[.='My Calendar']")
    private WebElement myCalenderOption;

    @FindBy(xpath = "//a[.='Logout']")
    private WebElement logOutOption;

    public POM_UserStory6(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    public void optionsForTruckDriver(){

        VyTrackPOM vyTrackPOM = new VyTrackPOM();

        List<String> userNamesForTD = new ArrayList<>(
                Arrays.asList("user22","user22","user23")
        );

        for (String eachUserNameForTD : userNamesForTD) {

            vyTrackPOM.goTo();

            vyTrackPOM.login(eachUserNameForTD);

            userMenuDropDown.click();

            assertTrue(myUserOption.isDisplayed());

            assertTrue(myConfigurationOption.isDisplayed());

            assertTrue(myCalenderOption.isDisplayed());

            logOutOption.click();

        }
    }

    public void optionsForStoreManager(){

        VyTrackPOM vyTrackPOM = new VyTrackPOM();

        List<String> userNamesForStoreMan = new ArrayList<>(

                Arrays.asList("storemanager65","storemanager66")
        );

        for (String eachUserNameForSM : userNamesForStoreMan) {

            vyTrackPOM.goTo();

            vyTrackPOM.login(eachUserNameForSM);

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-menu")));

            userMenuDropDown.click();

            assertTrue(myUserOption.isDisplayed());

            assertTrue(myConfigurationOption.isDisplayed());

            assertTrue(myCalenderOption.isDisplayed());

            logOutOption.click();

        }
    }

    public void optionsForSalesManager(){

        VyTrackPOM vyTrackPOM = new VyTrackPOM();

        List<String> userNamesForSalesMan = new ArrayList<>(
                Arrays.asList("salesmanager122","salesmanager123","salesmanager124")
        );

        for (String eachUserNameForSM : userNamesForSalesMan) {

            vyTrackPOM.goTo();

            vyTrackPOM.login(eachUserNameForSM);

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-menu")));

            userMenuDropDown.click();

            assertTrue(myUserOption.isDisplayed());

            assertTrue(myConfigurationOption.isDisplayed());

            assertTrue(myCalenderOption.isDisplayed());

            logOutOption.click();

        }
    }




}
