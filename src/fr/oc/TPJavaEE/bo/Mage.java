package fr.oc.TPJavaEE.bo;

public class Mage extends Personnage{

	public Mage(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.
	public String attaqueBasique(Personnage joueurPassif){
		
		//Calcul des données
		Integer intelligence = this.getIntelligence();
		joueurPassif.setVie(joueurPassif.getVie()-intelligence);
		
		//Affichage
		String attaque = "Joueur "+this.getNumPersonnage();
		attaque =  attaque +" utilise Boule de Feu et inflige "+intelligence+" dommages\n";
		attaque =  attaque +"Joueur "+joueurPassif.getNumPersonnage()+ " perd "+intelligence+" points de vie";

		return attaque;
		
	}
	
	//Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie.
	//Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
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
		
		String attaque = "Joueur "+this.getNumPersonnage();
		attaque =  attaque +" utilise Soin et gagne "+gain+" points de vie ";

		return attaque;
	}

	@Override
	public String toString() {
		return String.format(
				"Abracadabra je suis le Mage joueur a definir "+super.toString());
	}
}
