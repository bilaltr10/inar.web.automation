package DialogTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class ModalFormTest extends Hooks {

	@Test
	public void modalFormTest() {

		//
		pages.getHomePage().clickOnWebAutomationLink();

		//
		BrowserUtils.scrollDownWithJavaScript(0, 200);
		pages.getWebAutomationPage().clickOnDialogElement();

		//
		pages.getModalForm().clickOnModalFormElement();

		//
		pages.getModalForm().clickOnCreateAccountElement();
		pages.getModalForm().setTheAccountInfos("ally", "emny", "xxx@gmail.com");
		pages.getModalForm().cleanTheInfos();

		pages.getModalForm().clickOnCreateAccountElement();
		pages.getModalForm().setTheAccountInfos("bron", "funnd", "yyy@gmail.com");

		pages.getModalForm().cleanTheInfos();

		pages.getModalForm().clickOnCreateAccountElement();
		pages.getModalForm().setTheAccountInfos("cyle", "gylu", "zzz@gmail.com");
		pages.getModalForm().cleanTheInfos();

		pages.getModalForm().clickOnCreateAccountElement();
		pages.getModalForm().setTheAccountInfos("diver", "hymnu", "ggg@gmail.com");
		pages.getModalForm().cleanTheInfos();

		// verify that infos added to Users Data;
		List<String> userInfo = pages.getModalForm().getUserData();

		Assertions.assertEquals("allyemnyxxx@gmail.com", userInfo.get(1));
		Assertions.assertEquals("bronfunndyyy@gmail.com", userInfo.get(2));
		Assertions.assertEquals("cylegyluzzz@gmail.com", userInfo.get(3));
		Assertions.assertEquals("diverhymnuggg@gmail.com", userInfo.get(4));

	}

}
