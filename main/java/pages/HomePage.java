package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(linkText = "//a[@href='/weborder']")
    WebElement webOrderLink;

    @FindBy(xpath ="//a[@href='/webautomation']")
    private WebElement webAutomationElement;

    @FindBy(linkText = "//a[@href='/target-market']")
    WebElement targetMarketElement;

    @FindBy(linkText = "booking")
    WebElement bookingElement;

    @FindBy(xpath= "//a[contains(text(),'Handling Certifications')]")
    WebElement handlingCertificationsElement;

    @FindBy(xpath = "//a[contains(text(),'File Uploading')]")
    WebElement fileUploadingElement;

    @FindBy(tagName = "h1")
    WebElement textOfExploreInarsTestingWorldElement;

    public void clinkOnWebOrderLink() {
        webOrderLink.click();
    }
    public void clickOnWebAutomationLink(){
        webAutomationElement.click();
    }

    public void clickOnTargetMarketElement(){
        targetMarketElement.click();
    }
    public void clickObBooking(){
        bookingElement.click();
    }

    public void clickOnHandlingCertificationsElement(){
        handlingCertificationsElement.click();
    }

    public void clickOnFileUploadingElement(){
        fileUploadingElement.click();
    }

    public String textOfExploreInarsTestingWorldElement(){
        return  textOfExploreInarsTestingWorldElement.getText();
    }
}
