package fr.oc.TPJavaEE.bo;

public class Rodeur extends Personnage{

	public Rodeur(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
	public void attaqueBasique(){
		
	}
	
	//Attaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.

	public void attaqueSpeciale(){
	}

	@Override
	public String toString() {
		return String.format(
				"Niarkniark je suis le Rodeur joueur a definir "+super.toString());
	}

	
	
}
