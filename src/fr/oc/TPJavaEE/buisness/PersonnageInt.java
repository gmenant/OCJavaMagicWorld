package fr.oc.TPJavaEE.buisness;

import fr.oc.TPJavaEE.bo.Personnage;

public interface PersonnageInt {

	
	public String attaqueBasique(Personnage joueurPassif);
	public String attaqueSpeciale(Personnage joueurPassif);
}
