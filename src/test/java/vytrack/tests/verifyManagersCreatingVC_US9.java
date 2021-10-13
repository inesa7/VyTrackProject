package vytrack.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import vytrack.pages.POM_UserStory9;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.Driver;
import vytrack.utilities.TestBase;
import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verifyManagersCreatingVC_US9 extends TestBase {

    VyTrackPOM vyTrackPOM = new VyTrackPOM();
    POM_UserStory9 pom_userStory9 = new POM_UserStory9();

    @Test
    public void managersLogIn() {

        List<String> userNamesManagers = new ArrayList<>(Arrays.asList("storemanager65", "storemanager66",
                "salesmanager122", "salesmanager123", "salesmanager124"));

        for (String eachManager : userNamesManagers) {
            vyTrackPOM.goTo();

            vyTrackPOM.login(eachManager);

            BrowserUtil.waitFor(5);

            pom_userStory9.loginIntoContract();

            BrowserUtil.waitFor(3);

            pom_userStory9.getType().click();

            pom_userStory9.selectPayment();

            pom_userStory9.fillForm();

            String expectedToastMsg = "Entity saved";
            WebElement actualToastMsg = driver.findElement(By.xpath("//div[.='Entity saved']"));
            Assertions.assertEquals(expectedToastMsg, actualToastMsg.getText());

            vyTrackPOM.logOut();

            BrowserUtil.waitFor(10);


        }

    }

    @Test
    public void driversLogin() {
        BrowserUtil.waitFor(10);

        List<String> driverUserNames = new ArrayList<>(Arrays.asList("user23", "user22"));

        for (String eachManager : driverUserNames) {
            vyTrackPOM.goTo();

            vyTrackPOM.login(eachManager);

            BrowserUtil.waitFor(3);

            pom_userStory9.driversLogin();
            BrowserUtil.waitFor(3);

            String expectedToastMsg = "You do not have permission to perform this action.";
            WebElement actualToastMsg = driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));
            Assertions.assertEquals(expectedToastMsg, actualToastMsg.getText());


            vyTrackPOM.logOut();

            BrowserUtil.waitFor(5);
        }


    }
}