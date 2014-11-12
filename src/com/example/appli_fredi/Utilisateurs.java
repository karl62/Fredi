package com.example.appli_fredi;

public class Utilisateurs {
	private int idU;
	private String nomU;
	private String prenomU;
	private String adresseU;
	
	public Utilisateurs (int id, String nom, String prenom, String adresse ){
		this.idU=id;
		this.nomU = nom;
		this.prenomU = prenom;
		this.adresseU = adresse;
		
	}
	public int getId(){
		return this.idU;
	}
	public String getNomU(){
		return this.nomU;
		
	}
	public String getPrenomU(){
		return this.prenomU;
	}
	public String getAdresse(){
		return this.adresseU;
	}

	public void setId(int nouvId){
		this.idU = nouvId;
	}
	public void setNom(String nouvNom){
		this.nomU = nouvNom;
	}
	public void setPrenom(String nouvPrenom){
		this.prenomU = nouvPrenom;
	}
	public void setAdresse ( String nouvAdresse){
		this.adresseU=nouvAdresse;
	}
	public String toString(){
		return "idU="+idU+",nomU="+nomU+",prenomU="+prenomU+",adresseU="+adresseU+"";
	}
}
