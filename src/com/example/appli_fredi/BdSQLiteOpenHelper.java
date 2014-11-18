package com.example.appli_fredi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class BdSQLiteOpenHelper extends SQLiteOpenHelper {
	
	private String requeteUtilisateurs = "create table utilisateurs ("
			+ "idU INTEGER PRIMARY KEY AUTOINCREMENT,"
			+ "nom TEXT NOT NULL,"
			+ "prenom TEXT NOT NULL" 
			+ "adresse TEXT NOT NULL"+");";
	
	public BdSQLiteOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(requeteUtilisateurs);
	}
	
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}
}
