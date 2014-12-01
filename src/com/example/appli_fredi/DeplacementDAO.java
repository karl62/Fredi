package com.example.appli_fredi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DeplacementDAO {
	private BdSQLiteOpenHelper accessBDD;

	public DeplacementDAO(Context context) {
		accessBDD = new BdSQLiteOpenHelper(context, "bddtest", null, 1);

	}

	public void addDeplacement(Deplacement unDeplacement) {
		SQLiteDatabase bdd = accessBDD.getWritableDatabase();
		String req = "INSERT INTO deplacement(association,date,motif,intitule,nbKm,montantPeage,nbRepas,nbNuites)"
				+ " VALUES('"
				+ unDeplacement.getAssociation()
				+ "'"
				+ ",'"
				+ unDeplacement.getDate()
				+ "'"
				+ ", '"
				+ unDeplacement.getMotif()
				+ "'"
				+ ",'"
				+ unDeplacement.getIntitule()
				+ "'"
				+ ", '"
				+ unDeplacement.getNbKm()
				+ "'"
				+ ", '"
				+ unDeplacement.getMontantPeage()
				+ "'"
				+ ", '"
				+ unDeplacement.getNbRepas()
				+ "'"
				+ ", '"
				+ unDeplacement.getNbNuites() + "');";

		Log.d("Messages", req);
		bdd.execSQL(req);
		bdd.close();
	}

	public Deplacement getDeplacement() {
		Deplacement unDeplacement = null;
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery(
				"SELECT * FROM deplacement", null);
		if (curseur.getCount() > 0) {
			curseur.moveToFirst();
			unDeplacement = new Deplacement(curseur.getLong(0),
					curseur.getString(1), curseur.getString(2),
					curseur.getString(3), curseur.getString(4),
					curseur.getString(5), curseur.getString(6), curseur.getString(7), curseur.getString(8));

		}

		return unDeplacement;
	}

}
