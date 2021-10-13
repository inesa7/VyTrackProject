package vytrack.test.Userstory_8;

import org.junit.jupiter.api.Test;
import vytrack.pages.UserStory_8_Pages.DriverPage;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.BrowserUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Case_1_DriverCreateVehicleOdometer {


   @Test
    public void driverTest(){

    VyTrackPOM login = new VyTrackPOM();

    login.goTo();
    login.login("user22");
    BrowserUtil.waitFor(3);

    DriverPage createvo = new DriverPage();

    createvo.createDrivervod();

    BrowserUtil.waitFor(3);

    Boolean messageB= createvo.drivermessage().contains("Entity saved");

       assertTrue(messageB);

   }}


