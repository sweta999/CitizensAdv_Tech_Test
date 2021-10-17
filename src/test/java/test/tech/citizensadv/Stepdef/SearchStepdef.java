package test.tech.citizensadv.Stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import test.tech.citizensadv.pages.GooglePage;
import test.tech.citizensadv.pages.HomePage;
import test.tech.citizensadv.pages.ImmigrationPage;
import test.tech.citizensadv.pages.StayingInUKOnVisaWithoutPartnerPage;

public class SearchStepdef {

    @Given("^I am on Google page$")
    public void iAmOnGooglePage() {
    }

    @And("^I click on I agree PopUp$")
    public void iClickOnIAgreePopUp() {
        new GooglePage().setGooglePopUp();
    }

    @When("^I input text Citizens Advice in search box$")
    public void iInputTextCitizensAdviceInSearchBox() {
        new GooglePage().setGoogleSearchBox();
    }

    @And("^I click google search button$")
    public void iClickGoogleSearchButton() {
        new GooglePage().setGoogleSearchButton();
    }

    @And("^I click on the Citizens Advice Link$")
    public void iClickOnTheCitizensAdviceLink() {
        new GooglePage().setCitizensAdviceLink();
    }

    @Then("^I should be navigated to Citizens Advice Website$")
    public void iShouldBeNavigatedToCitizensAdviceWebsite() {
    }

    @And("^I click England as option$")
    public void iClickEnglandAsOption()  {
        new HomePage().setCitizensAdvicePopUp();
    }

    @And("^I am on Citizens Advice home page with England Selected$")
    public void iAmOnCitizensAdviceHomePageWithEnglandSelected() {
        Assert.assertEquals("Welcome to Citizens Advice", new HomePage().CitizensAdviceHomePage());
    }

    @And("^I am able to see the list of items$")
    public void iAmAbleToSeeTheListOfItems() {
    }

    @Then("^Verify list of items \"([^\"]*)\" on the main navigation header of the home page\\.$")
    public void verifyListOfItemsOnTheMainNavigationHeaderOfTheHomePage(String items)  {
        new HomePage().setListOfItems(items);
    }

    @When("^I click on Immigration tab$")
    public void iClickOnImmigrationTab() {
        new HomePage().setImmigrationTab();
    }

    @And("^Verify I am navigated to Immigration page$")
    public void verifyIAmNavigatedToImmigrationPage() {
        Assert.assertEquals("Immigration", new ImmigrationPage().immigrationPage());
    }

    @And("^Verify search results contain a link Staying in the UK on a visa without your partner$")
    public void verifySearchResultsContainALinkStayingInTheUKOnAVisaWithoutYourPartner() {
        Assert.assertEquals("Staying in the UK on a visa without your partner", new ImmigrationPage().StayingInTheUKLink());
    }

    @And("^I click on Staying in the UK on a visa without your partner link$")
    public void iClickOnStayingInTheUKOnAVisaWithoutYourPartnerLink() throws InterruptedException {
        Thread.sleep(3000);
        new ImmigrationPage().iClickOnStayingInTheUKLink();
    }

    @And("^I am navigated to Staying in the UK on a visa without your partner page$")
    public void iAmNavigatedToStayingInTheUKOnAVisaWithoutYourPartnerPage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Staying in the UK on a visa without your partner", new StayingInUKOnVisaWithoutPartnerPage().verifyStayingInUKOnVisaPage());
    }

    @Then("^Verify I can see immigration related help under main immigration section$")
    public void verifyICanSeeImmigrationRelatedHelpUnderMainImmigrationSection() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("search for an immigration adviser", new StayingInUKOnVisaWithoutPartnerPage().verifyImmigrationRelatedHelp());
    }



}
