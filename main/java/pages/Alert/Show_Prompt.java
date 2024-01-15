package pages.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Show_Prompt extends BasePage {

	Alert alert;

	@FindBy(xpath = "//button[text()='Show Prompt']")
	private WebElement showPromptElement;

	public void clickOnShowPrompt() {
		showPromptElement.click();
	}

	public void switchToAlert() {
		alert = DRIVER.switchTo().alert();
	}

	public String getText() {
		switchToAlert();
		return alert.getText();
	}

	public void sendKeys(String keys) {
		switchToAlert();
		alert.sendKeys(keys);
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
