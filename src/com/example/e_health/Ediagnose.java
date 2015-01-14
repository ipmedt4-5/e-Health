package com.example.e_health;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ediagnose extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ediagnose);
		
		//button ZWEDIAGNOSE
			ImageButton zwed = (ImageButton) findViewById(R.id.zwediagnose);
			zwed.setOnClickListener(new View.OnClickListener() 
			{
			   public void onClick(View v) 
				  {
				    Intent i = new Intent(Ediagnose.this, EdiagnoseZW.class);
				    startActivity(i);
				   }
			});	

		//button ZZEDIAGNOSE
			ImageButton zzed = (ImageButton) findViewById(R.id.zzediagnose);
			zzed.setOnClickListener(new View.OnClickListener() 
			{
				  public void onClick(View v) 
				  {
				    Intent i = new Intent(Ediagnose.this, EdiagnoseZZ.class);
				    startActivity(i);
				   }
			});	
		//button ZAEDIAGNOSE
			ImageButton zaed = (ImageButton) findViewById(R.id.zaediagnose);
			zaed.setOnClickListener(new View.OnClickListener() 
			{
			   public void onClick(View v) 
				  {
				    Intent i = new Intent(Ediagnose.this, EdiagnoseZA.class);
				    startActivity(i);
				   }
			});	
			//button ZPEDIAGNOSE
			ImageButton zped = (ImageButton) findViewById(R.id.zpediagnose);
			zped.setOnClickListener(new View.OnClickListener() 
			{
			   public void onClick(View v) 
				  {
				    Intent i = new Intent(Ediagnose.this, EdiagnoseZP.class);
				    startActivity(i);
				   }
			});	
			//button PLEDIAGNOSE
			ImageButton pled = (ImageButton) findViewById(R.id.plediagnose);
			pled.setOnClickListener(new View.OnClickListener() 
			{
			   public void onClick(View v) 
				  {
				    Intent i = new Intent(Ediagnose.this, EdiagnosePL.class);
				    startActivity(i);
				   }
			});	
			//button PPEDIAGNOSE
			ImageButton pped = (ImageButton) findViewById(R.id.ppediagnose);
			pped.setOnClickListener(new View.OnClickListener() 
			{
			   public void onClick(View v) 
				  {
				    Intent i = new Intent(Ediagnose.this, EdiagnosePP.class);
				    startActivity(i);
				   }
			});	
			//button PAEDIAGNOSE
			ImageButton paed = (ImageButton) findViewById(R.id.paediagnose);
			paed.setOnClickListener(new View.OnClickListener() 
			{
			   public void onClick(View v) 
				  {
				    Intent i = new Intent(Ediagnose.this, EdiagnosePA.class);
				    startActivity(i);
				   }
			});	
	}
}
