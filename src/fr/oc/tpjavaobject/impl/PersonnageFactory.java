package fr.oc.tpjavaobject.impl;

import fr.oc.tpjavaobject.bo.Guerrier;
import fr.oc.tpjavaobject.bo.Mage;
import fr.oc.tpjavaobject.bo.Personnage;
import fr.oc.tpjavaobject.bo.Rodeur;

public final class PersonnageFactory {
	

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
