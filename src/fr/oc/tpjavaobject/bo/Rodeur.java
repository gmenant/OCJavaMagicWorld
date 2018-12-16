package fr.oc.tpjavaobject.bo;

public class Rodeur extends Personnage{

	/**
	 * 
	 * @param niveau
	 * @param force
	 * @param agilite
	 * @param intelligence
	 * @param numPersonnage
	 */
	public Rodeur(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
	}
	
	/**
	 * Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
	 * 
	 *  @return void
	 */
	public String attaqueBasique(Personnage joueurPassif){

		Integer agilite = this.getAgilite();
		joueurPassif.setVie(joueurPassif.getVie()-agilite);
		
		return String.format("Joueur %d utilise Tir à l’Arc et inflige %d dommages%nJoueur %d perd %d points de vie",this.getNumPersonnage(), agilite, joueurPassif.getNumPersonnage(),agilite);
		
	}
	
	/**
	 *Attaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.
	 *
	 * @return void
	 */
	public String attaqueSpeciale(Personnage joueurPassif){
		
		int gain = getNiveau()/2;
		this.setAgilite(gain);
		
		return String.format("Joueur %d utilise Concentration et gagne %d en agilité",this.getNumPersonnage(), gain);

	}

	/**
	 * ToString 
	 */
	@Override
	public String toString() {
		return String.format(
				"Niarkniark je suis le Rodeur Joueur %s ",super.toString());
	}

	
	
}
