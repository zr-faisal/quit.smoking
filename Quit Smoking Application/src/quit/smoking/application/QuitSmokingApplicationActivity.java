package quit.smoking.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class QuitSmokingApplicationActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 new Handler().postDelayed(new Runnable() {
			
        	public void run() {

        			final Intent loginIntent = new Intent(getApplicationContext(),LoginPageActivity.class);
					startActivity(loginIntent);
					finish();
					
			}
		}, 3000); //end of postDelayed()
        
    }//end of onCreate()
}