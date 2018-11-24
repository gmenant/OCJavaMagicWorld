package fr.oc.TPJavaEE.bo;

import fr.oc.TPJavaEE.buisness.PersonnageInt;

/**
 * @author Gabriel
 *
 */
public abstract  class  Personnage implements PersonnageInt {

	private int niveau;
	private int force;
	private int agilite;
	private int intelligence;
	private int vie;
	private int numPersonnage;
	
	public int getNumPersonnage() {
		return numPersonnage;
	}
	public void setNumPersonnage(int numPersonnage) {
		this.numPersonnage = numPersonnage;
	}
	public int getVie() {
		return vie;
	}
	public void setVie(int niveau) {
		this.vie = niveau*5;
	} 
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
	public Personnage(int niveau, int force, int agilite, int intelligence,int numPersonnage) {
		super();
		setNiveau(niveau);
		setForce(force);
		setAgilite(agilite);
		setIntelligence(intelligence);
		setVie(niveau);
		setNumPersonnage(numPersonnage);
	}
	@Override
	public String toString() {
		return String.format("niveau %d, je possède %d de vitalité, %d de force, %d d'agilité, et %d d'intelligence !",
				niveau, vie, force,	agilite, intelligence);
	}
	
	

	
	
}
