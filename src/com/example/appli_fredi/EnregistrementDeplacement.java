package com.example.appli_fredi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class EnregistrementDeplacement extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enregistrement_deplacement);
		Button btnEnregistrer = (Button) findViewById(R.id.btnEnregistrer);
		btnEnregistrer.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				
				 EditText edtAssoc = (EditText) findViewById(R.id.AssociationEdit);
	    		 EditText edtDate = (EditText) findViewById(R.id.DateEdit);
	    		 EditText edtMotif = (EditText) findViewById(R.id.MotifEdit);
	    		 EditText edtIntituleTrajet = (EditText) findViewById(R.id.IntituleTrajetEdit);
	    		 EditText edtNbKm = (EditText) findViewById(R.id.NbKmNumber);
	    		 EditText edtMtPeage = (EditText) findViewById(R.id.MtPeageNumber);
	    		 EditText edtNbRepas = (EditText) findViewById(R.id.NbRepasNumber);
	    		 EditText edtNbNuites = (EditText) findViewById(R.id.NbNuiteNumber);
	    		 
			}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enregistrement_deplacement, menu);
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