package fr.oc.TPJavaEE.bo;

public class Guerrier extends Personnage{

	public Guerrier(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.
	public String attaqueBasique(Personnage joueurPassif){
		Integer force = this.getForce();
		joueurPassif.setVie(joueurPassif.getVie()-force);
		
		String attaque = "Joueur "+this.getNumPersonnage();
			attaque =  attaque +" utilise Coup d’Épée et inflige "+force+" dommages\n";
			attaque =  attaque + "Joueur "+joueurPassif.getNumPersonnage()+ " perd "+force+" points de vie";
		
		return attaque;
		
	}
	
	//Attaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. 
	//Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.
	public String attaqueSpeciale(Personnage joueurPassif){
		Integer coup = this.getForce()*2;
		Integer contreCoup = this.getForce()/2;
		
		this.setVie(this.getVie()-contreCoup);
		joueurPassif.setVie(joueurPassif.getVie()-coup);
		
		String attaque = "Joueur "+this.getNumPersonnage();
			attaque =  attaque +" utilise Coup de Rage et inflige "+coup+" dommages\n";
			attaque =  attaque + "Joueur "+this.getNumPersonnage()+ " perd "+contreCoup+" points de vie\n";
			attaque =  attaque + "Joueur "+joueurPassif.getNumPersonnage()+ " perd "+coup+" points de vie";
		
		return attaque;
	} 

	@Override
	public String toString() {
		return String.format(
				"Woarg je suis le Guerrier joueur "+super.toString());
	}
}
