package com.example.appli_fredi;

import java.util.ArrayList;
import java.util.List;

import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.content.CursorLoader;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class Consulter extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consulter);
		ListView laListeDesDeplacements = (ListView) findViewById(R.id.listViewDeplacements);
		
		DeplacementDAO deplacements = new DeplacementDAO(this);		
		@SuppressWarnings("deprecation")
		SimpleCursorAdapter adapter = new SimpleCursorAdapter(Consulter.this, R.layout.view_resultat, deplacements.getDeplacementsAsCursor(),
				new String[] {"_id", "intitule"}, new int[] {R.id.txtId, R.id.txtIntitule});
		laListeDesDeplacements.setAdapter(adapter);
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
