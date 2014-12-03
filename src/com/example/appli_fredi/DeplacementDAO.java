package com.example.appli_fredi;

import java.util.ArrayList;

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
		String req = "INSERT INTO deplacement(date,motif,intitule,nbKm,montantPeage,nbRepas,nbNuites,association)"
				+ " VALUES('"
				
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
				+ unDeplacement.getNbNuites()
				+ "'"
				+ ",'"
				+ unDeplacement.getAssociation()+ "');";

		Log.d("Messages", req);
		bdd.execSQL(req);
		bdd.close();
	}

	public ArrayList<Deplacement> getDeplacementsAsList() {
		ArrayList<Deplacement> lesDeplacements = new ArrayList<Deplacement>();
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery(
				"SELECT * FROM deplacement", null);
		curseur.moveToFirst();
		while (!curseur.isAfterLast()){
			
			Deplacement leDeplacement = new Deplacement(curseur.getLong(0),
					curseur.getString(1), curseur.getString(2),
					curseur.getString(3), curseur.getString(4),
					curseur.getString(5), curseur.getString(6),
					curseur.getString(7), curseur.getString(8));
			lesDeplacements.add(leDeplacement);
			curseur.moveToNext();

		}

		return lesDeplacements;
	}

	public Cursor getDeplacementsAsCursor() {
		ArrayList<Deplacement> lesDeplacements = new ArrayList<Deplacement>();
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery(
				"SELECT * FROM deplacement", null);

		return curseur;
	}

	public void SuppDeplacement(int id){
		
		SQLiteDatabase bdd = accessBDD.getWritableDatabase();
		String req = "DELETE FROM deplacement where _id ="+ id;
		Log.d("Messages", req);
		bdd.execSQL(req);
		bdd.close();
	
	}
	public void ModifDeplacement(String newIntitule, int id){
		SQLiteDatabase bdd = accessBDD.getWritableDatabase();
		String req = "UPDATE deplacement SET intitule = newIntitule where _id="+id ;
		Log.d("Messages", req);
		bdd.execSQL(req);
		bdd.close();
		
	}
}
