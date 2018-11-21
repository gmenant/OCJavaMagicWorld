package fr.oc.TPJavaEE.bo;

public class Guerrier extends Personnage{

	public Guerrier(int niveau, int force, int agilite, int intelligence) {
		super(niveau, force, agilite, intelligence);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.
	public void attaqueBasique(){
	
	}
	
	//Attaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.
	public void attaqueSpeciale(){
	}
	
}
