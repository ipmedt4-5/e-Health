package com.example.e_health;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//button ezorg
		Button btn = (Button) findViewById(R.id.eZorg);
		btn.setOnClickListener(new View.OnClickListener() 
		{
		    public void onClick(View v) 
		    {
		    	Intent i = new Intent(MainActivity.this, Ezorg.class);
		    	startActivity(i);
		    }
		});	
		
		//button epublichealth
		Button eph = (Button) findViewById(R.id.ePublicHealth);
		eph.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
				Intent i = new Intent(MainActivity.this,EpublicHealth.class);
				startActivity(i);
				
			}
		});
		/*
		//button zorgondersteuning
				Button ezo = (Button) findViewById(R.id.eZorgOndersteuning);
				eph.setOnClickListener(new View.OnClickListener() 
				{
					public void onClick(View v) 
					{
						Intent i = new Intent(MainActivity.this,Ezonderondersteuning.class);
						startActivity(i);
						
					}
				});
				*/
				
		//button info
		ImageButton info = (ImageButton)findViewById(R.id.info);
		info.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,Help.class);
				startActivity(i);
				
			}
		});
		
	}
}
