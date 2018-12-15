package fr.oc.tpjavaobject.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.oc.tpjavaobject.bo.Guerrier;
import fr.oc.tpjavaobject.bo.Personnage;

public class GuerrierTest {
	
	@Test
	public void testAttaqueBasique() {
		Personnage guerrier = new Guerrier(90, 30, 30, 30, 1);
		Personnage joueurPassif = new Guerrier(90, 30, 30, 30, 2);
		Integer vie = joueurPassif.getVie();
		guerrier.attaqueBasique(joueurPassif);
		if(joueurPassif.getVie()==vie){
			fail("l'action n'a pas d'effet");
		}
		if(joueurPassif.getVie()>vie){
			fail("l'action ajoute de la vie");
		}

	}

}
