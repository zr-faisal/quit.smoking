/**
 * 
 */
package quit.smoking.application;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.audacity.qsa.Guideline;
import com.audacity.qsa.Materials;
import com.audacity.qsa.Status;
import com.audacity.qsa.TabListener;


/**
 * @author shaon
 *
 */
public class HomepageActivity extends Activity {

	Button btnNoti,btnSurvey,btnDepend,btnUniversal,btnAwareness,btnVirtual,
	btnDisease,btnLive,btnMedicine,btnGraphic;
	

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.homepage);
//          
//        initializeView();
        
        // code for adding tabs
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(false);
        
        Tab tab1 = actionBar.newTab().setText("Status").setTabListener(new TabListener<Status>(this, "status", Status.class));
        actionBar.addTab(tab1);
        
        Tab tab2 = actionBar.newTab().setText("Guideline").setTabListener(new TabListener<Guideline>(this, "guideline", Guideline.class));
        actionBar.addTab(tab2);
        
        Tab tab3 = actionBar.newTab().setText("Materials").setTabListener(new TabListener<Materials>(this, "materials", Materials.class));
        actionBar.addTab(tab3);
    }
    
    public void initializeView(){
    	
    	try {
			
    		btnNoti = (Button) findViewById(R.id.Homepage_button_notification);
    		
    		
    		
    		btnSurvey = (Button) findViewById(R.id.Homepage_button_survey);
    		
    		btnDepend = (Button) findViewById(R.id.Homepage_button_depending);
    		
    		btnUniversal  = (Button) findViewById(R.id.Homepage_button_universal);
    		
    		btnAwareness = (Button) findViewById(R.id.Homepage_button_awareness);
    		
    		btnVirtual = (Button) findViewById(R.id.Homepage_button_virtualsmoking);
    		
    		btnDisease = (Button) findViewById(R.id.Homepage_button_Disease);
    		
    		btnLive = (Button) findViewById(R.id.Homepage_button_LiveDoctor);
    		
    		btnMedicine = (Button) findViewById(R.id.Homepage_button_Medicine);
    		
    		btnGraphic = (Button) findViewById(R.id.Homepage_button_Graphical);
    		
			btnNoti.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentNotification = new Intent(getApplication(),NotificationActivity.class);
					startActivity(intentNotification);

				}//end of onClick()
				
			});//end of btnNoti event handler

			btnSurvey.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentSurvey = new Intent(getApplication(),SurveyActivity.class);
					
					startActivity(intentSurvey);
		
				}//end of onClick()
				
			});//end of btnSurvey event handler
			
			btnDepend.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentDepending = new Intent(getApplication(),DependingGuidelineActivity.class);
					
					startActivity(intentDepending);
		
				}//end of onClick()
				
			});//end of btnDepend event handler
			
			btnUniversal.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentUnivesal = new Intent(getApplication(),UniversalGuidelineActivity.class);
					
					startActivity(intentUnivesal);
		
				}//end of onClick()
				
			});//end of btnUniversal event handler
			
			btnAwareness.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentAwareness = new Intent(getApplication(),AwarenessActivity.class);
					
					startActivity(intentAwareness);
		
				}//end of onClick()
				
			});//end of btnAwareness event handler
			
			btnVirtual.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentVirtualSmoking = new Intent(getApplication(),VirtualSmokingActivity.class);
					
					startActivity(intentVirtualSmoking);
		
				}//end of onClick()
				
			});//end of btnVirtual event handler
			
			btnDisease.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentDisease = new Intent(getApplication(),DiseasePictureActivity.class);
					
					startActivity(intentDisease);
		
				}//end of onClick()
				
			});//end of btnDisease event handler
			
			btnLive.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentLiveDoctor = new Intent(getApplication(),LiveDoctorActivity.class);
					
					startActivity(intentLiveDoctor);
		
				}//end of onClick()
				
			});//end of btnLive event handler
			
			btnMedicine.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentMedicine = new Intent(getApplication(),MedicineDBActivity.class);
					
					startActivity(intentMedicine);
		
				}//end of onClick()
				
			});//end of btnMedicine event handler
			
			btnGraphic.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					
					Intent intentGraphic = new Intent(getApplication(),GraphicActivity.class);
					
					startActivity(intentGraphic);
		
				}//end of onClick()
				
			});//end of btnGraphic event handler
    	
					
//    		TabHost tabHost = getTabHost();
			//Tab for notification
//    		TabSpec notificationSpec = tabHost.newTabSpec("Notification");
//	    	notificationSpec.setIndicator("Notification",getResources().getDrawable(R.drawable.ic_launcher)); //Title and Image for the tab
//	    	Intent notificationIntent = new Intent(this,NotificationActivity.class);
//	    	notificationSpec.setContent(notificationIntent);
			//End of Tab for notification
//				tabHost.addTab(notificationSpec);
    		
    		
				
		} catch (Exception e) {
			
			Log.e("<--HomepageActivity-->","Error in Homepage " + e.toString());
			e.printStackTrace();
		}
	    
    }//end of method
	
}
