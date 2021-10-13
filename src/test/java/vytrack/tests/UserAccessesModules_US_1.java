package vytrack.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import vytrack.pages.UserStory_1_POM;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserAccessesModules_US_1 extends TestBase {

    //Given store/sales manager is on the homePage
    //Then verify user view 8 models names [verify the names]
    @Test
    public void testStore_Sales_Manger_Accesses8Modules() {

        VyTrackPOM vyTrackPOM = new VyTrackPOM();

        vyTrackPOM.goTo();

        vyTrackPOM.login("storemanager65");


            UserStory_1_POM homePage = new UserStory_1_POM();

            homePage.getModuleNames();

            List<String> expectedModulesNames = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities"
                    , "Marketing", "Reports & Segments", "System"));


            assertEquals(8, homePage.moduleNames.size());

            assertEquals(expectedModulesNames, homePage.getModuleNames());

            //vyTrackPOM.logOut();

        }


//    Given driver is on the homePage
//    Then verify user view 4 models names [verify the names]
        @Test
        public void testDriver_Accesses4Modules() {

            VyTrackPOM vyTrackPOM = new VyTrackPOM();

            vyTrackPOM.goTo();

            vyTrackPOM.login("user22");

                UserStory_1_POM homePage = new UserStory_1_POM();

                homePage.getModuleNames();

                List<String> expectedModulesNames = new ArrayList<>(Arrays.asList("Fleet", "Customers","Activities","System"));


                assertEquals(4, homePage.moduleNames.size());

                assertEquals(expectedModulesNames, homePage.getModuleNames());

                //vyTrackPOM.logOut();


            }
        }



