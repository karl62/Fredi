package com.example.appli_fredi;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity_Appli_Fredi extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity__appli__fredi);
		final Button loginButton = (Button) findViewById(R.id.btnValider);
		final Button inscriptionButton = (Button) findViewById(R.id.btnInscrire);
	    // Code pour passer a une vue.   
		loginButton.setOnClickListener(new OnClickListener() {
	    	   
	    	 public void onClick(View v){
	    		 Intent intent = new Intent(MainActivity_Appli_Fredi.this, Login.class);
	    		 startActivity(intent);
	    	 }
	       });
		 // Code pour passer a une vue. 
	       inscriptionButton.setOnClickListener(new OnClickListener() {
	    	   
		    	 public void onClick(View v){
		    		 Intent intent = new Intent(MainActivity_Appli_Fredi.this, Inscription.class);
		    		 startActivity(intent);
		    	 }
		       });
	       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity__appli__fredi, menu);
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
