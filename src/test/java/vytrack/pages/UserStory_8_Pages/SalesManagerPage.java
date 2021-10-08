package vytrack.pages.UserStory_8_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.utilities.BrowserUtil;
import vytrack.utilities.Driver;

public class SalesManagerPage {
    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[2]/a/span")
    private WebElement fleet;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[2]/div/div/ul/li[4]/a/span")
    private WebElement vodbtt;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div")
    private WebElement message;


    public SalesManagerPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void salesM(){

        fleet.click();
        BrowserUtil.waitFor(2);
        vodbtt.click();
        BrowserUtil.waitFor(3);


    }

    public String smM (){

       return message.getText();
    }


}
