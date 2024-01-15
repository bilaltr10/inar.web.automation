package utils;


import ControlGroup.ToolBar;
import DatePicker.DisplayMultipleMonths;
import Dialog.ModalForm;
import Menu.Icons;
import ProgressBar.DownloadDialog;
import pages.Alert.Show_Confirm;
import pages.Alert.Show_Prompt;
import pages.AutoComplete.AccentFolding;
import pages.Draggable.Constrain_Movement;
import pages.Draggable.Draggable_DefaultFunction_Page;
import pages.Draggable.Events_Page;
import pages.Draggable.Handles;
import pages.Droppable.Accept;
import pages.Droppable.Revert_Draggable_Position;
import pages.HomePage;
import pages.IFrame.Normal;
import pages.Resizable.Synchronous_Resize;
import pages.Resizable.Text_Area;
import pages.Selectable.Serialize;
import pages.WebAutomationPage;

import javax.tools.Tool;

public class Pages {

    private Draggable_DefaultFunction_Page draggable_defaultFunction_page;
    private HomePage home;
    private WebAutomationPage webAutomationPage;
    private Constrain_Movement constrainMovement;
    private Handles handles_Page;
    private Events_Page events;

    private Accept accept_Page;
    private Revert_Draggable_Position revertDraggablePosition;
    private Synchronous_Resize synchronousResize;
    private Text_Area textArea;
    private Show_Confirm showConfirm;
    private Show_Prompt showPrompt;

    private Serialize serialize;
    private Normal normal;
    private AccentFolding accentFolding;
    private Icons icons;
    private DownloadDialog downloadDialog;
    private DisplayMultipleMonths displayMultipleMonths;
    private ToolBar toolBar;
    private ModalForm modalForm;

    public Pages() {
        draggable_defaultFunction_page = new Draggable_DefaultFunction_Page();
        home = new HomePage();
        webAutomationPage = new WebAutomationPage();
        constrainMovement = new Constrain_Movement();
        events = new Events_Page();
        handles_Page = new Handles();
        accept_Page = new Accept();
        revertDraggablePosition = new Revert_Draggable_Position();
        synchronousResize = new Synchronous_Resize();
        textArea = new Text_Area();
        showConfirm = new Show_Confirm();
        showPrompt = new Show_Prompt();
        serialize = new Serialize();
        normal = new Normal();
        accentFolding = new AccentFolding();
        icons = new Icons();
        downloadDialog = new DownloadDialog();
        displayMultipleMonths = new DisplayMultipleMonths();
        toolBar = new ToolBar();
        modalForm = new ModalForm();
    }


    public Draggable_DefaultFunction_Page getDraggableDefFuncPage() {
        return draggable_defaultFunction_page;
    }

    public HomePage getHomePage() {
        return home;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Constrain_Movement getConstrainMovementPage() {

        return constrainMovement;
    }

    public Events_Page getEventsPage() {
        return events;
    }

    public Handles getTheHandlesPage() {
        return handles_Page;
    }

    public Accept getAcceptPage() {
        return accept_Page;
    }

    public Revert_Draggable_Position getRevertDraggablePosition() {
        return revertDraggablePosition;
    }

    public Synchronous_Resize getSynchronousResize() {
        return synchronousResize;
    }

    public Text_Area getTextArea() {
        return textArea;
    }

    public Show_Prompt getShowPrompt() {
        return showPrompt;
    }

    public Show_Confirm getShowConfirm() {
        return showConfirm;
    }

    public Serialize getSerializePage() {
        return serialize;
    }

    public Normal getNormalPage() {
        return normal;
    }

    public AccentFolding getAccentFolding() {
        return accentFolding;
    }

    public Icons getIcons() {
        return icons;
    }

    public DownloadDialog getDownloadDialog() {
        return downloadDialog;
    }

    public DisplayMultipleMonths getDisplayMultipleMonths() {
        return displayMultipleMonths;
    }

    public ToolBar getToolBar() {
        return toolBar;
    }

    public ModalForm getModalForm() {
        return modalForm;
    }
}

