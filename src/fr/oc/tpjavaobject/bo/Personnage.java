package fr.oc.tpjavaobject.bo;

import fr.oc.tpjavaobject.buisness.PersonnageInt;

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
	public void setVie(int vie) {
		this.vie = vie;
	} 
	public int getNiveau() {
		return vie;
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
	
	/**
	 * Constructeur
	 * @param niveau
	 * @param force
	 * @param agilite
	 * @param intelligence
	 * @param numPersonnage
	 */
	public Personnage(int niveau, int force, int agilite, int intelligence,int numPersonnage) {
		super();
		setNiveau(niveau);
		setForce(force);
		setAgilite(agilite);
		setIntelligence(intelligence);
		setVie(niveau*5);
		setNumPersonnage(numPersonnage);
	}
	
	/**
	 * ToString 
	 */
	@Override
	public String toString() {
		return String.format("%d niveau %d, je possède %d de vitalité, %d de force, %d d'agilité, et %d d'intelligence !",
				numPersonnage, niveau, vie, force,	agilite, intelligence);
	}
	
	

	
	
}
