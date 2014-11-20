package com.example.appli_fredi;

import android.support.v7.app.ActionBarActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Inscription extends ActionBarActivity {
	BdSQLiteOpenHelper accesBD;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inscription);
		accesBD = new BdSQLiteOpenHelper(this,"utilisateurs", null, 1);
		EditText edtNom = (EditText)findViewById(R.id.editTextIdentifiant);
		EditText edtPrenom = (EditText)findViewById(R.id.edtPrenom);
		EditText edtAdresse = (EditText)findViewById(R.id.edtAdresse);
        Button loginButton = (Button) findViewById(R.id.btnValider);
       loginButton.setOnClickListener(new OnClickListener() {
    	   
    	 public void onClick(View v){
    		 //ajoutUtilisateur();
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
	public void ajoutUtilisateur(){
		SQLiteDatabase db = accesBD.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		values.put("nom", "Seil");
		values.put("prenom", "karl");
		values.put("adresse", "test");
		db.insert("utilisateurs",null, values);
		
		
		
		//Toast.makeText(Inscription.this, "ok", Toast.LENGTH_LONG).show();
		
		 }
}
