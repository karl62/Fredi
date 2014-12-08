package com.example.appli_fredi;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Fonctionnalites extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fonctionnalites);
		final Button simulerButton = (Button) findViewById(R.id.btnSimuler);

		// Code pour passer a une vue.
		simulerButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(Fonctionnalites.this,
						Simuler_montant.class);
				startActivity(intent);
			}
		});

		final Button consulterButton = (Button) findViewById(R.id.btnConsulter);

		// Code pour passer a une vue.
		consulterButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(Fonctionnalites.this,
						Consulter.class);
				startActivity(intent);
			}
		});

		final Button deplacementButton = (Button) findViewById(R.id.btnDeplacement);
		// Code pour passer a une vue.
		deplacementButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(Fonctionnalites.this,
						EnregistrementDeplacement.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fonctionnalites, menu);
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
