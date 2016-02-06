/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("AutoCompleteTextField", com.codename1.ui.AutoCompleteTextField.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Slider", com.codename1.ui.Slider.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "GUI 1";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("AutoCompleteTextField", com.codename1.ui.AutoCompleteTextField.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Slider", com.codename1.ui.Slider.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "GUI 1");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField7(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField7", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField7() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField6(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField6", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField6() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField5(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField5", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField5() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer5(Component root) {
        return (com.codename1.ui.Container)findByName("Container5", root);
    }

    public com.codename1.ui.Container findContainer5() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton2(Component root) {
        return (com.codename1.ui.Button)findByName("Button2", root);
    }

    public com.codename1.ui.Button findButton2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea", root);
    }

    public com.codename1.ui.TextArea findTextArea() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Slider findSlider(Component root) {
        return (com.codename1.ui.Slider)findByName("Slider", root);
    }

    public com.codename1.ui.Slider findSlider() {
        com.codename1.ui.Slider cmp = (com.codename1.ui.Slider)findByName("Slider", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Slider)findByName("Slider", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer51(Component root) {
        return (com.codename1.ui.Container)findByName("Container51", root);
    }

    public com.codename1.ui.Container findContainer51() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container51", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container51", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField3(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField3", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField3() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField4(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField4", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField4() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField1(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField1", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField1() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField2(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField2", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField2() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findTestA(Component root) {
        return (com.codename1.ui.Label)findByName("testA", root);
    }

    public com.codename1.ui.Label findTestA() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("testA", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("testA", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton14(Component root) {
        return (com.codename1.ui.Button)findByName("Button14", root);
    }

    public com.codename1.ui.Button findButton14() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button14", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button14", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton13(Component root) {
        return (com.codename1.ui.Button)findByName("Button13", root);
    }

    public com.codename1.ui.Button findButton13() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button13", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button13", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton12(Component root) {
        return (com.codename1.ui.Button)findByName("Button12", root);
    }

    public com.codename1.ui.Button findButton12() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton11(Component root) {
        return (com.codename1.ui.Button)findByName("Button11", root);
    }

    public com.codename1.ui.Button findButton11() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findTestB(Component root) {
        return (com.codename1.ui.Label)findByName("testB", root);
    }

    public com.codename1.ui.Label findTestB() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("testB", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("testB", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainViewMore = 6;
    public static final int COMMAND_SecondBACK = 1;
    public static final int COMMAND_GUI1ViewData = 4;

    protected boolean onMainViewMore() {
        return false;
    }

    protected boolean onSecondBACK() {
        return false;
    }

    protected boolean onGUI1ViewData() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainViewMore:
                if(onMainViewMore()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SecondBACK:
                if(onSecondBACK()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_GUI1ViewData:
                if(onGUI1ViewData()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("GUI 1".equals(f.getName())) {
            exitGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Second".equals(f.getName())) {
            exitSecond(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitMain(Form f) {
    }


    protected void exitGUI1(Form f) {
    }


    protected void exitSecond(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("GUI 1".equals(f.getName())) {
            beforeGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Second".equals(f.getName())) {
            beforeSecond(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeMain(Form f) {
    }


    protected void beforeGUI1(Form f) {
    }


    protected void beforeSecond(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("GUI 1".equals(c.getName())) {
            beforeContainerGUI1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Second".equals(c.getName())) {
            beforeContainerSecond(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerMain(Container c) {
    }


    protected void beforeContainerGUI1(Container c) {
    }


    protected void beforeContainerSecond(Container c) {
    }

    protected void postShow(Form f) {
        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("GUI 1".equals(f.getName())) {
            postGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Second".equals(f.getName())) {
            postSecond(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postMain(Form f) {
    }


    protected void postGUI1(Form f) {
    }


    protected void postSecond(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("GUI 1".equals(c.getName())) {
            postContainerGUI1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Second".equals(c.getName())) {
            postContainerSecond(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerMain(Container c) {
    }


    protected void postContainerGUI1(Container c) {
    }


    protected void postContainerSecond(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

        if("GUI 1".equals(rootName)) {
            onCreateGUI1();
            aboutToShowThisContainer = null;
            return;
        }

        if("Second".equals(rootName)) {
            onCreateSecond();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateMain() {
    }


    protected void onCreateGUI1() {
    }


    protected void onCreateSecond() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("GUI 1".equals(f.getName())) {
            getStateGUI1(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Second".equals(f.getName())) {
            getStateSecond(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateMain(Form f, Hashtable h) {
    }


    protected void getStateGUI1(Form f, Hashtable h) {
    }


    protected void getStateSecond(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("GUI 1".equals(f.getName())) {
            setStateGUI1(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Second".equals(f.getName())) {
            setStateSecond(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void setStateGUI1(Form f, Hashtable state) {
    }


    protected void setStateSecond(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Main")) {
            if("TextArea".equals(c.getName())) {
                onMain_TextAreaAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onMain_Button1Action(c, event);
                return;
            }
            if("AutoCompleteTextField1".equals(c.getName())) {
                onMain_AutoCompleteTextField1Action(c, event);
                return;
            }
            if("AutoCompleteTextField2".equals(c.getName())) {
                onMain_AutoCompleteTextField2Action(c, event);
                return;
            }
            if("AutoCompleteTextField3".equals(c.getName())) {
                onMain_AutoCompleteTextField3Action(c, event);
                return;
            }
            if("AutoCompleteTextField6".equals(c.getName())) {
                onMain_AutoCompleteTextField6Action(c, event);
                return;
            }
            if("AutoCompleteTextField7".equals(c.getName())) {
                onMain_AutoCompleteTextField7Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onMain_Button2Action(c, event);
                return;
            }
            if("Button11".equals(c.getName())) {
                onMain_Button11Action(c, event);
                return;
            }
            if("AutoCompleteTextField4".equals(c.getName())) {
                onMain_AutoCompleteTextField4Action(c, event);
                return;
            }
            if("Button12".equals(c.getName())) {
                onMain_Button12Action(c, event);
                return;
            }
            if("Button13".equals(c.getName())) {
                onMain_Button13Action(c, event);
                return;
            }
            if("Button14".equals(c.getName())) {
                onMain_Button14Action(c, event);
                return;
            }
            if("AutoCompleteTextField5".equals(c.getName())) {
                onMain_AutoCompleteTextField5Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("GUI 1")) {
            if("Button".equals(c.getName())) {
                onGUI1_ButtonAction(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onGUI1_Button2Action(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onGUI1_Button1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Second")) {
            if("Button".equals(c.getName())) {
                onSecond_ButtonAction(c, event);
                return;
            }
            if("TextArea".equals(c.getName())) {
                onSecond_TextAreaAction(c, event);
                return;
            }
        }
    }

      protected void onMain_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onMain_Button1Action(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextField1Action(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextField2Action(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextField3Action(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextField6Action(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextField7Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button2Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button11Action(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextField4Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button12Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button13Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button14Action(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextField5Action(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_Button2Action(Component c, ActionEvent event) {
      }

      protected void onGUI1_Button1Action(Component c, ActionEvent event) {
      }

      protected void onSecond_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onSecond_TextAreaAction(Component c, ActionEvent event) {
      }

}
