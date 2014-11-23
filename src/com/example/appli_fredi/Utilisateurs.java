package com.example.appli_fredi;

public class Utilisateurs {

	private long id;
	private String nom;
	private String prenom;
	private String adresse;
	
	public Utilisateurs(long id,String nom,String prenom,String adresse){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public long getId(){
	
	return this.id;
	
	}
	public void setId(long id){
		this.id = id;
	}
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
		
	}
	public String getAdress(){
		return this.adresse;
	}
	public void setAdresse(String adresse){
		this.adresse = adresse;
	}
	
	
	public String toString(){
		return "Utilisateur [ name=" + nom + ", prenom=" + prenom
				+ ", adresse=" + adresse + "]";
	}
}
