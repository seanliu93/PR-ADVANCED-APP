package com.pradvanced.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);

		Button button4 = (Button) findViewById(R.id.button4);

		Button button6 = (Button) findViewById(R.id.button6);

		
        button1.setOnClickListener(new View.OnClickListener() {
        	
        	public void onClick(View v) {
        		
        	startActivity(new Intent(HomeActivity.this,ScheduleActivity2.class));
        	}
        });
        
        button2.setOnClickListener(new View.OnClickListener() {
        	
        	public void onClick(View v) {
        		
        	startActivity(new Intent(HomeActivity.this,BiosActivity.class));
        	}
        });

        
        button4.setOnClickListener(new View.OnClickListener() {
        	
        	public void onClick(View v) {
        		
        	startActivity(new Intent(HomeActivity.this,CareerFairActivity.class));
        	}
        });
        

        
        button6.setOnClickListener(new View.OnClickListener() {
        	
        	public void onClick(View v) {
        		
        	startActivity(new Intent(HomeActivity.this,SurveyActivity.class));
        	}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
