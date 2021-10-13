package vytrack.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.Driver;
import static org.junit.jupiter.api.Assertions.*;

public class POM_UserStory10 {

    @FindBy(id = "prependedInput")
    public WebElement userNameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passWordBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(id = "user-menu")
    public WebElement logOutDropDown;

    @FindBy(xpath = "//li/a[.='Logout']")
    public WebElement logOutOption;

    @FindBy(className = "fa-question-circle")
    public WebElement getHelp;

    @FindBy(className = "hero-banner-holder")
    public WebElement oroDocs;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/h1")
    public WebElement oroDocsAccess;

    @FindBy(xpath = "/html/head/title")
    public boolean OroDocsAccessPage;

    @FindBy(className = "wy-body-for-nav")
    public WebElement newTap;



    public POM_UserStory10() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void oroDocs() {

        VyTrackPOM oro = new VyTrackPOM();

        oro.goTo();

        BrowserUtil.waitFor(1);

        oro.login("user22");

        BrowserUtil.waitFor(1);

        getHelp.click();

        BrowserUtil.waitFor(1);

        WebDriver driver = new ChromeDriver();
        BrowserUtil.waitFor(1);
        driver.get("https://doc.oroinc.com/");
        System.out.println("Page title is : " + driver.getTitle());

        oro.logOut();

        driver.close();




/*
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa3.vytrack.com/");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        System.out.println(driver.getTitle());
        driver.get("https://doc.oroinc.com/");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
        System.out.println(driver.getTitle());

*/
        //Assertions.assertEquals("Welcome to Oro Documentation", Driver.getDriver().getTitle());

        //oro.logOut();

        //oroDocsAccess.isDisplayed();
/*
        WebElement title = Driver.getDriver().findElement(By.xpath("/html/head/title"));

        String expectedMessage = "Welcome to Oro Documentation";
        String actualMessage = "";

        Assertions.assertEquals(expectedMessage,title.getText());
 */

    }

}






