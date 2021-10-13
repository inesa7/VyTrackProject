package vytrack.pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.ConfigurationReader;
import vytrack.utilities.Driver;

// DO NOT TOUCH....IT WILL BITE!!

public class VyTrackPOM {

    @FindBy(id = "prependedInput")
    private WebElement userNameBox;

    @FindBy(id = "prependedInput2")
    private WebElement passWordBox;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    private WebElement rememberMeCheckBox;

    @FindBy(css = "div [class$='form-row']>a")
    private WebElement forgetPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement requestButton;

    @FindBy(id = "_submit")
    private WebElement loginButton;

    @FindBy(id = "user-menu")
    private WebElement logOutDropDown;

    @FindBy(xpath = "//li/a[.='Logout']")
    private WebElement logOutOption;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    private WebElement fleet;

    @FindBy(xpath = "//li/a/span[.='Vehicle Odometer']")
    private WebElement vodbtt;




    public VyTrackPOM(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){

        Driver.getDriver().navigate().to(ConfigurationReader.read("VyTracProjectUrl"));

    }

    public void login(String userName){

        userNameBox.sendKeys(userName);

        passWordBox.sendKeys(ConfigurationReader.read("password"));

        rememberMeCheckBox.click();

        BrowserUtil.waitFor(1);

        loginButton.click();


    }

    public void forgetYourPassword(String userName){

        forgetPassword.click();

        userNameBox.sendKeys(userName);

        requestButton.click();

        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-warn']"));

        String expectedMessage = "Unable to send the email.";

        Assertions.assertEquals(expectedMessage,alertMessage.getText());
    }

    public void logOut(){

        logOutDropDown.click();

        BrowserUtil.waitFor(1);

        logOutOption.click();
    }

    public void createvod(){

        fleet.click();

        BrowserUtil.waitFor(2);

       vodbtt.click();

    }




}
