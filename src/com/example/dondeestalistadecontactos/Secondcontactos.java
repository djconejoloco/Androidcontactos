package com.example.dondeestalistadecontactos;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Secondcontactos extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondcontactos);
		
		final Button buton1 =(Button) findViewById(R.id.button1);
		final Button buton2 =(Button) findViewById(R.id.button2);
		final Button buton3 =(Button) findViewById(R.id.button3);
		final Button buton4 =(Button) findViewById(R.id.button4);
		final Button buton5 =(Button) findViewById(R.id.button5);
		final Button buton6 =(Button) findViewById(R.id.button6);
		
		final Intent primera=new Intent(
				Secondcontactos.this,ContactosActivity.class);
		
		buton1.setOnClickListener(new Button.OnClickListener(){
			
			//hacemos que el boton con un clic cambie su nombre capturandolo.	
				public void onClick(View v){
					String b1="Tibi";
					primera.putExtra("Tibi", b1);
					startActivity(primera);
				}	
				}
		);
		buton2.setOnClickListener(new Button.OnClickListener(){
			
			//hacemos que el boton con un clic cambie su nombre capturandolo.	
				public void onClick(View v){
					String b2="Alicante";
					primera.putExtra("Tibi", b2);
					startActivity(primera);
				}	
				}
		);
		buton3.setOnClickListener(new Button.OnClickListener(){
			
			//hacemos que el boton con un clic cambie su nombre capturandolo.	
				public void onClick(View v){
					String b3="Barcelona";
					primera.putExtra("Tibi", b3);
					startActivity(primera);
				}	
				}
		);
		buton4.setOnClickListener(new Button.OnClickListener(){
			
			
				public void onClick(View v){
					String b4="Madrid";
					primera.putExtra("Tibi", b4);
					startActivity(primera);
				}	
				}
		);
		buton5.setOnClickListener(new Button.OnClickListener(){
			
			//hacemos que el boton con un clic cambie su nombre capturandolo.	
				public void onClick(View v){
					String b5="New York";
					primera.putExtra("Tibi", b5);
					startActivity(primera);
				}	
		}
				
		);
		buton6.setOnClickListener(new Button.OnClickListener(){
			
			//hacemos que el boton con un clic cambie su nombre capturandolo.	
				public void onClick(View v){
					String b6="Paris";
					primera.putExtra("Tibi", b6);
					startActivity(primera);
				}	
				}
		);
		
		
	
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secondcontactos, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
