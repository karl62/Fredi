package com.example.appli_fredi;

public class Deplacement {
	private long _id;
	private String date;
	private String motif;
	private String intitule;
	private String nbKm;
	private String montantPeage;
	private String nbRepas;
	private String nbNuites;
	private String association;

	public Deplacement(long id, String association, String date, String motif,
			String intitule, String nbKm, String montantPeage, String nbRepas,
			String nbNuites) {
		this._id = id;
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
		return this._id;
	}

	public String getAssociation() {
		return this.association;
	}

	public void setId(long id) {
		this._id = id;
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

	public String getNbKm() {
		return this.nbKm;
	}

	public void setNbKm(String nbKm) {
		this.nbKm = nbKm;
	}

	public String getMontantPeage() {
		return this.montantPeage;
	}

	public void setMontantPeage(String montantPeage) {
		this.montantPeage = montantPeage;
	}

	public String getNbRepas() {
		return this.nbRepas;
	}

	public void setNbRepas(String nbRepas) {
		this.nbRepas = nbRepas;
	}

	public String getNbNuites() {
		return this.nbNuites;
	}

	public void setNbNuites(String nbNuites) {
		this.nbNuites = nbNuites;
	}

	public String toString() {
		return "Déplacement [ date=" + date + ", motif=" + motif
				+ ", intitule=" + intitule + ", nbKm=" + nbKm
				+ ", montantPeage=" + montantPeage + ", nbRepas=" + nbRepas
				+ ", nbNuites=" + nbNuites + "]";
	}

}
