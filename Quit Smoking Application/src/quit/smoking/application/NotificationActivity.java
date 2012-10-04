/**
 * 
 */
package quit.smoking.application;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.Spinner;

/**
 * @author shaon
 *
 */
public class NotificationActivity extends Activity {
	    /** Called when the activity is first created. */
	    
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.notification);
	          
	        initializeView();
	        
	    }//end of onCreate()
	    
	    public void initializeView(){
	    	
		    try {
		    	
		    	
			} catch (Exception e) {
				
				Log.e("<--initializeViewLogin-->","Error in initializeViewSignUp" + e.toString());
				e.printStackTrace();
				
			}//end of exception handling
		    
		}//end of initializeView()
	    
	}//end of main class