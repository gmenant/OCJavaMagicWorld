package fr.oc.tpjavaobject.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.oc.tpjavaobject.util.ControleValeurs;

public class ControleValeursTest {

	/**
	 * Vérifie que le resultat est bien compris entre 1 et 100
	 */
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
	 
	/**
	 * Vérifie que le resultat est bien compris entre 0 et 100
	 */
	@Test
	public void verif0A100Test() {
		Integer valeur = 0;
		assertTrue("Valeur correcte a été refusée",ControleValeurs.verif0A100(valeur));
		valeur = 100;
		assertTrue("Valeur correcte a été refusée",ControleValeurs.verif0A100(valeur));

		valeur = -5;
		assertFalse("Valeur inferieure à 0 a été acceptée",ControleValeurs.verif0A100(valeur));
		valeur = 101;
		assertFalse("Valeur supérieure à 3 a été acceptée",ControleValeurs.verif0A100(valeur));
		
	}
	
	/**
	 * Vérifie que le resultat est bien compris entre 1 et 3
	 */
	@Test
	public void verif1A3Test() {
		Integer valeur = 1;
		assertTrue("Valeur correcte a été refusée",ControleValeurs.verif1A3(valeur));
		valeur = 3;
		assertTrue("Valeur correcte a été refusée",ControleValeurs.verif1A3(valeur));
		
		valeur = 0;
		assertFalse("Valeur 0 a été acceptée",ControleValeurs.verif1A3(valeur));
		valeur = -5;
		assertFalse("Valeur inferieure à 0 a été acceptée",ControleValeurs.verif1A3(valeur));
		valeur = 101;
		assertFalse("Valeur supérieure à 100 a été acceptée",ControleValeurs.verif1A3(valeur));
	
	}
	
	/**
	 * Vérifie que le resultat est bien la somme des 
	 */
	@Test
	public void verifStatTest() {
		Integer force, agilite, intelligence, niveau;
		niveau=90;
		force = 30;
		agilite = 30;
		intelligence = 30; 
		assertTrue("l'ensemble des elements n'est pas égal au niveau",ControleValeurs.verifStat(force, agilite, intelligence, niveau));
		intelligence = 40;
		assertFalse("la somme est fausse mais elle est bien acceptée",ControleValeurs.verifStat(force, agilite, intelligence, niveau));
	}

}
