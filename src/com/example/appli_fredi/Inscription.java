package com.example.appli_fredi;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Inscription extends ActionBarActivity {
	
	UtilisateurDAO vitis = new UtilisateurDAO(this);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inscription);
		
		
		
		Button btnValider = (Button) findViewById(R.id.btnValider);

	   btnValider.setOnClickListener(new OnClickListener() {
    	   
	    	 public void onClick(View v){
	    		 EditText edtNom = (EditText) findViewById(R.id.editTextIdentifiant);
	    		 EditText edtPrenom = (EditText) findViewById(R.id.edtPrenom);
	    		 EditText edtAdresse = (EditText) findViewById(R.id.edtAdresse);
	    		 Utilisateurs unVitiTestAjout = new Utilisateurs(0,edtNom.getText().toString(),
	    				edtPrenom.getText().toString() ,edtAdresse.getText().toString());
	    			vitis.addViticulteur1(unVitiTestAjout);
	    			
	    			String uti = vitis.getUtilisateur().toString();
	    			
	    			Toast.makeText(Inscription.this, uti, Toast.LENGTH_LONG).show();
	    	 }
	       });
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
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
