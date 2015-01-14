package com.example.e_health;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EpublicHealth extends Activity
	{
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.epublichealth);
			/*
			//button evoorlichting
			Button eDiag =(Button) findViewById(R.id.eVoorlichting);
			eDiag.setOnClickListener(new View.OnClickListener() 
			{
				public void onClick(View v) 
				{
			    		Intent i = new Intent(EpublicHealth.this, Evoorlichting.class);
			    		startActivity(i);
				}
			});
			
			//button epreventie
			Button eCare =(Button) findViewById(R.id.ePreventie);
			eCare.setOnClickListener(new View.OnClickListener() 
			{
				public void onClick(View v) 
				{
			    		Intent i = new Intent(EpublicHealth.this, Epreventie.class);
			    		startActivity(i);
				}
			});
			*/
		}
	}