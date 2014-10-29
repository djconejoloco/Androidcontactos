package com.example.dondeestalistadecontactos;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContactosActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactos);
		final Button boton=(Button) findViewById(R.id.button1);
		final Button boton2=(Button) findViewById(R.id.button2);
		final EditText texto=(EditText) findViewById (R.id.editText1);
		
		Intent primera1=getIntent();
		texto.setText(primera1.getStringExtra("Tibi"));
		
		
		
	
		//Damos al boton  un lister 
		boton.setOnClickListener(new Button.OnClickListener(){
			
		//hacemos que el boton con un clic cambie su nombre capturandolo.	
			public void onClick(View v){
				try{
				//creamos variable textview para capturar el edittext
				TextView temp;
				temp=(TextView)findViewById(R.id.editText1);
				// creamos una variable string para capturar la variable textview y pasarla a string
				
				String a=temp.getText().toString();
	
				
								
				
				Intent mapa=new Intent(
					android.content.Intent.ACTION_VIEW,
					//añadimos la variable string para la busqueda
					Uri.parse("geo:0,0?q="+ a)
					
				);
				startActivity(mapa);
				}catch(Exception e){
					
				}
				}
			
				
		}
		
		
		);
		
		//para que el segundo botton lance la segunda ventana
		boton2.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v){
				Intent segunda=new Intent(ContactosActivity.this,
						Secondcontactos.class);
				startActivity(segunda);
				
			}
			
		
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contactos, menu);
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
