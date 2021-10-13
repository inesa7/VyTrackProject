package vytrack.tests;

import org.junit.jupiter.api.Test;
import vytrack.pages.POM_UserStory6;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.TestBase;

public class UserStory6_Test extends TestBase {

    @Test
    public void verifyUserHas3Options(){

        POM_UserStory6 userStory6 = new POM_UserStory6();

        userStory6.optionsForTruckDriver();

        BrowserUtil.waitFor(2);

        userStory6.optionsForStoreManager();

        BrowserUtil.waitFor(2);

        userStory6.optionsForSalesManager();

    }
}
