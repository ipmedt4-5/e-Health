package com.example.e_health;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ezorg extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ezorg);
		
		//button ediagnose
		Button eDiag =(Button) findViewById(R.id.eDiagnose);
		eDiag.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
		    		Intent i = new Intent(Ezorg.this, Ediagnose.class);
		    		startActivity(i);
			}
		});
		
		//button ecare
		Button eCare =(Button) findViewById(R.id.eCare);
		eCare.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{
		    		Intent i = new Intent(Ezorg.this, Ecare.class);
		    		startActivity(i);
			}
		});
		
		//button etherapie
		Button eTher =(Button) findViewById(R.id.eTherapie);
		eTher.setOnClickListener(new View.OnClickListener() 
				{
					public void onClick(View v) 
					{
				    		Intent i = new Intent(Ezorg.this, Etherapie.class);
				    		startActivity(i);
					}
				});
		}
	}
