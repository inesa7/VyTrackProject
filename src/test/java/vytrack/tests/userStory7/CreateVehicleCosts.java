package vytrack.tests.userStory7;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import vytrack.pages.VyTrackPOM;
import vytrack.utilities.TestBase;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CreateVehicleCosts extends TestBase {
    @Test
    public void vehicleCosts() throws InterruptedException {

        VyTrackPOM vyTrackPOM = new VyTrackPOM();
        vyTrackPOM.goTo();

        //String[] usernames = {"storemanager65" , "storemanager66", "salesmanager125" , "salesmanager126" , "salesmanager127"};
        // Usernames

        vyTrackPOM.login("salesmanager125");
        //Both store managers and sales managers work

        Thread.sleep(6000);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        //fleet

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[5]/a/span")).click();
        //vehicle costs

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/a")).click();
        //create vehicle cost

        Thread.sleep(3000);

        //Select dropDownType = new Select(driver.findElement(By.linkText("Choose a value...")));
        //dropDownType.selectByVisibleText("Repair and maintenance");


        driver.findElement(By.linkText("Choose a value...")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[6]/div")).click();
        //Type and drop down

        Thread.sleep(500);

        WebElement price = driver.findElement(By.name("custom_entity_type[TotalPrice]"));
        price.sendKeys("98989");
        //Total Price

        Thread.sleep(500);

        Faker faker = new Faker();
        WebElement calender = driver.findElement(By.xpath("//input[@placeholder='Choose a date']"));
        calender.sendKeys("Oct 21, 2021");
        //Date

        Thread.sleep(500);

        driver.findElement(By.name("custom_entity_type[CostDescriptions]")).sendKeys("Im struggling ngl. I skipped the calendar part");
        //Cost Description

        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='btn-group pull-right'][1]")).submit();
        Thread.sleep(1000);

        WebElement popup = driver.findElement(By.xpath("//div[@class=\"flash-messages-holder\"]"));
        boolean isDisplayed = popup.isDisplayed();

        assert(isDisplayed);



        Thread.sleep(5000);

    }
}

/*
Given user is on the homePage
When user select “Vehicle Costs” under Fleet module
And user click “Create Vehicle Costs” button
When user fill out general information and click “Save and Close” button
Then verify “Entity saved” confirm message
 */


