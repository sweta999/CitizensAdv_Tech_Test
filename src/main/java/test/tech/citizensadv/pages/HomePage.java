package test.tech.citizensadv.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.tech.citizensadv.utility.Utility;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Page Object Model
    By citizensAdvicePopUp = By.xpath("//a[@class='home-extent-popup__link'][normalize-space()='England']");
    //div[@class='home-extent-popup__options']/a[1]");
    By verifyCitizensAdviceHomePage = By.xpath("//h1[contains(text(),'Welcome to Citizens Advice')]");
    By listOfItems = By.xpath("//nav[@id='main-nav']");
    By ImmigrationTab = By.xpath("//body/nav[@id='main-nav']/ul[1]/li[8]/a[1]");

//    Page Factory Model
//    @FindBy(xpath = "//div[@class='home-extent-popup__options']/a[1]")
//    WebElement citizensAdvicePopUp;
//    @FindBy(xpath = "//h1[contains(text(),'Welcome to Citizens Advice')]")
//    WebElement verifyCitizensAdviceHomePage;
//    @FindBy(xpath = "//nav[@id='main-nav']")
//    WebElement listOfItems;
//    @FindBy(xpath = "//body/nav[@id='main-nav']/ul[1]/li[8]/a[1]")
//    WebElement ImmigrationTab;

    public void setCitizensAdvicePopUp() {
        clickOnElement(citizensAdvicePopUp);
    }

    public String CitizensAdviceHomePage() {
        log.info("Verify Text, Welcome to Citizens Advice : " + verifyCitizensAdviceHomePage.toString());
        return getTextFromElement(verifyCitizensAdviceHomePage);
    }

    public void setListOfItems(String items) {
        log.info("Clicking on list of Items link" + listOfItems.toString() + "<br>");
        List<WebElement> elementList = driver.findElements(listOfItems);
        for (WebElement element : elementList) {
            System.out.println(element.getText());   // this is not required
            if (element.getText().equalsIgnoreCase(items)) {
                element.click();
                break;
            }
        }
    }

    public void setImmigrationTab() {
        log.info("Clicking on the Immigration Tab" + ImmigrationTab.toString() + "<br>");
        mouseHoverToElementAndClick(ImmigrationTab);

    }
}