package com.example.appli_fredi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Simuler_montant extends ActionBarActivity {

	private double prixKm = 0.28;
	private double montant = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simuler_montant);

		Button btnValider = (Button) findViewById(R.id.btnValider);

		btnValider.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				EditText edtKm = (EditText) findViewById(R.id.edtNbKms);
				TextView Montant = (TextView) findViewById(R.id.textViewMontant);
				montant = Double.parseDouble(edtKm.getText().toString());
				montant = montant * prixKm;
				Montant.setText("Montant : " + Double.toString(montant));
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simuler_montant, menu);
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
