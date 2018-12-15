package fr.oc.tpjavaobject.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.oc.tpjavaobject.util.ControleValeurs;

public class ControleValeursTest {

	@Test
	public void verif1A100Test() {
		Integer valeur = 1;
		assertTrue("Valeur correcte a été refusée",ControleValeurs.verif1A100(valeur));
		valeur = 100;
		assertTrue("Valeur correcte a été refusée",ControleValeurs.verif1A100(valeur));
		
		valeur = 0;
		assertFalse("Valeur 0 a été acceptée",ControleValeurs.verif1A100(valeur));
		valeur = -5;
		assertFalse("Valeur inferieure à 0 a été acceptée",ControleValeurs.verif1A100(valeur));
		valeur = 101;
		assertFalse("Valeur supérieure à 100 a été acceptée",ControleValeurs.verif1A100(valeur));
		
	}
	
	@Test
	public void verif0A100Test() {
	}
	
	@Test
	public void verif1A3Test() {
	}
	
	@Test
	public void verifStatTest() {
	}

}
