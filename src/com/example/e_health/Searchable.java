package com.example.e_health;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.EditText;
import android.widget.TextView;

public class Searchable extends Activity{
	
	
	MainActivity search = new MainActivity();
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchable);
		StrictMode.enableDefaults();// STRICT MODE ENABLED

		search.resultView = (TextView) findViewById(R.id.result2);	
		search.getData();



	}
		
		
		
}
