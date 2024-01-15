package ProgressBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

public class DownloadDialog extends BasePage {

    @FindBy(xpath = "//a[text()='Download Dialog']")
    private WebElement downloadDialogElement;

    @FindBy(id = "downloadButton-download-dialog")
    private WebElement startDownloadElement;

    @FindBy(xpath = "//*[@id=\"progressbar-download-dialog\"]")
    private WebElement currentDownloadProgress;

    @FindBy(id = "dialog-download-dialog")
    private WebElement downLoadTable;

    @FindBy(xpath = "//button[text()='Cancel Download']")
    private WebElement cancelTheDownloadElement;
    //add to pages


    public void clickOnDownloadDialogElement() {
        downloadDialogElement.click();
    }

    public void clickOnStartDownloadElement() {
        startDownloadElement.click();
        BrowserUtils.wait(1);
    }

    public void cancelTheDownloadElement() {
        cancelTheDownloadElement.click();
        BrowserUtils.wait(0.5);

    }

    public boolean isDownloadBarVisible() {
        return downLoadTable.isDisplayed();
    }

    public int currentDownloadPercentage() {
        BrowserUtils.wait(2.5);
        return Integer.parseInt(currentDownloadProgress.getAttribute("aria-valuenow"));
    }

}
