
package quit.smoking.application;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

/**
 * @author shaon
 *
 */

public class SurveyActivity extends Activity{
    /** Called when the activity is first created. */
    
    Spinner spinnerAge,spinnerHowlong,spinnerHowMany;
    CheckBox ckPleasure,ckNicotin,ckWeightLoss,ckRelaxation,ckBeingSmart,ckOther;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey);
          
        initializeView();
        
    }//end of onCreate()
    
    public void initializeView(){
    	
	    try {
	    	
	    	spinnerAge = (Spinner) findViewById(R.id.noti_spinner_age);
	    	spinnerHowlong = (Spinner) findViewById(R.id.noti_spinner_howlong);
	    	spinnerHowMany = (Spinner) findViewById(R.id.noti_spinner_howmany);
	    	
//	    	ArrayAdapter<CharSequence> adapterAge = ArrayAdapter.createFromResource(getApplicationContext(), R.array.age,R.id.noti_spinner_age);
//	    	adapterAge.setDropDownViewResource())
	    	
	    	
	    	ckPleasure = (CheckBox) findViewById(R.id.noti_checkBox_pleasure);
	    	ckNicotin = (CheckBox) findViewById(R.id.noti_checkBox_nicotin);
	    	ckWeightLoss = (CheckBox) findViewById(R.id.noti_checkBox_weightloss);
	    	ckRelaxation = (CheckBox) findViewById(R.id.noti_checkBox_relaxation);
	    	ckBeingSmart = (CheckBox) findViewById(R.id.noti_checkBox_beingsmart);
	    	ckOther = (CheckBox) findViewById(R.id.noti_checkBox_other);
	    	
		} catch (Exception e) {
			
			Log.e("<--initializeViewLogin-->","Error in initializeViewSignUp" + e.toString());
			e.printStackTrace();
			
		}//end of exception handling
	    
	}//end of initializeView()
    
}//end of main class
