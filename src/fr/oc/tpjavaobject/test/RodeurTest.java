package fr.oc.tpjavaobject.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.oc.tpjavaobject.bo.Personnage;
import fr.oc.tpjavaobject.bo.Rodeur;

public class RodeurTest {

	@Test
	public void testAttaqueBasique() {
		Personnage rodeur = new Rodeur(90, 30, 30, 30, 1);
		Personnage joueurPassif = new Rodeur(90, 30, 30, 30, 2);
		Integer vie = joueurPassif.getVie();
		rodeur.attaqueBasique(joueurPassif);
		if(joueurPassif.getVie()==vie){
			fail("l'action n'a pas d'effet");
		}
		if(joueurPassif.getVie()>vie){
			fail("l'action ajoute de la vie");
		}

	}
	
	@Test
	public void testAttaqueSpeciale() {
		Personnage rodeur = new Rodeur(90, 30, 30, 30, 1);
		Personnage joueurPassif = new Rodeur(90, 30, 30, 30, 2);
		Integer agilite = rodeur.getAgilite();
		
		rodeur.attaqueSpeciale(joueurPassif);
		
		if(rodeur.getAgilite()==agilite){
			fail("l'action n'a pas d'effet");
		}
		if(rodeur.getAgilite()<agilite){
			fail("l'action a retiré de l'agilité");
		}

	}

}
