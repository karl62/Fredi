package com.example.appli_fredi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class UtilisateurDAO{
	
	private BdSQLiteOpenHelper accessBDD;
	
	public UtilisateurDAO(Context context){
		accessBDD = new BdSQLiteOpenHelper(context,"bddtest",null,1);
		
	}
	public void addViticulteur1(Utilisateurs unUti){
		SQLiteDatabase bdd = accessBDD.getWritableDatabase();
		String req="INSERT INTO utilisateur(nom,prenom,adresse)" +
				" VALUES('"+unUti.getNom()+"'" +
				", '"+unUti.getPrenom()+"'"+",'"+unUti.getAdress()+"');";
		
		Log.d("Messages",req);
		bdd.execSQL(req);
		bdd.close();
	}

	public Utilisateurs getUtilisateur(){
		Utilisateurs lUti = null;
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery("SELECT * FROM utilisateur",null);
		if(curseur.getCount()>0){
			curseur.moveToFirst();
			lUti = new Utilisateurs(curseur.getLong(0),curseur.getString(1),curseur.getString(2),curseur.getString(3));
			
		}
	
		return lUti;
	}
	
	
}