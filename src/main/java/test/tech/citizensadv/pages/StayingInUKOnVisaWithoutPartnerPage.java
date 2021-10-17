package test.tech.citizensadv.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.tech.citizensadv.utility.Utility;

public class StayingInUKOnVisaWithoutPartnerPage extends Utility {

    private static final Logger log = LogManager.getLogger(StayingInUKOnVisaWithoutPartnerPage.class.getName());

    //Page Object Model
    By verifyStayingInUKOnVisaPage = By.xpath("//a[contains(text(),'Staying in the UK on a visa without your partner')]");
    By verifyImmigartionRelatedHelp = By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/main[1]/h1[1]/span[1]/span[1]");
          // OR  -->   //a[contains(text(),'search for an immigration adviser')]

//    @FindBy(xpath = "//a[contains(text(),'search for an immigration adviser')]")
//    WebElement verifyStayingInUKOnVisaPage;
//    @FindBy(xpath = "//body/div[1]/div[4]/div[1]/div[1]/div[1]/main[1]/h1[1]/span[1]/span[1]")
//    WebElement verifyImmigrationRelatedHelp;

    public String verifyStayingInUKOnVisaPage(){
        log.info("Verifying the Text, Staying in the UK on a visa without your partner : " + verifyStayingInUKOnVisaPage.toString());
        return getTextFromElement(verifyStayingInUKOnVisaPage);
    }

    public String verifyImmigrationRelatedHelp() {
        log.info("Verifying the Link, search for an immigration adviser : " + verifyImmigartionRelatedHelp.toString());
        return getTextFromElement(verifyImmigartionRelatedHelp);
    }

}
