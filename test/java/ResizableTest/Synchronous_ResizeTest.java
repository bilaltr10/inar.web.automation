package ResizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;

public class Synchronous_ResizeTest extends Hooks {
    int initialAreaResize, initialAreaResized,currentAreaResize,currentAreaResized;

    @Test
    public void synchronousResizePageTest() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnResizableElement();
        pages.getSynchronousResize().clickOnSynchronusResizeElement();
        BrowserUtils.scrollDownWithJavaScript(0, 400);


        initialAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        initialAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        pages.getSynchronousResize().usingJSResizeToResizableAndResizeOtherObj(30, 30);
        currentAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        currentAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        Assertions.assertNotEquals(initialAreaResize,currentAreaResize);
        Assertions.assertNotEquals(initialAreaResized,currentAreaResized);


        initialAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        initialAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        pages.getSynchronousResize().resizeBySideElementOfResizableAndResizeOtherObj(50, 50);
        currentAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        currentAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        Assertions.assertNotEquals(initialAreaResize,currentAreaResize);
        Assertions.assertNotEquals(initialAreaResized,currentAreaResized);





        initialAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        initialAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        pages.getSynchronousResize().resizeByBottomElementOfResizableAndResizeOtherObj(100,100);
        currentAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        currentAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        Assertions.assertNotEquals(initialAreaResize,currentAreaResize);
        Assertions.assertNotEquals(initialAreaResized,currentAreaResized);






        initialAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        initialAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        pages.getSynchronousResize().resizeByCrossElementOfResizableAndResizeOtherObj(150, 150);
        currentAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        currentAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        Assertions.assertNotEquals(initialAreaResize,currentAreaResize);
        Assertions.assertNotEquals(initialAreaResized,currentAreaResized);



        ///////////////////////////
        pages.getSynchronousResize().usingJSResizeToResizableAndResizeOtherObj(100,100);

        initialAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        initialAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        pages.getSynchronousResize().resizeBySideElementOfResizedByOtherObjElement(50,50);
        currentAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        currentAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        Assertions.assertEquals(initialAreaResize,currentAreaResize);
        Assertions.assertNotEquals(initialAreaResized,currentAreaResized);





        initialAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        initialAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        pages.getSynchronousResize().resizeByBottomElementOfResizedByOtherObjElement(100,100);
        currentAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        currentAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        Assertions.assertEquals(initialAreaResize,currentAreaResize);
        Assertions.assertNotEquals(initialAreaResized,currentAreaResized);






        initialAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        initialAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        pages.getSynchronousResize().resizeByCrossElementOfResizedByOtherObjElement(150,150);
        currentAreaResize=pages.getSynchronousResize().initialAreaOfResize();
        currentAreaResized=pages.getSynchronousResize().initialAreaOfResized();
        Assertions.assertEquals(initialAreaResize,currentAreaResize);
        Assertions.assertNotEquals(initialAreaResized,currentAreaResized);



    }
}
