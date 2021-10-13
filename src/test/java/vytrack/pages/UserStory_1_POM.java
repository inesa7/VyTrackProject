package vytrack.pages;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStory_1_POM {
    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li")
    public List<WebElement> moduleNames;

    public UserStory_1_POM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





    public  List<String> getModuleNames() {


            List<String> modules = new ArrayList<>();
            System.out.println("moduleNames.size() = " + moduleNames.size());

            BrowserUtil.waitFor(2);

            for (WebElement eachModule : moduleNames) {
                modules.addAll(Arrays.asList(eachModule.getText()));
                System.out.println("eachModule.getText() = " + eachModule.getText());
            }

            BrowserUtil.waitFor(2);

              return modules;
        }

    }


