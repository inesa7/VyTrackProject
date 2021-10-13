package vytrack.test.Userstory_8;

import org.junit.jupiter.api.Test;
import vytrack.pages.UserStory_8_Pages.StoreManangerPage;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.BrowserUtil;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Case_3_StoreManagerPermission {

    @Test
    public void StoreMTest(){
        VyTrackPOM login = new VyTrackPOM();

        login.goTo();
        login.login("storemanager65");
        BrowserUtil.waitFor(3);

        StoreManangerPage StroreM = new StoreManangerPage();

        StroreM.storeM();

        Boolean message = StroreM.storemM().contains("You do not have permission to perform this action.");
        assertTrue(message);
    }


}
