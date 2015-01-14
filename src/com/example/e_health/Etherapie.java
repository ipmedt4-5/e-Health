package com.example.e_health;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Etherapie extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.etherapie);
		
		//button zwetherapie
		ImageButton zwet = (ImageButton) findViewById(R.id.zwetherapie);
		zwet.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Etherapie.this, EtherapieZW.class);
			    startActivity(i);
			   }
		});	

	//button ZZetherapie
		ImageButton zzet = (ImageButton) findViewById(R.id.zzetherapie);
		zzet.setOnClickListener(new View.OnClickListener() 
		{
			  public void onClick(View v) 
			  {
			    Intent i = new Intent(Etherapie.this, EtherapieZZ.class);
			    startActivity(i);
			   }
		});	
	//button ZAetherapie
		ImageButton zaet = (ImageButton) findViewById(R.id.zaetherapie);
		zaet.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Etherapie.this, EtherapieZA.class);
			    startActivity(i);
			   }
		});	
		//button ZPetherapie
		ImageButton zpet = (ImageButton) findViewById(R.id.zpetherapie);
		zpet.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Etherapie.this, EtherapieZP.class);
			    startActivity(i);
			   }
		});	
		//button PLetherapie
		ImageButton plet = (ImageButton) findViewById(R.id.pletherapie);
		plet.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Etherapie.this, EtherapiePL.class);
			    startActivity(i);
			   }
		});	
		//button PPetherapie
		ImageButton ppet = (ImageButton) findViewById(R.id.ppetherapie);
		ppet.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Etherapie.this, EtherapiePP.class);
			    startActivity(i);
			   }
		});	
		//button PAetherapie
		ImageButton paet = (ImageButton) findViewById(R.id.paetherapie);
		paet.setOnClickListener(new View.OnClickListener() 
		{
		   public void onClick(View v) 
			  {
			    Intent i = new Intent(Etherapie.this, EtherapiePA.class);
			    startActivity(i);
			   }
		});	
	}
}



