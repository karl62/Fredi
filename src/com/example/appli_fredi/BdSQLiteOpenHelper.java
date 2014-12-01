package com.example.appli_fredi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class BdSQLiteOpenHelper extends SQLiteOpenHelper {
	private String requeteCreation = "CREATE TABLE utilisateur("
			+ "_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
			+ "nom TEXT NOT NULL," + "prenom TEXT NOT NULL,"
			+ "adresse TEXT NOT NULL);";

	private String requeteCreation2 = "CREATE TABLE deplacement("
			+ "_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
			+ "date TEXT NOT NULL," + "motif TEXT NOT NULL,"
			+ "intitule TEXT NOT NULL," + "nbKm DOUBLE NOT NULL,"
			+ "montantPeage DOUBLE NOT NULL," + "nbRepas INTEGER NOT NULL,"
			+ "nbNuites INTEGER NOT NULL,"
			+ "association TEXT NOT NULL);";

	public BdSQLiteOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(requeteCreation);
		db.execSQL(requeteCreation2);

		// db.execSQL("INSERT INTO utilisateur(_id,nom,prenom,adresse) VALUES(1,'test','test','test');");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
}