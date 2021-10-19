package vytrack.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import vytrack.pages.POM_UserStory4;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.TestBase;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory4_Test extends TestBase {



    @Test
    public void contactInfo_function(){
        POM_UserStory4 userStory4= new POM_UserStory4();
        userStory4.ableToCreatContact();
        BrowserUtil.waitFor(4);
        assertTrue( userStory4.verifyConfirmMess());

    }
}
