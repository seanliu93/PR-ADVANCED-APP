package com.pradvanced.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ScheduleActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schedule_activity2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.schedule_activity2, menu);
		return true;
	}

}
