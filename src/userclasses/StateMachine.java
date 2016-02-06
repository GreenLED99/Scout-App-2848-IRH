/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import com.mycompany.myapp.Vars;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
	protected void initVars(Resources res){
	
	String b = "test 2";
	}

    

    @Override
    protected void beforeMain(Form f) {
//    	String a = "Statistic One";
//    	com.codename1.ui.Label lbl = (com.codename1.ui.Label)findByName("testA", f);
//        lbl.setText(a);
//    	com.codename1.ui.ComboBox mn = (com.codename1.ui.ComboBox)findByName("match",f);
//    	if(mn.equals("Match #1")){
//    		lbl.setText("b");
//    	}
//    	else{
//    		lbl.setText("nope");
//    	}
    	
    }
    protected void changeDataMatchNum (Form f){
    	String a = "Statistic One";
    	com.codename1.ui.Label lbl = (com.codename1.ui.Label)findByName("testA", f);
        lbl.setText(a);
    }
}
