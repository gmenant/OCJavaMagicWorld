package fr.oc.tpjavaobject.bo;

public class Mage extends Personnage{
	
	/**
	 * 
	 * @param niveau
	 * @param force
	 * @param agilite
	 * @param intelligence
	 * @param numPersonnage
	 */
	public Mage(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
	}
	
	/**
	 * 	Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.
	 *
	 *@return void
	 */
	public String attaqueBasique(Personnage joueurPassif){
		
		//Calcul des données
		Integer intelligence = this.getIntelligence();
		joueurPassif.setVie(joueurPassif.getVie()-intelligence);
		
		//Affichage
		return String.format("Joueur %d utilise  Boule de Feu et inflige %d dommages%nJoueur %d perd %d points de vie",this.getNumPersonnage(), intelligence, joueurPassif.getNumPersonnage(),intelligence);
	}

	/**
	 * 	Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie.
	 *  Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
	 *  
	 *  @return void
	 */
	public String attaqueSpeciale(Personnage joueurPassif){
		int gain = getIntelligence()*2;
		
		Integer totalVie = this.getVie()+gain;
		Integer vieMax= this.getNiveau()*5;
		
		//Verification que le soin n'aille pas plus haut que le niveau max de points de vies
		if(totalVie>=vieMax){
			this.setVie(vieMax);				
		}else{
			this.setVie(totalVie);
		}
		
		return String.format("Joueur %d utilise Soin et gagne %d points de vie",this.getNumPersonnage(), gain);
		
	}

	/**
	 * ToString 
	 */
	@Override
	public String toString() {
		return String.format(
				"Abracadabra je suis le Mage Joueur %s",super.toString());
	}
}
