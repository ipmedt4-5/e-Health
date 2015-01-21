package com.example.e_health;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;
import android.content.Intent;

import java.sql.SQLException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends Activity  {

	TextView resultView;


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		//button zoek
		Button zoek = (Button) findViewById(R.id.button1);
		zoek.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
			{	

				Intent search = new Intent(MainActivity.this, Searchable.class);
				startActivity(search);
			}
		});	
		
		
		
		
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
	
	public void getData() {
		String result = "";
		InputStream isr = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost("http://ehealth.esy.es/ecare.php"); // YOUR
																					// PHP
																					// SCRIPT
																					// ADDRESS
			
			
			
			// HttpPost httppost = new
			// HttpPost("http://172.23.193.32/elift-test/myfile.php"); //YOUR
			// PHP SCRIPT ADDRESS
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			isr = entity.getContent();
		} catch (Exception e) {
			Log.e("log_tag", "Error in http connection " + e.toString());

			resultView.setText("Couldnt connect to database");

		}

		// convert response to string

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					isr, "iso-8859-1"), 8);

			StringBuilder sb = new StringBuilder();

			String line = null;

			while ((line = reader.readLine()) != null) {

				sb.append(line + "\n");

			}

			isr.close();

			result = sb.toString();

		}

		catch (Exception e) {

			Log.e("log_tag", "Error  converting result " + e.toString());

		}

		// parse json data

		try {

			String s = "";
			JSONArray jArray = new JSONArray(result);

			for (int i = 0; i < jArray.length(); i++) {

				JSONObject json = jArray.getJSONObject(i);

				s = json.getString("zorgverlener_zorgverlener") + "\n\n";

			}
           
			resultView.setText(s);
			
		} catch (Exception e) {

			// TODO: handle exception

			Log.e("log_tag", "Error Parsing Data " + e.toString());

		}

	}
	
	
}
