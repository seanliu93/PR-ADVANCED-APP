package com.pradvanced.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class CareerFairActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_career_fair);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.career_fair, menu);
		return true;
	}

}
