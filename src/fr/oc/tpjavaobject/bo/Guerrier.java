package fr.oc.tpjavaobject.bo;

public class Guerrier extends Personnage{

	public Guerrier(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
	}
	
	//Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.
	public String attaqueBasique(Personnage joueurPassif){
		Integer force = this.getForce();
		joueurPassif.setVie(joueurPassif.getVie()-force);
		
		return String.format("Joueur %d utilise Coup d’Épée et inflige %d dommages%nJoueur %d perd %d points de vie",this.getNumPersonnage(), force, joueurPassif.getNumPersonnage(),force);
		
		 
		
	}
	
	//Attaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. 
	//Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.
	public String attaqueSpeciale(Personnage joueurPassif){
		Integer coup = this.getForce()*2;
		Integer contreCoup = this.getForce()/2;
		
		this.setVie(this.getVie()-contreCoup);
		joueurPassif.setVie(joueurPassif.getVie()-coup);
		
		return String.format("Joueur %d utilise Coup de Rage et inflige %d dommages%nJoueur %d perd %d points de vie%nJoueur %d perd %d points de vie%n",this.getNumPersonnage(), coup, this.getNumPersonnage(),contreCoup,joueurPassif.getNumPersonnage(),coup);
		
	} 

	@Override
	public String toString() {
		return String.format(
				"Woarg je suis le Guerrier Joueur %s ",super.toString());
	}
}
