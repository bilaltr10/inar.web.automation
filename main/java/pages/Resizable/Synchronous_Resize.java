package pages.Resizable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Draggable.Handles;
import pages.HomePage;
import utils.BrowserUtils;
import utils.Driver;

public class Synchronous_Resize extends HomePage {

    @FindBy(xpath = "//a[text()='Synchronus Resize']")
    private WebElement synchronusResizeElement;

    @FindBy(id = "resizable-synchr-resize")
    private WebElement resizableAndResizeOtherObjElement;

    @FindBy(xpath = "//h3[ text()='Resize']")
    private WebElement textInresizableAndResizeOtherObjElement;

    @FindBy(id = "also-synchr-resize")
    private WebElement resizedByOtherObjElement;

    @FindBy(xpath = "//h3[text()='will also resize']")
    private WebElement textInResizedByOtherObjElement;

    @FindBy(xpath = "//*[@id=\"resizable-synchr-resize\"]/div[1]")
    private WebElement sideBarOfResizableAndResizeOtherObjElement;

    @FindBy(xpath = "//*[@id=\"resizable-synchr-resize\"]/div[2]")
    private WebElement bottomBarOfResizableAndResizeOtherObjElement;

    @FindBy(xpath = "//*[@id=\"resizable-synchr-resize\"]/div[3]")
    private WebElement crossBarOfResizableAndResizeOtherObjElement;

    @FindBy(xpath = "//*[@id=\"also-synchr-resize\"]/div[1]")
    private WebElement sideBarOfResizedByOtherObjElement;

    @FindBy(xpath = "//*[@id=\"also-synchr-resize\"]/div[2]")
    private WebElement bottomBarOfResizedByOtherObjElement;

    @FindBy(xpath = "//*[@id=\"also-synchr-resize\"]/div[3]")
    private WebElement crossBarOfResizedByOtherObjElement;


    public void clickOnSynchronusResizeElement() {
        synchronusResizeElement.click();
    }


    public void resizeBySideElementOfResizableAndResizeOtherObj(int xOffset, int yOffset) {
        actions.dragAndDropBy(sideBarOfResizableAndResizeOtherObjElement, xOffset, yOffset).perform();
    }

    public void resizeByBottomElementOfResizableAndResizeOtherObj(int xOffset, int yOffset) {
        actions.dragAndDropBy(bottomBarOfResizableAndResizeOtherObjElement, xOffset, yOffset).perform();
    }

    public void resizeByCrossElementOfResizableAndResizeOtherObj(int xOffset, int yOffset) {
        actions.dragAndDropBy(crossBarOfResizableAndResizeOtherObjElement, xOffset, yOffset).perform();
    }

    public void resizeBySideElementOfResizedByOtherObjElement(int xOffset, int yOffset) {
        actions.dragAndDropBy(sideBarOfResizedByOtherObjElement, xOffset, yOffset).perform();
    }

    public void resizeByBottomElementOfResizedByOtherObjElement(int xOffset, int yOffset) {
        actions.dragAndDropBy(bottomBarOfResizedByOtherObjElement, xOffset, yOffset).perform();
    }

    public void resizeByCrossElementOfResizedByOtherObjElement(int xOffset, int yOffset) {
        actions.dragAndDropBy(crossBarOfResizedByOtherObjElement, xOffset, yOffset).perform();
    }

    public void usingJSResizeToResizableAndResizeOtherObj(int xOffSet, int yOffset) {
        BrowserUtils.wait(0.25);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].style.width = '" + xOffSet + "px';", resizedByOtherObjElement);
        js.executeScript("arguments[0].style.height = '" + yOffset + "px';", resizedByOtherObjElement);
        js.executeScript("arguments[0].style.width = '" + xOffSet + "px';", resizableAndResizeOtherObjElement);
        js.executeScript("arguments[0].style.height = '" + yOffset + "px';", resizableAndResizeOtherObjElement);
    }

    public int widthOfResizableAndResizeOtherObjElement() {
        return resizableAndResizeOtherObjElement.getSize().getWidth();
    }

    public int heightOfResizableAndResizeOtherObjElement() {
        return resizableAndResizeOtherObjElement.getSize().getHeight();
    }

    public int widthOfResizedByOtherObjElement() {
        return resizedByOtherObjElement.getSize().getWidth();
    }

    public int heightOfResizedByOtherObjElement() {
        return resizedByOtherObjElement.getSize().getHeight();
    }

    public int initialAreaOfResize() {
        BrowserUtils.wait(0.25);
        return resizableAndResizeOtherObjElement.getSize().getWidth() * resizableAndResizeOtherObjElement.getSize().getHeight();
    }

    public int initialAreaOfResized() {
        BrowserUtils.wait(0.25);
        return resizedByOtherObjElement.getSize().getWidth() * resizedByOtherObjElement.getSize().getHeight();
    }
}
