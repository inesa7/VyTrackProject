package vytrack.test.Userstory_8;

import org.junit.jupiter.api.Test;
import vytrack.pages.UserStory_8_Pages.SalesManagerPage;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.BrowserUtil;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Case_2_SalesManagerPermission {
    @Test
    public void salesMTest(){
        VyTrackPOM login = new VyTrackPOM();

        login.goTo();
        login.login("salesmanager122");
        BrowserUtil.waitFor(3);

        SalesManagerPage SM = new SalesManagerPage();

        SM.salesM();

        Boolean message = SM.smM().contains("You do not have permission to perform this action.");

        assertTrue(message);
    }
}
