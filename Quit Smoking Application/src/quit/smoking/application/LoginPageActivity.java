package quit.smoking.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class LoginPageActivity extends Activity {
    /** Called when the activity is first created. */
    
//    TextView tvLoginYourAccount,tvNotRegister,tvSocialNetwork;
    EditText etUsernameEmail,etPassword;
	Button btnlLogin,btnSignUp;
	ImageView btnFacebook,btnTwitter,btnGooglePlus;

	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
          
        initializeView();
    }
    
    
    public void initializeView(){
    	
	    try {
	    	
//	    		tvLoginYourAccount = (TextView) findViewById(R.id.login_textView_loginyouraccount);
//	    		tvNotRegister = (TextView) findViewById(R.id.login_textView_notregister);
//	    		tvSocialNetwork = (TextView) findViewById(R.id.login_textView_socialnetwork);
	    		
	    		
	    		
	    		etUsernameEmail = (EditText) findViewById(R.id.login_editText_usernameenmail);
	    		etPassword = (EditText) findViewById(R.id.login_editText_password);
				
				btnlLogin = (Button) findViewById(R.id.login_button_login);
				btnSignUp = (Button) findViewById(R.id.login_button_registration);
				
				btnFacebook = (ImageView) findViewById(R.id.login_button_facebooklogin);
				btnTwitter = (ImageView) findViewById(R.id.login_button_twitterlogin);
				btnGooglePlus = (ImageView) findViewById(R.id.login_button_googlelogin);
				
				
				/**
				 * event handler of btnLogin. it's the logic what will happen
				 * after clicking the button
				 */
				btnlLogin.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						
						Intent intentHomepage = new Intent(getApplication(),HomepageActivity.class);
						startActivity(intentHomepage);
						finish();
					}//end of onClick()
					
				});//end of btnLogin event handler
				
				
				/**
				 * Button Handler of btnRegPage
				 * After Pressing this button user will shift from this activity
				 * to Registration activity
				 */
				btnSignUp.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
					
						Intent intentSignup = new Intent(getApplication(),SignUpPageActivity.class);
						
						startActivity(intentSignup);
						
					}//end of onClick()
				});//end of btnRegPafe event handler
				
				btnFacebook.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Toast.makeText(getBaseContext(), "Login with Facebook", 1000).show();
					}
				});
				
				btnTwitter.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Toast.makeText(getBaseContext(), "Login with Twitter", 1000).show();
					}
				});
				
				btnGooglePlus.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Toast.makeText(getBaseContext(), "Login with GooglePlus", 1000).show();
					}
				});
								
		} catch (Exception e) {
			
			Log.e("<--initializeViewLogin-->","Error in initializeViewLogin" + e.toString());
			
		}//end of exception handling
	    
	}//end of initializeView()
    
}//end of main class
