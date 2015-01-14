package com.example.e_health;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Ecare extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ecare);
		
		//button ZWEcare
		ImageButton zwec = (ImageButton) findViewById(R.id.zwecare);
		zwec.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Ecare.this, EcareZW.class);
			    startActivity(i);
			   }
		});	

	//button ZZEcare
		ImageButton zzec = (ImageButton) findViewById(R.id.zzecare);
		zzec.setOnClickListener(new View.OnClickListener() 
		{
			  public void onClick(View v) 
			  {
			    Intent i = new Intent(Ecare.this, EcareZZ.class);
			    startActivity(i);
			   }
		});	
	//button ZAEcare
		ImageButton zaec = (ImageButton) findViewById(R.id.zaecare);
		zaec.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Ecare.this, EcareZA.class);
			    startActivity(i);
			   }
		});	
		//button ZPEcare
		ImageButton zpec = (ImageButton) findViewById(R.id.zpecare);
		zpec.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Ecare.this, EcareZP.class);
			    startActivity(i);
			   }
		});	
		//button PLEcare
		ImageButton plec = (ImageButton) findViewById(R.id.plecare);
		plec.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Ecare.this, EcarePL.class);
			    startActivity(i);
			   }
		});	
		//button PPEcare
		ImageButton ppec = (ImageButton) findViewById(R.id.ppecare);
		ppec.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Ecare.this, EcarePP.class);
			    startActivity(i);
			   }
		});	
		//button PAEcare
		ImageButton paec = (ImageButton) findViewById(R.id.paecare);
		paec.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Ecare.this, EcarePA.class);
			    startActivity(i);
			   }
		});	
	}
}