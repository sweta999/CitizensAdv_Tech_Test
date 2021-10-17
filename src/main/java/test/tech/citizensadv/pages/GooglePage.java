package test.tech.citizensadv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.tech.citizensadv.utility.Utility;

import java.util.List;

public class GooglePage extends Utility {

    //Page Object Model
    By googlePopUp = By.xpath("//div[contains(text(),'I agree')]");
    By googleSearchBox = By.name("q");
    By googleSearchButton = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']");
   //  /html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]   -->J not working in mine
    By CitizensAdviceLink = By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/cite[1]");
//*[@id="rso"]/div[1]/div/div/div/div/div/div/div[1]/a/div/cite   ->J

    public void setGooglePopUp() {
        clickOnElement(googlePopUp);
    }

    public void setGoogleSearchBox() {
        sendTextToElement(googleSearchBox,"Citizens Advice");

//        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
//        System.out.println("Total number of suggestions in search box: "+ list.size());
//
//        for(int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i).getText());
//            if (list.get(i).getText().contains("Citizens Advice")) {
//                list.get(i).click();
//                break;
//            }
//        }
    }


    public void setGoogleSearchButton() {
        clickOnElement(googleSearchButton);
    }

    public void setCitizensAdviceLink() {
        clickOnElement(CitizensAdviceLink);
    }


}
