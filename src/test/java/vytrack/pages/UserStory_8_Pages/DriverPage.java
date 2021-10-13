package vytrack.pages.UserStory_8_Pages;


import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.ConfigReader;
import vytrack.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// DO NOT TOUCH....IT WILL BITE!!

public class DriverPage {

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    private WebElement fleet;

    @FindBy(xpath = "//li/a/span[.='Vehicle Odometer']")
    private WebElement vodbtt;

    @FindBy (css="a[title='Create Vehicle Odometer']")
    public WebElement CreateVOBtt;

    @FindBy (css="input[name='custom_entity_type[OdometerValue]']")
    public WebElement OdometerValue;

    @FindBy (css="input[name='date_selector_custom_entity_type_Date-uid-616058347f11f']")
    public WebElement DateSelector;

    @FindBy (css="input[name='custom_entity_type[Driver]']")
    public WebElement driver;

    @FindBy (id="custom_entity_type_Driver-uid-615f077c9c979")
    public WebElement Unit;

    @FindBy (xpath="//*[@id=s2id_custom_entity_type_Model-uid-615f077c9cbfb]/a/span[1]")
    public WebElement Model;

    @FindBy (css="button[class='btn btn-medium add-btn']")
    public WebElement AddBtt;

    @FindBy (css="#mCSB_2_container > div > table > tbody > tr:nth-child(13) > td.boolean-cell.grid-cell.grid-body-cell.grid-body-cell-assigned > input[type=checkbox]")
    public WebElement LicencePlate;

    @FindBy (css="button[data-action-name='select']")
    public WebElement SelectBtt;

    @FindBy (css="button[class='btn btn-success action-button']")
    public WebElement SaveAndClose;

    @FindBy (css="div[class='flash-messages-holder']")
    public WebElement MessageA;



    public DriverPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    public void createDrivervod(){

        fleet.click();

        BrowserUtil.waitFor(2);

        vodbtt.click();

        BrowserUtil.waitFor(5);

        CreateVOBtt.click();

        BrowserUtil.waitFor(5);


        OdometerValue.sendKeys("25000");
        //DateSelector.sendKeys("10/8/2021");
        driver.sendKeys("Dave");

        AddBtt.click();
        BrowserUtil.waitFor(3);

        LicencePlate.click();
        SelectBtt.click();
        BrowserUtil.waitFor(2);

        SaveAndClose.click();

    }

public String drivermessage (){

       return MessageA.getText();
}


public void salesManager(){
    fleet.click();

    BrowserUtil.waitFor(2);

    vodbtt.click();

    BrowserUtil.waitFor(5);

    CreateVOBtt.click();

    BrowserUtil.waitFor(5);

}}
