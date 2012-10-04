package com.audacity.qsa;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class TabListener<T extends Fragment> implements ActionBar.TabListener {
	
	private Fragment mFragment;
	private final Activity mActivity;
	private final String mTag;
	private final Class<T> mClass;
	
	public TabListener(Activity act, String tag, Class<T> cls) {
		
		mActivity = act;
		mTag = tag;
		mClass = cls;
	}

	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		if(mFragment == null) {
			
			mFragment = Fragment.instantiate(mActivity, mClass.getName());
			ft.add(android.R.id.content, mFragment, mTag);
		}
		else {
			
			ft.attach(mFragment);
		}
	}

	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		if(mFragment != null) {
			
			ft.detach(mFragment);
		}
	}

}
