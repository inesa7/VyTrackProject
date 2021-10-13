package vytrack.pages;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.ConfigReader;
import vytrack.utilities.Driver;
import org.junit.jupiter.api.Assertions.*;
import java.net.BindException;
import java.util.Date;
import java.util.List;


public class POM_UserStory9 {

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    private WebElement fleetBtn;

    @FindBy(linkText = "Vehicle Contracts")
    private WebElement vehicleContracts;

    @FindBy(xpath = "//a[@title='Create Vehicle Contract']")
    private WebElement createVC;

    @FindBy(xpath = "//span[.='Choose a value...']")
    private WebElement type;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    private List<WebElement>paymentOpts;

    @FindBy(name = "custom_entity_type[Responsible]")
    private WebElement responsibleBox;

    @FindBy(xpath = "//input[@data-name='field__activation-cost']")
    private WebElement activationCost;

    @FindBy(name = "custom_entity_type[RecurringCostAmount]")
    private WebElement recurringCostBoxDep;

    @FindBy(xpath = "//span[.='No']")
    private WebElement recurringCostAmount;

    @FindBy(css = "div li[class^='select2-result']")
    private List<WebElement>dropOpts;

    @FindBy(xpath = "//input[@data-name='field__odometer-details']")
    private WebElement odometerDetails;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    private WebElement invoiceDate;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    private WebElement contractStartDate;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[3]")
    private WebElement contractExpDate;

    @FindBy(name = "custom_entity_type[Vendor]")
    private WebElement vendor;

    @FindBy(name = "custom_entity_type[Driver]")
    private WebElement driver;

    @FindBy(name = "custom_entity_type[ContractReference]")
    private WebElement contactReference;

    @FindBy(name = "custom_entity_type[TermsandConditions]")
    private WebElement termsAndConditions;

    @FindBy(xpath = "//span[.='Active']")
    private WebElement status;

    @FindBy(xpath = "(//button[normalize-space(.)='Save and Close'])[1]")
    private WebElement saveAndClose;

    @FindBy(xpath = "//div[.='Personal Loan']")
    private WebElement personalLoan;


    public WebElement getFleetBtn() {
        return fleetBtn;
    }

    public WebElement getVehicleContracts() {
        return vehicleContracts;
    }

    public WebElement getCreateVC() {
        return createVC;
    }

    public WebElement getType() {
        return type;
    }

    public WebElement getResponsibleBox() {
        return responsibleBox;
    }

    public WebElement getActivationCost() {
        return activationCost;
    }

    public WebElement getRecurringCostBoxDep() {
        return recurringCostBoxDep;
    }

    public WebElement getRecurringCostAmount() {
        return recurringCostAmount;
    }

    public List<WebElement> getDropOpts() {
        return dropOpts;
    }

    public WebElement getOdometerDetails() {
        return odometerDetails;
    }

    public WebElement getInvoiceDate() {
        return invoiceDate;
    }

    public WebElement getContractStartDate() {
        return contractStartDate;
    }

    public WebElement getContractExpDate() {
        return contractExpDate;
    }

    public WebElement getVendor() {
        return vendor;
    }

    public WebElement getDriver() {
        return driver;
    }

    public WebElement getContactReference() {
        return contactReference;
    }

    public WebElement getTermsAndConditions() {
        return termsAndConditions;
    }

    public WebElement getStatus() {
        return status;
    }

    public WebElement getSaveAndClose() {
        return saveAndClose;
    }

    public POM_UserStory9(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    public void loginIntoContract(){

       Actions action =new Actions(Driver.getDriver());
       action.moveToElement(fleetBtn).click().perform();

        BrowserUtil.waitFor(2);

        action.moveToElement(vehicleContracts).click().perform();

        BrowserUtil.waitFor(2);

        createVC.click();


        BrowserUtil.waitFor(3);

    }

    public void driversLogin(){
        Actions action =new Actions(Driver.getDriver());
        action.moveToElement(fleetBtn).click().perform();

        BrowserUtil.waitFor(2);

        action.moveToElement(vehicleContracts).click().perform();

        BrowserUtil.waitFor(2);
    }


    public void selectPayment(){

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(personalLoan).click().perform();
        BrowserUtil.waitFor(2);


    }

    public void fillForm(){
        Faker faker=new Faker();

        responsibleBox.sendKeys(faker.name().fullName());
        activationCost.sendKeys(String.valueOf(faker.number().numberBetween(50, 10000)));
        recurringCostBoxDep.sendKeys(String.valueOf(faker.number().numberBetween(10, 12000)));

        recurringCostAmount.click();
        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(recurringCostAmount).click().perform();

        BrowserUtil.waitFor(3);

        odometerDetails.sendKeys(String.valueOf(faker.number().numberBetween(10, 1200)));

        invoiceDate.sendKeys("Oct 21, 2021");
        BrowserUtil.waitFor(1);

        contractStartDate.sendKeys("Oct 21, 2021");
        BrowserUtil.waitFor(1);

        contractExpDate.sendKeys("Oct 21, 2031");
        BrowserUtil.waitFor(2);

        vendor.sendKeys(faker.name().fullName());
        BrowserUtil.waitFor(1);

        driver.sendKeys(faker.name().fullName());
        BrowserUtil.waitFor(1);

        contactReference.sendKeys(faker.name().fullName());
        BrowserUtil.waitFor(1);
        termsAndConditions.sendKeys("Agreed");

        BrowserUtil.waitFor(2);

        saveAndClose.submit();




    }














}
