package fr.oc.tpjavaobject.buisness;

import fr.oc.tpjavaobject.bo.Personnage;

/**
 * 
 * @author Gabriel
 * Interface pour contraindre la calss personnage à avoir deux méthodes 
 */
public interface PersonnageInt {

	
	public String attaqueBasique(Personnage joueurPassif);
	public String attaqueSpeciale(Personnage joueurPassif);
}
