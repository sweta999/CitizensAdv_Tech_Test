package test.tech.citizensadv.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.tech.citizensadv.utility.Utility;

public class ImmigrationPage extends Utility {

    private static final Logger log = LogManager.getLogger(ImmigrationPage.class.getName());

    //Page Object Model
    By verifyImmigrationPage = By.xpath("//h1[contains(text(),'Immigration')]");
    By verifyStayingInTheUKLink = By.xpath("//a[contains(text(),'Staying in the UK on a visa without your partner')]");
    By clickOnStayingInTheUKLink = By.xpath("//a[contains(text(),'Staying in the UK on a visa without your partner')]");

//    @FindBy(xpath = "//h1[contains(text(),'Immigration')]")
//    WebElement verifyImmigrationPage;
//    @FindBy(xpath = "//a[contains(text(),'Staying in the UK on a visa without your partner')]")
//    WebElement verifyStayingInTheUKLink;

    public String immigrationPage() {
        log.info("Verifying the Text, Immigration : " + verifyImmigrationPage.toString());
        return getTextFromElement(verifyImmigrationPage);
    }

    public String StayingInTheUKLink() {
        log.info("Verifying the Link, Staying in the UK on a visa without your partner : " + verifyStayingInTheUKLink.toString());
        return getTextFromElement(verifyStayingInTheUKLink);
    }

    public void iClickOnStayingInTheUKLink() {
        clickOnElement(clickOnStayingInTheUKLink);
        log.info("Click on Staying in the UK on a visa link : " + clickOnStayingInTheUKLink.toString());
    }


}
