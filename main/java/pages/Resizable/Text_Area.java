package pages.Resizable;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

public class Text_Area extends BasePage {

    @FindBy(xpath = "//a[text()='Textarea']")
    private WebElement textAreaElement;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]" +
            "/div[1]/div[3]/div[1]/div[9]/div[1]/div[1]/div[1]/div[3]")
    private WebElement resizableTextAreaTwoDimensionMoveElement;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]" +
            "/div[1]/div[3]/div[1]/div[1]" +
            "/div[1]/div[1]/div[3]/div[1]/div[9]/div[1]/div[1]/div[1]/div[2]")
    private WebElement resizableTextElementBottomBarElement;


    @FindBy(css = "div.page-content.d-flex.justify-content-center.align-items-start.bg-primary-light div.w-100.d-flex.justify-content-center.align-" +
            "items-center.bg-primary-light div.w-100.d-flex.justify-content-center.align-items-center div.page-container.w-100.weborder-home div.row div.p-0.ps-md-5.col-md-10:nth-child(2) " +
            "div.tab-content div.fade.tab-pane.active.show:nth-child(3) div.w-100.d-flex.justify-content-center.align-items-center.bg-primary-light.automation-tab div.w-100.d-flex.justify-content-center.align-items-center div.pt-5.w-100 div.row div.col-md-10 div.w-100.ps-md-5.tab-content " +
            "div.fade.tab-pane.active.show:nth-child(9) " +
            "div.w-100.d-flex.justify-content-center.align-items-center div.w-100.webautomation-tab-inner " +
            "div.ui-wrapper:nth-child(3) > div.ui-resizable-handle.ui-resizable-e:nth-child(2)")
    private WebElement resizableTextElementSideBarElement;

    @FindBy(css = ".ui-wrapper")
    private WebElement wrapperOfTextAreaElement;

    @FindBy(id = "resizable-text-area-res")
    private WebElement resizableTextArea;

    public void clickOnTexArea() {
        textAreaElement.click();
    }

    public void resizeElementTwoDimension(int xOffset, int yOffset) {
        actions.dragAndDropBy(resizableTextAreaTwoDimensionMoveElement, xOffset, yOffset).perform();
    }

    public void resizeElementFromBottom(int xOffset, int yOffset) {
        actions.dragAndDropBy(resizableTextElementBottomBarElement, xOffset, yOffset).release().perform();
    }

    public void resizeElementFromSide(int xOffset, int yOffset) {
        actions.dragAndDropBy(resizableTextElementSideBarElement, xOffset, yOffset).perform();
    }


    public void write(String str) {
        resizableTextArea.clear();

        resizableTextArea.sendKeys(str);
    }

    public String read() {
        return resizableTextArea.getAttribute("value");
    }

    public int xOffSetOfElement() {
        return resizableTextAreaTwoDimensionMoveElement.getLocation().getX();
    }

    public int yOffSetOfElement() {
        return resizableTextAreaTwoDimensionMoveElement.getLocation().getY();
    }
}
