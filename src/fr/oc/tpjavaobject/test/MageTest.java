package fr.oc.tpjavaobject.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.oc.tpjavaobject.bo.Mage;
import fr.oc.tpjavaobject.bo.Personnage;

public class MageTest {

	
	@Test
	public void testattaqueSpeciale() {
		
		Personnage mage = new Mage(90, 30, 30, 30, 1);
		Personnage joueurPassif = new Mage(90, 30, 30, 30, 2);
		
		mage.attaqueSpeciale(joueurPassif);
		Integer vie = mage.getVie();
		if(mage.getVie()>vie){
			fail("Le nombre d epoints de vie dépasse le total des points de vie initial");
		}
		mage.setVie(vie/2);
		mage.attaqueSpeciale(joueurPassif);
		if(mage.getVie()==vie){
			fail("Le nombre de point de vie après l'action n'a pas été modifié");
		}
		if(mage.getVie()<vie/2){
			fail("Le nombre de point de vie après l'action a diminué");
		}
	}
	
	@Test
	public void testAttaqueBasique() {
		
		Personnage mage = new Mage(90, 30, 30, 30, 1);
		Personnage joueurPassif = new Mage(90, 30, 30, 30, 2);
		Integer vie = joueurPassif.getVie();

		mage.attaqueBasique(joueurPassif);
		if(joueurPassif.getVie()==vie){
			fail("l'action n'a pas d'effet");
		}
		if(joueurPassif.getVie()>vie){
			fail("l'action ajoute de la vie");
		}
	}

}
