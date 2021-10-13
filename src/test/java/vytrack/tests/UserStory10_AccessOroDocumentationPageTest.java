
package vytrack.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.w3c.dom.html.HTMLInputElement;
import vytrack.pages.POM_UserStory10;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.ConfigReader;
import vytrack.utilities.Driver;
 import vytrack.utilities.TestBase;

public class UserStory10_AccessOroDocumentationPageTest extends TestBase {

@Test
    public void us10() {
    POM_UserStory10 Obj = new POM_UserStory10();
    Obj.oroDocs();



    }

}


