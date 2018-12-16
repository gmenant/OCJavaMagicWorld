package fr.oc.tpjavaobject.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.oc.tpjavaobject.bo.Guerrier;
import fr.oc.tpjavaobject.bo.Mage;
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
	
	@Test
	public void testattaqueSpeciale() {
		
		Personnage guerrier = new Guerrier(90, 30, 30, 30, 1);
		Personnage joueurPassif = new Guerrier(90, 30, 30, 30, 2);
		Integer vie = joueurPassif.getVie();
		Integer vieG = guerrier.getVie();
		
		guerrier.attaqueSpeciale(joueurPassif);
		
		if(joueurPassif.getVie() == vie){
			fail("L'action n'a pas eu d'effet");
		}
		if(joueurPassif.getVie() > vie){
			fail("L'action a eu l'effet inverse et a donné de la vie");
		}
		if(vie-joueurPassif.getVie()!=guerrier.getForce()*2){
			fail("Le nombre de points de dommages n'est pas le bon");
		}
		
		if(guerrier.getVie() == vieG){
			fail("L'action n'a pas eu d'effet");
		}
		if(guerrier.getVie() > vieG){
			fail("L'action a eu l'effet inverse et a donné de la vie");
		}
		if(vieG-guerrier.getVie()!=guerrier.getForce()/2){
			fail("Le nombre de points de dommages sur le guerrier n'est pas le bon");
		}
		
	}

}
