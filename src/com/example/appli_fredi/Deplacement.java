package com.example.appli_fredi;

public class Deplacement {
	private long id;
	private String date;
	private String motif;
	private String intitule;
	private String nbKm;
	private String montantPeage;
	private String nbRepas;
	private String nbNuites;
	private String association;

	public Deplacement(long id, String association, String date, String motif, String intitule,
			String nbKm, String montantPeage, String nbRepas, String nbNuites) {
		this.id = id;
		this.association = association;
		this.date = date;
		this.motif = motif;
		this.intitule = intitule;
		this.nbKm = nbKm;
		this.montantPeage = montantPeage;
		this.nbRepas = nbRepas;
		this.nbNuites = nbNuites;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMotif() {
		return this.motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;

	}

	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getNbKm() {
		return this.nbKm;
	}

	public void setNbKm(double nbKm) {
		this.nbKm = nbKm;
	}
	
	public double getMontantPeage() {
		return this.montantPeage;
	}

	public void setMontantPeage(double montantPeage) {
		this.montantPeage = montantPeage;
	}
	
	public int getNbRepas() {
		return this.nbRepas;
	}

	public void setNbRepas(int nbRepas) {
		this.nbRepas = nbRepas;
	}
	
	public int getNbNuites() {
		return this.nbNuites;
	}

	public void setNbNuites(int nbNuites) {
		this.nbNuites = nbNuites;
	}
	
	public String toString() {
		return "Déplacement [ date=" + date + ", motif=" + motif
				+ ", intitule=" + intitule + ", nbKm=" + nbKm + ", montantPeage=" + montantPeage + ", nbRepas=" + nbRepas + ", nbNuites=" + nbNuites + "]";
	}

}
