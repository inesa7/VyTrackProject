package vytrack.UserStory11;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import vytrack.pages.US11HomePageAndVehicleModelPagePOM.HomePageAndVehicleModelPagePOM;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.TestBase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AC1 extends TestBase {

    /*
    11. Story: As a user, I should be view all the vehicle models


AC #1: user should view all the vehicles model
Given user is on the homePage
When user select “Vehicle Model” under Fleet module
Then verify user can view all the vehicles
     */


    @Test
    public void AC1(){

        HomePageAndVehicleModelPagePOM homePOMPageVyTrack = new HomePageAndVehicleModelPagePOM();

        VyTrackPOM vyTrackPOM =new VyTrackPOM();
        vyTrackPOM.goTo();
        vyTrackPOM.login("salesmanager123");

        homePOMPageVyTrack.moduleFleet.click();
        homePOMPageVyTrack.vehicleModelModule.click();
        BrowserUtil.waitFor(4);

        List<String> actualAllModelNames = new ArrayList<>(Arrays.asList("m3","Model-X","corolla","XF 2021"));
        List<String> actualAllModelMakes = new ArrayList<>(Arrays.asList("mazda","Tesla","Toyota","DAF"));

        List<String> expectedModelNames = new ArrayList<>();

        for (WebElement allModelNames : homePOMPageVyTrack.allModelNames) {
            expectedModelNames.addAll(Arrays.asList(allModelNames.getText().trim()));
        }

        Assertions.assertEquals(expectedModelNames,actualAllModelNames);

        List<String> expectedModelMakes = new ArrayList<>();

        for (WebElement allModelMakes : homePOMPageVyTrack.allModelMakes) {
            expectedModelMakes.addAll(Arrays.asList(allModelMakes.getText().trim()));
        }

        Assertions.assertEquals(expectedModelMakes,actualAllModelMakes);



    }

}
//All model names
//td[@data-column-label='Model Name']
//All model makes
//td[@data-column-label='Make']