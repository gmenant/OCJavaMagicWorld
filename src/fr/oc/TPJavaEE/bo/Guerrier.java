package fr.oc.TPJavaEE.bo;

public class Guerrier extends Personnage{

	public Guerrier(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.
	public String attaqueBasique(){
		String attaque = "Joueur "+this.getNumPersonnage()+" utilise Coup d’Épée et inflige "+getForce()+" dommages";
		
		return attaque;
		
	}
	
	//Attaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. 
	//Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.
	public String attaqueSpeciale(){
		int coup = getForce()*2;
		String attaque = "Joueur "+this.getNumPersonnage()+" utilise Coup de Rage "+coup+" dommages";
		this.setVie(getForce()/2);
		
		return attaque;
	} 

	@Override
	public String toString() {
		return String.format(
				"Woarg je suis le Guerrier joueur "+super.toString());
	}
}
