package pages.IFrame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.security.Key;

public class Normal extends BasePage {

	@FindBy(id = "nestedIframe")
	private WebElement iFrameElement;

	@FindBy(css = "h1")
	private WebElement headerInFrame;

	@FindBy(css = "a")
	private WebElement link;

	public void switchToIFrame() {
		DRIVER.switchTo().frame(iFrameElement);
	}

	public String getHeaderInFrame() {
		// switchToIFrame();
		return headerInFrame.getText();
	}

	public void clickLinkInFrame() {
		// switchToIFrame();
		link.click();
	}

	public String getLinkTextInFrame() {
		// switchToIFrame();
		return link.getText();
	}

	public String getLinkInFrame() {
		// switchToIFrame();
		return link.getAttribute("href");
	}

	public void switchToParentFrame() {
		DRIVER.switchTo().parentFrame();
	}

	public void clickOnNormalIFrame() {
		iFrameElement.click();
	}

}
