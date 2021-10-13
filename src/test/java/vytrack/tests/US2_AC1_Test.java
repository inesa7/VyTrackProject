package vytrack.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import vytrack.pages.*;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class US2_AC1_Test extends TestBase {

    /**
     * User story 2: As a user, I should be create vehicles/cars.
     *
     * AC #1: only store/sales manager able to create car
     *
     *         Given store/sales manager is on the homePage
     *         When user select “Vehicles” under Fleet module
     *         And user click “create car” button
     *         When user fill out general information
     *         And click “Save and Close” button
     *         Then verify “Entity saved” confirm message
     */

    @Test
    public void userCreatesVehicles(){

        VyTrackPOM vyTrackPOM = new VyTrackPOM();
        vyTrackPOM.goTo();

        List<String> managers = new ArrayList<>(Arrays.asList
                ("storemanager65" , "storemanager66", "salesmanager122" , "salesmanager123" , "salesmanager124"));

        for (String eachManager : managers) {

            vyTrackPOM.login(eachManager);
            BrowserUtil.waitFor(2);

            HomePage homePage = new HomePage();
            homePage.fleetModule.click();
            BrowserUtil.waitFor(2);

            homePage.vehiclesOption.click();
            BrowserUtil.waitFor(2);

            AllCarsPOM createCar = new AllCarsPOM();
            createCar.createCarButton.click();
            BrowserUtil.waitFor(2);

            CreateCarPOM car = new CreateCarPOM();

            Faker faker = new Faker();

            car.licensePlateField.sendKeys(faker.numerify("##MD###"));
            BrowserUtil.waitFor(2);

            car.driverField.sendKeys(faker.name().fullName());
            BrowserUtil.waitFor(2);

            car.modelYearField.sendKeys("2021");
            BrowserUtil.waitFor(2);

            car.lastOdometerField.sendKeys(faker.number().digits(5));
            BrowserUtil.waitFor(2);

            car.colorField.sendKeys(faker.color().name());
            BrowserUtil.waitFor(2);

            car.saveAndCloseButton.click();
            BrowserUtil.waitFor(2);

            String expectedToastMsg = "Entity saved";
            WebElement actualToastMsg = driver.findElement(By.xpath("//div[.='Entity saved']"));
            Assertions.assertEquals(expectedToastMsg, actualToastMsg.getText());

            vyTrackPOM.logOut();


        }

    }

}
    






