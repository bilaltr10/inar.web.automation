package pages.IFrame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.security.Key;

public class Normal extends BasePage {

    @FindBy(xpath = "//a[text()='Normal Iframe']")
    private WebElement normalIFrameElement;

    @FindBy(xpath = "/html/body/div/p[2]/a")
    private WebElement clickableWebPage;

    @FindBy(xpath = "/html/body/div/h1")
    private WebElement headerInFrame;

    @FindBy(xpath = "(//iframe)[4]")
    private WebElement iFrameElement;


    public void clickOnNormalIFrame() {
        normalIFrameElement.click();
    }

    public void switchToIFrame() {
        DRIVER.switchTo().frame(normalIFrameElement);
    }

    public String getHeaderInFrame() {
        switchToIFrame();
        return headerInFrame.getText();
    }

    public void printTitle() {
        System.out.println(DRIVER.switchTo().frame(iFrameElement).getTitle());
    }

//    public boolean isClickAble(){
//        switchToIFrame();
//        return true;
//    }
}
