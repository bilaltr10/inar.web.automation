package ProgressBarTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;

public class DownloadDialogTest extends Hooks {

	@Test
	public void downloadDialogTest() {

		// navigate to home page and click on Web-automation
		pages.getHomePage().clickOnWebAutomationLink();
		// navigate to progress element
		BrowserUtils.scrollDownWithJavaScript(0, 600);
		pages.getWebAutomationPage().clickOnProgressBarElement();
		BrowserUtils.scrollDownWithJavaScript(0, -400);
		// navigate to DownloadDialogElement
		pages.getDownloadDialog().clickOnDownloadDialogElement();
		// start the download
		pages.getDownloadDialog().clickOnStartDownloadElement();

		// verify download page visible
		boolean expected = true;
		boolean actual = pages.getDownloadDialog().isDownloadBarVisible();
		Assertions.assertEquals(expected, actual, "Clicked on 'start download bar" + " so download should start'");

		// verify that current percentage is between 0 and 100;
		int currentDownloadProgress = pages.getDownloadDialog().currentDownloadPercentage();
		Assertions.assertTrue(currentDownloadProgress >= 0 && currentDownloadProgress <= 100);

		// close the download by clicking cancel button verify download stopped
		pages.getDownloadDialog().cancelTheDownloadElement();
		boolean isDownloadStopped = false;
		boolean actualDownload = pages.getDownloadDialog().isDownloadBarVisible();
		Assertions.assertEquals(isDownloadStopped, actualDownload,
				"Clicked on cancel so download must stop and " + "close the download bar ");

	}

}
