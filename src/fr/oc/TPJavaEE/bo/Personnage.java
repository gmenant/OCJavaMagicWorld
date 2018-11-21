package fr.oc.TPJavaEE.bo;

import fr.oc.TPJavaEE.buisness.PersonnageInt;

public abstract  class  Personnage implements PersonnageInt {

	private int niveau;
	private int force;
	private int agilite;
	private int intelligence;
	
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getAgilite() {
		return agilite;
	}
	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public Personnage(int niveau, int force, int agilite, int intelligence) {
		super();
		setNiveau(niveau);
		setForce(force);
		setAgilite(agilite);
		setIntelligence(intelligence);
	}
	

	
	
}
