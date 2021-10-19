package vytrack.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.ConfigReader;
import vytrack.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class POM_UserStory4 {

    @FindBy(xpath="//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    private WebElement customersBtu;

    @FindBy(xpath="//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span")
    private WebElement contactBtu;

    @FindBy(xpath="//*[@id=\"container\"]/div[2]/div/div/div[2]/div[2]/a")
    private WebElement creatContactBtu;

    @FindBy(xpath ="//*[@id=\"s2id_oro_contact_form_owner-uid-6167a9f784d66\"]/a/span[1]")
    private WebElement owner;

    @FindBy(xpath ="//*[@id=\"select2-drop\"]/ul[2]/li[3]/div")
    private WebElement oneOpt;

    @FindBy(name ="oro_contact_form[firstName]")
    private WebElement firstName;

    @FindBy(name="oro_contact_form[lastName]")
    private WebElement lastName;

    @FindBy(name="oro_contact_form[phones][0][phone]")
    private WebElement phone;
////*[@id="s2id_oro_contact_form_addresses_0_country-uid-6167a9f787c0a"]/a/span[1]
    //   //*[@id="s2id_oro_contact_form_addresses_0_country-uid-6167a9f787c0a"]/a/span[1]
    @FindBy(xpath="//*[@id=\"s2id_oro_contact_form_addresses_0_country-uid-6167a9f787c0a\"]/a/span[1]")
    private WebElement country;

    @FindBy(id="oro_contact_form_addresses_0_street-uid-61679124f193a")
    private WebElement street;

    @FindBy(id="oro_contact_form_addresses_0_city-uid-61679124f1b2a")
    private WebElement city;

    @FindBy(id="oro_contact_form_addresses_0_region_text-uid-61679124f1d2e")
    private WebElement state;

    @FindBy(id="oro_contact_form_addresses_0_postalCode-uid-61679124f1e25")
    private WebElement zipCode;

    @FindBy(xpath="//*[@id=\"oro_contact_form-uid-61679124f3d86\"]/div[1]/div/div/div[2]/div[1]/div[2]/div/button")
    private WebElement saveCloseBut;

    @FindBy(xpath="//*[@id=\"flash-messages\"]/div/div")
    private WebElement contactSaveMess;

   private static VyTrackPOM vyTrackPOM=new VyTrackPOM();
   private static  Faker faker=new Faker();

   public POM_UserStory4(){
      PageFactory.initElements(Driver.getDriver(),this);
  }

    public void ableToCreatContact(){


        List<String> usersName= new ArrayList<>(
                Arrays.asList(ConfigReader.read("TruckDriversUN1"),ConfigReader.read("StoreManagerUN1"),
                        ConfigReader.read("SalesManagerUN1")));

        for (String eachUserName : usersName) {
            System.out.println(" this is " + eachUserName +" part");
           vyTrackPOM.goTo();
           vyTrackPOM.login(eachUserName);
            BrowserUtil.waitFor(3);
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(customersBtu).moveToElement(contactBtu).click().perform();
            BrowserUtil.waitFor(3);
            creatContactBtu.click();

            // Enter contact info
             owner.click();
            BrowserUtil.waitFor(3);
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
            wait.until( elementToBeClickable(oneOpt) ).click();

            firstName.sendKeys(faker.name().firstName());
            lastName.sendKeys(faker.name().lastName());
            phone.sendKeys(faker.numerify("###-###-####"));

           // Enter addresses info

            Select selectOpj= new Select(country);
            selectOpj.selectByIndex(3);
            street.sendKeys(faker.address().streetAddress());
            city.sendKeys(faker.address().city());
            state.sendKeys(faker.address().state());
            zipCode.sendKeys(faker.address().zipCode());
            saveCloseBut.click();
            vyTrackPOM.logOut();
        }
    }


    public boolean verifyConfirmMess() {


            vyTrackPOM.goTo();
            vyTrackPOM.login(ConfigReader.read("TruckDriversUN1"));
            BrowserUtil.waitFor(3);
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(customersBtu).moveToElement(contactBtu).click().perform();
            BrowserUtil.waitFor(3);
            creatContactBtu.click();

            // Enter contact info
            owner.click();
            BrowserUtil.waitFor(3);
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
             wait.until( elementToBeClickable(oneOpt) ).click();

            firstName.sendKeys(faker.name().firstName());
            lastName.sendKeys(faker.name().lastName());
            phone.sendKeys(faker.numerify("###-###-####"));

            // Enter addresses info

            Select selectOpj= new Select(country);
            selectOpj.selectByIndex(3);
            street.sendKeys(faker.address().streetAddress());
            city.sendKeys(faker.address().city());
            state.sendKeys(faker.address().state());
            zipCode.sendKeys(faker.address().zipCode());
            saveCloseBut.click();
            return contactSaveMess.isDisplayed();

        }

    }




