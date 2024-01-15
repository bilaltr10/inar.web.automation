package ControlGroupTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;

import java.util.Arrays;

public class ToolBarTest extends Hooks {

    @Test
    public void toolBarTest() {
        //
        pages.getHomePage().clickOnWebAutomationLink();

        //
        pages.getWebAutomationPage().clickOnControlGroupElement();

        //
        pages.getToolBar().clickOnToolBar();

        //make the zoom of text %200 and verify that current text zoom is %150;
        pages.getToolBar().setZoom("150%");
        //make the background yellow and verify
        pages.getToolBar().setHighlightColor("Red");
        //make the color red and verify
        pages.getToolBar().setColorOfText("Yellow");
        //make the text bold and verify
        pages.getToolBar().clickOnBoldElement();
        //make the text italic and verify
        pages.getToolBar().clickOnItalicElement();
        //make the text underlined and verify
        pages.getToolBar().clickOnUnderlineElement();
        BrowserUtils.wait(3);


        Assertions.assertEquals("150%", pages.getToolBar().currentZoom() );
        Assertions.assertEquals("red", pages.getToolBar().currentBackGroundColor() );
        Assertions.assertEquals("yellow", pages.getToolBar().currentColor() );
        Assertions.assertEquals("italic", pages.getToolBar().currentFontStyle() );
        Assertions.assertEquals("bold", pages.getToolBar().currentFontWeight() );
        Assertions.assertEquals("underline", pages.getToolBar().currentTextDecoration() );




    }
}
