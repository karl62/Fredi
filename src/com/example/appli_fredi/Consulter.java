package com.example.appli_fredi;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class Consulter extends ActionBarActivity {

	DeplacementDAO unDepla = new DeplacementDAO(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consulter);
		ListView laListeDesDeplacements = (ListView) findViewById(R.id.listViewDeplacements);

		DeplacementDAO deplacements = new DeplacementDAO(this);
		@SuppressWarnings("deprecation")
		SimpleCursorAdapter adapter = new SimpleCursorAdapter(Consulter.this,
				R.layout.view_resultat, deplacements.getDeplacementsAsCursor(),
				new String[] { "_id", "intitule" }, new int[] { R.id.editId,
						R.id.editIntitule });
		laListeDesDeplacements.setAdapter(adapter);

		Button btnSuppDepla = (Button) findViewById(R.id.btnSupprimer);
		btnSuppDepla.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				EditText edtSupp = (EditText) findViewById(R.id.editSupp);
				String supp = edtSupp.getText().toString();

				if (supp.equals("")) {
					Toast.makeText(Consulter.this,
							"Veuillez saisir un id d'un déplacement",
							Toast.LENGTH_LONG).show();

				} else {

					unDepla.SuppDeplacement(Integer.parseInt(edtSupp.getText()
							.toString()));
					Toast.makeText(Consulter.this, "Suppresion ok ",
							Toast.LENGTH_LONG).show();
					Intent intent = new Intent(Consulter.this,
							Fonctionnalites.class);
					startActivity(intent);
				}

			}
		});

		;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.consulter, menu);
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
