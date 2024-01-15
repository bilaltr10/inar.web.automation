package pages.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.Driver;

import static org.openqa.selenium.logging.LogType.DRIVER;

public class Show_Confirm extends BasePage {

	Alert alert;

	@FindBy(xpath = "//button[text()='Show Confirm']")
	private WebElement showConfirmElement;

	public void clickOnShowConfirmElement() {
		showConfirmElement.click();
	}

	public void switchToAlert() {
		alert = DRIVER.switchTo().alert();
	}

	public String getTheText() {
		switchToAlert();
		return alert.getText();
	}

	public void acceptTheAlert() {
		switchToAlert();
		alert.accept();
	}

	public void cancelTheAlert() {
		switchToAlert();
		alert.dismiss();
	}

}
