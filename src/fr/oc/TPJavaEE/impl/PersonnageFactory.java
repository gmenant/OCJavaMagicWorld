package fr.oc.TPJavaEE.impl;

import fr.oc.TPJavaEE.bo.Guerrier;
import fr.oc.TPJavaEE.bo.Mage;
import fr.oc.TPJavaEE.bo.Personnage;
import fr.oc.TPJavaEE.bo.Rodeur;

public class PersonnageFactory {
	
	public static Personnage setPersonnage(Integer choixClassePersonnage, Integer niveau, Integer force, Integer agilite, Integer intelligence, Integer numPersonnage){
		
		Personnage personnage = null;
		
		switch (choixClassePersonnage) {
		case 1:
			personnage = new Guerrier(niveau, force, agilite, intelligence, numPersonnage);
			break;
		case 2:
			personnage = new Rodeur(niveau, force, agilite, intelligence, numPersonnage);
			break;
		case 3:
			personnage = new Mage(niveau, force, agilite, intelligence, numPersonnage);
			break;
		default:
			break;
			
		
		}
		return personnage;
	}
}
